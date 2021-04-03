package com.marvel.backend.comic;

import com.marvel.backend.comic.domain.Comic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class ComicTest {

    @Autowired
    private CharacterComicRepository characterComicRepository;

    @Test
    public void shouldBeSavedComic() {
        Comic comic = new Comic();
        comic.setTitle("Lorem ipsum");
        comic.setDigitalId(12345);
        comic.setIssueNumber(1);
        comic.setUpc("999999");
        comic.setDiamondCode("999999");
        comic.setFormat("Digital");
        comic.setPageCount(0);

        characterComicRepository.save(comic);

        Comic comicSaved = characterComicRepository.findByTitle("Lorem ipsum").orElse(null);

        assertThat(comicSaved).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidComic() {
        Comic comic = new Comic();
        comic.setTitle("Lorem ipsum");

        fail("Comic title cannot be blank", characterComicRepository.save(comic));
    }

    @Test
    public void shouldBeNotSavedRepeatedComic() {
        Comic comicTest = characterComicRepository.findById(1).orElse(null);

        fail("Comic title be repeated", characterComicRepository.save(comicTest));
    }
}
