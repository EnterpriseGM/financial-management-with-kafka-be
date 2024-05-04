package com.nct.domain.internal;

import io.micronaut.core.annotation.Creator;

import java.sql.Timestamp;

public class DefaultTimestamp {
    // init default as current system timestamp
    private static final Long currentTimeMillis = System.currentTimeMillis();

    public Timestamp createdAt;
    public Timestamp updatedAt;

    @Creator
    public DefaultTimestamp() {
        this.createdAt = new Timestamp(currentTimeMillis);
        this.updatedAt = new Timestamp(currentTimeMillis);
    }
}
