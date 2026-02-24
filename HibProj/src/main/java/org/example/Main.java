package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

    SessionFactory sessionFactory = new Configuration()
            .addAnnotatedClass(org.example.Alien.class)
            .addAnnotatedClass(org.example.Laptop.class)
            .configure()
            .buildSessionFactory();
    Session session= sessionFactory.openSession();

    Laptop l1=session.get(Laptop.class,2);
        System.out.println(l1);


        session.close();

        Session session1= sessionFactory.openSession();
        Laptop l2=session1.get(Laptop.class,2);
        System.out.println(l2);
    sessionFactory.close();

    }
}