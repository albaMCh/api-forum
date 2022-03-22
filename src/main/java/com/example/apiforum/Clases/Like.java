package com.example.apiforum.Clases;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "likes")



public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String users;

    @Column
    private String id_question;

    @Column
    private String id_answer;

    @OneToMany( mappedBy = "likes", fetch = FetchType.LAZY)
    @JoinTable(name = "likes", joinColumns = @JoinColumn(name = "likes_id"),
            inverseJoinColumns = @JoinColumn(name ="likes_id"))

    private List<Like> like;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getId_question() {
        return id_question;
    }

    public void setId_question(String id_question) {
        this.id_question = id_question;
    }

    public String getId_answer() {
        return id_answer;
    }

    public void setId_answer(String id_answer) {
        this.id_answer = id_answer;
    }

    public List<Like> getLike() {
        return like;
    }

    public void setLike(List<Like> like) {
        this.like = like;
    }
}
