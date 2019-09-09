package com.plhk.jpms.repository.user.authclient;

import com.plhk.jpms.domain.user.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    It's a dummy class that simulates client for authorization service like OAuth
    and exists only for testing encapsulation in modules.
 */
public class FakeAuthClient {

    public User requestForUser(long id) {
        return fakeUserGenerator(id);
    }

    public List<User> requestForAll() {
        return Stream.generate(this::fakeUserGenerator)
                .limit(3)
                .collect(Collectors.toList());
    }

    private User fakeUserGenerator() {
        long fakeId = (long) (Math.random() * 100);
        return fakeUserGenerator(fakeId);
    }

    private User fakeUserGenerator(long fakeId) {
        return new User("John-" + fakeId);
    }
}
