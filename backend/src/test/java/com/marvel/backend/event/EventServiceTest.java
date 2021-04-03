package com.marvel.backend.event;

import com.marvel.backend.event.infrastructure.EventRepository;
import com.marvel.backend.event.infrastructure.EventService;
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
public class EventServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private EventRepository eventRepository;

    private EventService eventService = Mockito.mock(EventService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.eventService = new EventService(eventRepository);
    }

    @Test
    void whenFindCharacterEventWithId1ShouldBeReturnResult() {
        //Character character = this.eventService.charactersEvents(1);
        //assertThat(character).isNotNull();
        fail("Not implemented");
    }

    @Test
    void whenFindCharacterEventNotSavedShouldBeReturnNull() {
        //Character character = this.eventService.charactersEvents(100);
        //assertThat(character).isNull();
        fail("Not implemented");
    }
}
