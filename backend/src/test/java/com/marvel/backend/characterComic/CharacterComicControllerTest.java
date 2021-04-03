package com.marvel.backend.characterComic;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CharacterComicControllerTest {

    @Autowired
    private WebApplicationContext applicationContext;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Flyway flyway;

    @BeforeEach
    void setup() {
        this.flyway.clean();
        this.flyway.migrate();

        this.mockMvc = MockMvcBuilders
                .webAppContextSetup(applicationContext)
                .build();
    }

    @Test
    void shouldBeReturnsHttpStatusOkCharacterComic() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/1/comic")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBeReturn404HttpStatusCharacterComicWhenNotFoundCharacterId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/100/comic")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    void shouldBeReturn400HttpStatusCharacterComicWhenEnterTextId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/Hulk/comic")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }
}
