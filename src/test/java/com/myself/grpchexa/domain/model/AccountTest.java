package com.myself.grpchexa.domain.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void should_exist() {
        Account account = new Account(10, "Esteban");
        assertThat(account).isNotNull();
    }

    @Test
    void should_have_an_amount() {
        int amount = 10;
        Account account = new Account(amount, "Esteban");
        assertThat(account.amount()).isEqualTo(amount);
    }

    @Test
    void should_have_an_holder() {
        String holder = "Esteban";
        Account account = new Account(10, holder);
        assertThat(account.holder()).isEqualTo(holder);
    }
}
