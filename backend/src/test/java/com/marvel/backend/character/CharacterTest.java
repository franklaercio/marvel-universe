package com.marvel.backend.character;

import com.marvel.backend.character.domain.Character;

import com.marvel.backend.character.infrastructure.CharacterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class CharacterTest {

    @Autowired
    private CharacterRepository characterRepository;

    @Test
    public void shouldBeSavedCharacter() {
        Character character = new Character();
        character.setName("Lorem ipsum");
        character.setDescription("Lorem ipsum dolor sit amet");

        characterRepository.save(character);

        Character characterSaved = characterRepository.findByName("Lorem ipsum").orElse(null);

        assertThat(characterSaved).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidCharacter() {
        Character character = new Character();
        character.setName("");
        character.setDescription("Lorem ipsum dolor sit amet");

        fail("Character name cannot be blank", characterRepository.save(character));
    }

    @Test
    public void shouldBeNotSavedRepeatedCharacter() {
        Character characterTest = characterRepository.findById(1).orElse(null);

        fail("Character name cannot be repeated", characterRepository.save(Objects.requireNonNull(characterTest)));
    }
}
