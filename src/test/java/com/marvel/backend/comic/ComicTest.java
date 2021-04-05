package com.marvel.backend.comic;

import com.marvel.backend.comic.domain.Comic;
import com.marvel.backend.comic.infrastructure.ComicRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ComicTest {

    @Mock
    private ComicRepository comicRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldBeSavedComic() {
        Comic comic = Mockito.mock(Comic.class);
        comic.setTitle("Lorem ipsum");
        comic.setDigitalId(12345);
        comic.setIssueNumber(1);
        comic.setUpc("999999");
        comic.setDiamondCode("999999");
        comic.setFormat("Digital");
        comic.setPageCount(0);

        when(comicRepository.save(any(Comic.class))).thenReturn(comic);

        assertThat(comic.getId()).isNotNull();

        verify(comic, times(1)).getId();
    }

    @Test
    public void shouldBeNotSavedInvalidComic() {
        Comic comic = new Comic();

        comicRepository.save(comic);

        assertThat(comic.getId()).isNull();

        verify(comicRepository, times(1)).save(comic);
    }

}
