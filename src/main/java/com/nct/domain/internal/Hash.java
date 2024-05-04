package com.nct.domain.internal;

public interface Hash<T> {
    T hash(T t) throws Exception;
    boolean verify(T t1, T t2);
}
