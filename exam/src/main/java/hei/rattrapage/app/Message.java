package hei.rattrapage.app;

import hei.rattrapage.entities.User;
import java.time.Instant;

public record Message(
    String content,
    User user,
    Instant date,
    boolean isPrivate,
    Publication publication
) {
    public Message(
        String content,
        User user,
        Instant date,
        boolean isPrivate,
        Publication publication
    ) {
        this(content, user, date, isPrivate, publication);
    }

    public User getAuthor() {
        return user;
    }
}
