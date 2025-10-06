package hei.rattrapage.app;

import hei.rattrapage.app.entities.User;
import java.time.Instant;

public record Message(String content, User author, Instant createdAt, boolean confidential) {
    public Message {
        if (content == null || content.isBlank()) throw new IllegalArgumentException("content is required");
        if (author == null) throw new IllegalArgumentException("author is required");
        if (createdAt == null) createdAt = Instant.now();
    }
}() { }
