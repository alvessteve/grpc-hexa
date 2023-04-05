package com.myself.grpchexa.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void should_exist() {
        Account account = new Account(10);
        assertThat(account).isNotNull();
    }

    @Test
    void should_have_an_amount() {
        int amount = 10;
        Account account = new Account(amount);
        Assertions.assertThat(account.amount()).isEqualTo(amount);
    }
}
