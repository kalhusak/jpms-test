package com.plhk.jpms.domain.user;

import com.plhk.jpms.domain.Person;

public class User implements Person {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
