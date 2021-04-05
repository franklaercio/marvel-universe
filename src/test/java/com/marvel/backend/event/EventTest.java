package com.marvel.backend.event;

import com.marvel.backend.event.domain.Event;
import com.marvel.backend.event.infrastructure.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class EventTest {

    @Mock
    private EventRepository eventRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldBeSavedEvent() {
        Event event = Mockito.mock(Event.class);
        event.setName("Lorem ipsum");
        event.setDescription("Lorem ipsum dolor sit amet");
        event.setStart(new Date());
        event.setEnd(new Date());

        when(eventRepository.save(any(Event.class))).thenReturn(event);

        assertThat(event.getId()).isNotNull();

        verify(event, times(1)).getId();
    }

    @Test
    public void shouldBeNotSavedInvalidEventName() {
        Event event = new Event();
        event.setName("");

        eventRepository.save(event);

        assertThat(event.getId()).isNull();

        verify(eventRepository, times(1)).save(event);
    }

    @Test
    public void shouldBeNotSavedInvalidEventStart() {
        Event event = new Event();
        event.setName("Lorem ipsum");
        event.setStart(null);

        eventRepository.save(event);

        assertThat(event.getId()).isNull();

        verify(eventRepository, times(1)).save(event);
    }
}
