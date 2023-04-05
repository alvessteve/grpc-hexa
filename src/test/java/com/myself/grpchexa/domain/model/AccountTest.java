package com.myself.grpchexa.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void should_have_an_amount() {
        Account account = new Account();
        Assertions.assertThat(account).isNotNull();
    }
}
