package com.harman.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ch")

public class cheque extends payment {
 
 @Column(name="chqno") 
 private int chqno;
 @Column(name="chqtype")
 private String chq_type;
 
 public int getChqno() {
 return chqno;
 }
 public void setChqno(int chqno) {
 this.chqno = chqno;
 }
 public String getChq_type() {
 return chq_type;
 }
 public void setChq_type(String chq_type) {
 this.chq_type = chq_type;
 }
 } 
