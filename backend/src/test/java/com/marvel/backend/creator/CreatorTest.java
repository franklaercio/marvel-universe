package com.marvel.backend.creator;

import com.marvel.backend.domain.Creator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class CreatorTest {

    @Autowired
    private CharacterCreatorRepository characterCreatorRepository;

    @Test
    public void shouldBeSavedCreator() {
        Creator creator = new Creator();
        creator.setName("Lorem ipsum");

        characterCreatorRepository.save(creator);

        Creator creatorSaved = characterCreatorRepository.findByName("Lorem ipsum");

        assertThat(creatorSaved).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidCreator() {
        Creator creator = new Creator();
        creator.setName("");

        fail("Creator name cannot be blank", characterCreatorRepository.save(creator));
    }

}
