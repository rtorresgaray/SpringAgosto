package com.rtorres.springagosto.jdcb.helper;

import java.util.List;

public interface GenericDAO<T> {

    List<T> all();

    T find(Long id);

    void save(T t);

    void update(T t);

    void delete(Long id);
}
