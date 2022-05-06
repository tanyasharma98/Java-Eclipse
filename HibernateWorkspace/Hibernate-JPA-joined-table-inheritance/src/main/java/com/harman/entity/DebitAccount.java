package com.harman.entity;

import javax.persistence.Entity;

@Entity(name = "DebitAccount")
@PrimaryKeyJoinColumn(name = "account_id")
public class DebitAccount extends Account {

    private double overdraftFee;

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
}
