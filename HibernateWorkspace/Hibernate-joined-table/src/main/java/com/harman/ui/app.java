package com.harman.ui;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.harman.entity.cards;
import com.harman.entity.cheque;
import com.harman.entity.payment;
 
public class app 
{
public static void main( String[] args )
{
Configuration cfg= new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory s= cfg.buildSessionFactory();
Session sess= s.openSession();
sess.beginTransaction();
    payment payment= new payment();
payment.setAmount(6900);
   
        
cards card= new cards();
card.setCardno(645325);
card.setCard_type("Visa");
card.setAmount(1500);
        
cheque cheque=new cheque();
cheque.setAmount(1600);
cheque.setChqno(102265);
cheque.setChq_type("Order");
        
sess.save(payment);
sess.save(card);
sess.save(cheque);
sess.getTransaction().commit();
    
System.out.println("successfully inserted");
} 
} 
