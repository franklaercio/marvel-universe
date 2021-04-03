package com.marvel.backend.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.TestPropertySource;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@TestPropertySource(properties = {
        "spring.flyway.enabled=false"
})
public class HibernateTest {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager entityManager;

    @Test
    void shouldBeInjectedComponentsAreNotNull() {
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(characterRepository).isNotNull();
    }

    @Test
    void shouldBeCharacterNameIsNotBlackWindow() {
        assertThat(characterRepository.findByName("Black Window Hibernate Test")).isNull();
    }

    @Test
    void shouldBeFindCharacterWhenSaved() {
        characterRepository.save(new UserEntity(
                "Lorem Ipsum",
                "dolor sit amet"));
        assertThat(characterRepository.findByName("Lorem Ipsum")).isNotNull();
    }
}
