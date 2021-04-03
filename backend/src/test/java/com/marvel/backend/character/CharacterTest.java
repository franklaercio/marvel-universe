package com.marvel.backend.character;

import com.marvel.backend.character.domain.Character;
import com.marvel.backend.character.infrastructure.CharacterRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CharacterTest {

    @Mock
    private CharacterRepository characterRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldBeSavedCharacter() {
        Character character = Mockito.mock(Character.class);
        character.setName("Lorem ipsum");
        character.setDescription("Lorem ipsum dolor sit amet");

        when(characterRepository.save(any(Character.class))).thenReturn(character);

        assertThat(character.getId()).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidCharacter() {
        Character character = new Character();
        character.setName("");
        character.setDescription("Lorem ipsum dolor sit amet");

        characterRepository.save(character);

        assertThat(character.getId()).isNull();

        verify(characterRepository, times(1)).save(character);
    }

}
