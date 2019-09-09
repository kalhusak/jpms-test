package com.plhk.jpms.repository.core;

import java.util.List;

public interface Repository<T> {

    T findById(long id);

    List<T> findAll();
}
