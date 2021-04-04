package com.marvel.backend.comic;

import com.marvel.backend.comic.domain.ComicDTO;
import com.marvel.backend.comic.infrastructure.ComicService;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@AutoConfigureMockMvc
public class ComicServiceTest {

    @Autowired
    private Flyway flyway;

    @Mock
    private ComicService comicService;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        MockitoAnnotations.openMocks(this);

        this.comicService = Mockito.mock(ComicService.class);
    }

    @Test
    void whenFindCharacterComicWithId1ShouldBeReturnResult() {
        List<ComicDTO> list = comicService.findByCharacterId(1);

        assertThat(list).isNotNull();

        verify(this.comicService, times(1)).findByCharacterId(1);
    }

    @Test
    void whenFindCharacterComicNotSavedShouldBeReturnEmpty() {
        List<ComicDTO> list = comicService.findByCharacterId(1);

        assertThat(list).isEmpty();

        verify(this.comicService, times(1)).findByCharacterId(1);
    }
}
