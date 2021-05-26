package com.example.demo.tes;

import javax.persistence.*;

@Entity
@Table(name = "hh")
public class Person {
    @Id
    @GeneratedValue
    Long id;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
    @Column(name = "dd")
    int dd;

}
