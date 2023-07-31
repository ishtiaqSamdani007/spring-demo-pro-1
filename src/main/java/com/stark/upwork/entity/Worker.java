package com.stark.upwork.entity;


import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Worker")
public class Worker {

    @Id
    @SequenceGenerator(
            name="Pupil_sequence",
            sequenceName="Pupil_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "Pupil_sequence"
    )
    private Long id;

    @NonNull
    private String name;

    private String surname;

    private String position;

    public void setId(Long id) {
        this.id = id;
    }

    public Worker() {
    }

    public Worker(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }
}
