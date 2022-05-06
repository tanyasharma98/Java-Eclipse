package com.harman.entity;

import javax.persistence.Entity;

@Entity(name = "CreditAccount")
@PrimaryKeyJoinColumn(name = "account_id")
public class CreditAccount extends Account {

    private double creditLimit;

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}