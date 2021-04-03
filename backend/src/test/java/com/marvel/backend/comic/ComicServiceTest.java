package com.marvel.backend.comic;

import com.marvel.backend.comic.infrastructure.ComicRepository;
import com.marvel.backend.comic.infrastructure.ComicService;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class ComicServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private ComicRepository comicRepository;

    private ComicService comicService = Mockito.mock(ComicService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.comicService = new ComicService(comicRepository);
    }

    @Test
    void whenFindCharacterComicWithId1ShouldBeReturnResult() {
        //Character character = this.comicService.charactersComics(1);
        //assertThat(character).isNotNull();
        fail("Not implemented");
    }

    @Test
    void whenFindCharacterComicNotSavedShouldBeReturnNull() {
        //Character character = this.comicService.charactersComics(100);
        //assertThat(character).isNull();
        fail("Not implemented");
    }
}
