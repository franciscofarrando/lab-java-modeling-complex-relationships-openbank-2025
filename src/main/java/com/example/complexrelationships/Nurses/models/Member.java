package com.example.complexrelationships.Nurses.models;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(mappedBy = "chapter")
    @OneToMany(mappedBy = "chapter")
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "renewal_date")
    private String renewalDate;


    public Member() {
    }

    public Member(String name, Status status, String renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", renewalDate='" + renewalDate + '\'' +
                '}';
    }
}
