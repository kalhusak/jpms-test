package com.plhk.jpms.repository.user;


import com.plhk.jpms.domain.user.User;
import com.plhk.jpms.repository.core.Repository;
import com.plhk.jpms.repository.user.authclient.FakeAuthClient;

import java.util.List;

public class UserRepository implements Repository<User> {

    private FakeAuthClient authClient;

    public UserRepository() {
        this.authClient = new FakeAuthClient();
    }

    @Override
    public User findById(long id) {
        return authClient.requestForUser(id);
    }

    @Override
    public List<User> findAll() {
        return authClient.requestForAll();
    }
}
