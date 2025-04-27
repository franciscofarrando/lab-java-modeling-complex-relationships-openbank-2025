package com.example.complexrelationships.Nurses.models;

import jakarta.persistence.*;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Member president;
    @OneToMany(mappedBy = "chapter", fetch = FetchType.EAGER)
    private List<Member> members = new ArrayList<>();

    public Chapter() {
    }

    public Chapter(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", members=" + members +
                '}';
    }
}
