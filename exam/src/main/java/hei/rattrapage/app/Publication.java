package hei.rattrapage.app;

import hei.rattrapage.app.Message;
import hei.rattrapage.entities.User;
import java.time.Instant;

public record Publication(
    String id,
    String content,
    String Link,
    User author,
    Instant created_at
) {
    private List<Message> messages;

    public void getUserMessages(String userId) {
        System.out.println(
            messages
                .stream()
                .filter(message -> message.getAuthor().getId().equals(userId))
                .collect(Collectors.toList())
                .toString()
        );
    }
}
