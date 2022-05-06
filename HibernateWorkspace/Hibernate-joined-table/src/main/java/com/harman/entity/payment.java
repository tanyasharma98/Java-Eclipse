package com.harman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="pp")
@Inheritance(strategy=InheritanceType.JOINED)
public class payment {
 
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="payid")
 private int id;
 
 @Column(name="amount")
 private double amount;
 
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public double getAmount() {
 return amount;
 }
 public void setAmount(double amount) {
 this.amount = amount;
 }
} 
