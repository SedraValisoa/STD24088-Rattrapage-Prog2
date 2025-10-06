package hei.rattrapage.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import hei.rattrapage.app.Publication;
import hei.rattrapage.app.entities.User;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeEach
    public void setUp() {
        /** create a publication by user */
        User user = new User("USR000", "john.doe@example.com", "John", "Doe");
        Publication publication = new Publication(
            "PUB001",
            "Ma super publication",
            "link:https://example.com",
            user,
            Instant.now()
        );
        Assertions.assertNotNull(publication);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
