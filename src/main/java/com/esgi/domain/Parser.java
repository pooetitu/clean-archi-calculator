package com.esgi.domain;

public interface Parser<T> {
    T parse(String element);
}
