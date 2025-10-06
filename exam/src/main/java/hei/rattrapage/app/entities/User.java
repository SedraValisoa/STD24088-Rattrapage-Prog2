package hei.rattrapage.app.entities;

public interface User {
    String id();
}

final class AnonymousUser implements User {

    private final String id;

    public AnonymousUser(String id) {
        this.id = id;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof User u) && id.equals(u.id());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

final class RegisteredUser implements User {

    private final String id, email, lastName, firstName;

    public RegisteredUser(
        String id,
        String email,
        String lastName,
        String firstName
    ) {
        this.id = id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof User u) && id.equals(u.id());
    }
}
