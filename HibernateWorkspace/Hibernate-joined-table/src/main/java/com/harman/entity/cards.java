package com.harman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ccd")

public class cards extends payment {

 @Column(name="cardnum")
 private int cardno;
 @Column(name="cardtype")
 private String card_type;
 
 public int getCardno() {
 return cardno;
 }
 public void setCardno(int cardno) {
 this.cardno = cardno;
 }
 public String getCard_type() {
 return card_type;
 }
 public void setCard_type(String card_type) {
 this.card_type = card_type;
 }
 } 
