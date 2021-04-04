package com.marvel.backend.event;

import com.marvel.backend.event.domain.EventDTO;
import com.marvel.backend.event.infrastructure.EventService;
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
public class EventServiceTest {

    @Autowired
    private Flyway flyway;

    @Mock
    private EventService eventService ;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        MockitoAnnotations.openMocks(this);

        this.eventService = Mockito.mock(EventService.class);
    }

    @Test
    void whenFindCharacterEventWithId1ShouldBeReturnResult() {
        List<EventDTO> list = eventService.findByCharacterId(1);

        assertThat(list).isNotNull();

        verify(this.eventService, times(1)).findByCharacterId(1);
    }

    @Test
    void whenFindCharacterEventNotSavedShouldBeReturnNull() {
        List<EventDTO> list = eventService.findByCharacterId(1);

        assertThat(list).isEmpty();

        verify(this.eventService, times(1)).findByCharacterId(1);
    }
}
