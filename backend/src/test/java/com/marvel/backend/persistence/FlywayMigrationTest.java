package com.marvel.backend.persistence;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlywayMigrationTest {

    @Autowired
    private Flyway flyway;

    @Test
    public void shouldBeExecuteAutomaticFlywayMigration() {
        flyway.migrate();
    }
}
