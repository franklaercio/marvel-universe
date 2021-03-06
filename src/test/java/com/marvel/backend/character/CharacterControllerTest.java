package com.marvel.backend.character;

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
public class CharacterControllerTest {

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
    void shouldBeCharacterReturnsHttpStatusOk() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturn404HttpStatusWhenInvalidRouter() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/character")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    void shouldBeReturnsHttpStatusOkWhenCharacterId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBeReturns409HttpStatusWhenInvalidCharacterId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/Hulk")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isConflict());
    }

    @Test
    void shouldBeReturnsHttpStatusOkCharacterComic() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/1/comics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBeReturn409HttpStatusCharacterComicWhenEnterTextId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/Hulk/comics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isConflict());
    }

    @Test
    void shouldBeReturnsHttpStatusOkCharacterEvent() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/1/events")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBeReturn400HttpStatusCharacterEventWhenEnterTextId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/Hulk/events")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isConflict());
    }

    @Test
    void shouldBeReturnsHttpStatusOkCharacterSeries() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/1/series")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBeReturn400HttpStatusCharacterSeriesWhenEnterTextId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/Hulk/series")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isConflict());
    }

    @Test
    void shouldBeReturnsHttpStatusOkCharacterStories() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/1/stories")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBeReturn400HttpStatusCharacterStoriesWhenEnterTextId() throws Exception {
        this.mockMvc.perform(
                get("/v1/public/characters/Hulk/stories")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isConflict());
    }

}
