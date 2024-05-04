package com.nct.port.primary.controller;

import com.nct.domain.internal.wallet.WalletId;
import com.nct.port.secondary.kafka.producer.TransactionHistoryClient;
import io.micronaut.context.ApplicationContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.UUID;

@Controller("/user")
public class UserController {

    @Inject
    ApplicationContext applicationContext;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        TransactionHistoryClient client = applicationContext.getBean(TransactionHistoryClient.class);
        client.makeTransactionHistory(new WalletId(UUID.randomUUID()), 10);
        return "Ok";
    }
}