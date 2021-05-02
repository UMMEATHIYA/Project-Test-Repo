package com.example.projectmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UID;
    @Column(name="UNAME")
    private String NAME;
    @Column(name="DOMAIN")
    private String DOMAIN;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="USERID")
    private List<Task> task;

    public User() {
        super();
    }

    public User(Long UID, String NAME, String DOMAIN, List<Task> task) {
        this.UID = UID;
        this.NAME = NAME;
        this.DOMAIN = DOMAIN;
        this.task = task;
    }

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDOMAIN() {
        return DOMAIN;
    }

    public void setDOMAIN(String DOMAIN) {
        this.DOMAIN = DOMAIN;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }
}