package com.ggingmin.lioncampus.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @Setter @ToString
@Table(name = "Courses")
public class Course {

    public Course() {
    }

    public Course(String title, String description, boolean paid) {
        this.title = title;
        this.description = description;
        this.paid = paid;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "paid")
    private boolean paid;
}
