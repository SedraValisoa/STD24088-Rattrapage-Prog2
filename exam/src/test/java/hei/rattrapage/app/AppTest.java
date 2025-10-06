package hei.rattrapage.app;

import static org.junit.jupiter.api.Assertions.*;

import hei.rattrapage.app.entities.*;
import java.time.Instant;
import org.junit.jupiter.api.Test;

public class PublicationTest {

    @Test
    void creationAndAdditionOfMessages() {
        User owner = new RegisteredUser(
            "USR000",
            "john.doe@example.com",
            "Doe",
            "John"
        );
        Publication pub = new Publication(
            "PUB001",
            "link:https://example.com",
            owner,
            Instant.now()
        );

        User anon1 = new AnonymousUser("ANON123");
        User anon2 = new AnonymousUser("ANON456");
        User reg2 = new RegisteredUser(
            "USR777",
            "jane.doe@example.com",
            "Doe",
            "Jane"
        );

        pub.addMessage(new Message("Salut", anon1, Instant.now(), false));
        pub.addMessage(new Message("Hello", reg2, Instant.now(), true));
        pub.addMessage(new Message("Re", anon1, Instant.now(), false));
        pub.addMessage(new Message("Yo", anon2, Instant.now(), false));

        assertEquals(3, pub.getAuthors().size());
    }
}
