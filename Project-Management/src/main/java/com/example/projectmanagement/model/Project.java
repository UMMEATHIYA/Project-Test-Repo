package com.example.projectmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PID;
    @Column(name="PNAME")
    private String PNAME;
    @Column(name="MANAGERNAME")
    private String MANAGERNAME;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="PROJECTID")
    private List<User> users;

    public Project() {
        super();
    }

    public Project(Long PID, String PNAME, String MANAGERNAME, List<User> users) {
        this.PID = PID;
        this.PNAME = PNAME;
        this.MANAGERNAME = MANAGERNAME;
        this.users = users;
    }

    public Long getPID() {
        return PID;
    }

    public void setPID(Long PID) {
        this.PID = PID;
    }

    public String getPNAME() {
        return PNAME;
    }

    public void setPNAME(String PNAME) {
        this.PNAME = PNAME;
    }

    public String getMANAGERNAME() {
        return MANAGERNAME;
    }

    public void setMANAGERNAME(String MANAGERNAME) {
        this.MANAGERNAME = MANAGERNAME;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
