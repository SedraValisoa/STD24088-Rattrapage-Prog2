package hei.rattrapage.app;

import hei.rattrapage.app.entities.User;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Publication {

    private final String id;
    private final String link;
    private final User owner;
    private final Instant createdAt;
    private final List<Message> messages = new ArrayList<>();

    public Publication(String id, String link, User owner, Instant createdAt) {
        this.id = Objects.requireNonNull(id);
        this.link = Objects.requireNonNull(link);
        this.owner = Objects.requireNonNull(owner);
        this.createdAt = Objects.requireNonNullElseGet(createdAt, Instant::now);
    }

    public void addMessage(Message message) {
        messages.add(Objects.requireNonNull(message));
    }

    public Set<User> getAuthors() {
        return messages
            .stream()
            .map(Message::author)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public void printAuthors() {
        getAuthors().forEach(u -> System.out.println(u.toString()));
    }
}
