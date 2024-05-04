package com.nct.port.primary.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/health-check")
public class HeathCheckController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Ok";
    }
}