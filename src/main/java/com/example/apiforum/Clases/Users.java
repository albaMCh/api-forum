package com.example.apiforum.Clases;

import lombok.Data;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String  subName;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String picProfile;

    @Column
    private String createdAt;

    @Column
    private String lasLogin;

    @Column
    private String nusAnswer;

    @Column
    private String nusQuestion;

    @Column
    private String nusLike;

    @Column
    private String nusFollowers;

    @Column
    private String nusFollowed;

    @ManyToMany( fetch = FetchType.LAZY)
    @JoinTable(name ="user to roles", joinColumns = @JoinColumn(name ="user_id"),
            inverseJoinColumns = @JoinColumn(name ="roles_id"),
             uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "roles_id"})})
    private List<Role> roles;
}

