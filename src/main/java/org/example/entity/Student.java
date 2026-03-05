package org.example.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double fees;
    private String subName;

    public Student() {}

    public Student(String name, Double fees, String subName) {
        this.name = name;
        this.fees = fees;
        this.subName = subName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getFees() { return fees; }
    public void setFees(Double fees) { this.fees = fees; }

    public String getSubName() { return subName; }
    public void setSubName(String subName) { this.subName = subName; }
}
