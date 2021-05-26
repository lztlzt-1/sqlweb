package com.example.demo.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.orm.jpa.*;
import javax.persistence.EntityManagerFactory;
import javax.swing.text.html.parser.Entity;

@Configuration
public class HibernateConfiguration {


    public SessionFactory sessionFactory(@Qualifier("entityManagerFactory")EntityManagerFactory emf){
        return  emf.unwrap(SessionFactory.class);
    }
//    @Bean
//    public EntityManagerFactory entityManagerFactory(){
//        return entityManagerFactory();
//    }

}
