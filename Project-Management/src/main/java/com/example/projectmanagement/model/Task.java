package com.example.projectmanagement.model;

import javax.persistence.*;

@Entity
@Table(name="TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long TID;
    @Column(name="START_DATE")
    private String Start_Date;
    @Column(name="END_DATE")
    private String End_Date;
    @Column(name="STATUS")
    private boolean status;

    public Task() {
        super();
    }

    public Task(Long TID, String start_Date, String end_Date,  boolean status) {
        this.TID = TID;
        this.Start_Date = start_Date;
        this.End_Date = end_Date;
        this.status = status;

    }

    public Long getTID() {
        return TID;
    }

    public void setTID(Long TID) {
        this.TID = TID;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String start_Date) {
        Start_Date = start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(String end_Date) {
        End_Date = end_Date;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
