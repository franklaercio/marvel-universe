package com.marvel.backend.event;

import com.marvel.backend.event.domain.Event;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class EventTest {

    @Autowired
    private CharacterEventRepository characterEventRepository;

    @Test
    public void shouldBeSavedEvent() {
        Event event = new Event();
        event.setName("Lorem ipsum");
        event.setDescription("Lorem ipsum dolor sit amet");
        event.setStart(new Date());
        event.setEnd(new Date());

        characterEventRepository.save(event);

        Event eventSaved = characterEventRepository.findByName("Lorem ipsum").orElse(null);

        assertThat(eventSaved).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidEventName() {
        Event event = new Event();
        event.setName("");

        fail("Event name cannot be blank", characterEventRepository.save(event));
    }

    @Test
    public void shouldBeNotSavedInvalidEventStart() {
        Event event = new Event();
        event.setName("Lorem ipsum");

        fail("Event start cannot be blank", characterEventRepository.save(event));
    }

    @Test
    public void shouldBeNotSavedRepeatedEvent() {
        Event eventTest = characterEventRepository.findById(1).orElse(null);;

        fail("Event name cannot be repeated", characterEventRepository.save(eventTest));
    }
}
