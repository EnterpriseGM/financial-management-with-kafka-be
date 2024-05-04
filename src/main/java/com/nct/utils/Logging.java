package com.nct.utils;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public abstract class Logging {
    protected final Logger log = getLogger(this.getClass().getName());
}
