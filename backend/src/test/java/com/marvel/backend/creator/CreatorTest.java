package com.marvel.backend.creator;

import com.marvel.backend.creator.domain.Creator;
import com.marvel.backend.creator.infrastructure.CreatorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@AutoConfigureMockMvc
public class CreatorTest {

    @Mock
    private CreatorRepository creatorRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldBeSavedCreator() {
        Creator creator = Mockito.mock(Creator.class);
        creator.setName("Lorem ipsum");

        creatorRepository.save(creator);

        assertThat(creator.getId()).isNotNull();

        verify(creator, times(1)).getId();
    }

    @Test
    public void shouldBeNotSavedInvalidCreator() {
        Creator creator = new Creator();
        creator.setName("");

        creatorRepository.save(creator);

        assertThat(creator.getId()).isNull();

        verify(creatorRepository, times(1)).save(creator);
    }

}
