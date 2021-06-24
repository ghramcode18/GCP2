package org.closure.gcp.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "scores")
public class ScoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @OneToOne(mappedBy = "score")
    private UserEntity user;

    @Column(nullable = false)
    private String score;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date created_at;


    public ScoreEntity() {
    }

    public ScoreEntity(Integer id, UserEntity user, String score, Date created_at) {
        this.id = id;
        this.user = user;
        this.score = score;
        this.created_at = created_at;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public ScoreEntity id(Integer id) {
        setId(id);
        return this;
    }

    public ScoreEntity user(UserEntity user) {
        setUser(user);
        return this;
    }

    public ScoreEntity score(String score) {
        setScore(score);
        return this;
    }

    public ScoreEntity created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ScoreEntity)) {
            return false;
        }
        ScoreEntity scoreEntity = (ScoreEntity) o;
        return Objects.equals(id, scoreEntity.id) && Objects.equals(user, scoreEntity.user) && Objects.equals(score, scoreEntity.score) && Objects.equals(created_at, scoreEntity.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, score, created_at);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", score='" + getScore() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            "}";
    }




    

    
}
