package com.marvel.backend.persistence;

import com.marvel.backend.BackendApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BackendApplicationTest {

    @Test
    public void shouldBeExecuteBackendApplication() {
        BackendApplication.main(new String[] {});
    }
}
