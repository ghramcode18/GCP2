package org.closure.gcp.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "levels")
public class LevelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    
    
    @OneToMany(mappedBy = "level")
    private List<UserEntity> user;

    @OneToMany(mappedBy = "level")
    private List<QuestionEntity> questions;

    @Column(nullable = false)
    private String level;

    @ManyToOne(optional = true)
    private ContestEntity contest;


    public LevelEntity() {
    }

    public LevelEntity(Integer id, List<UserEntity> user, List<QuestionEntity> questions, String level, ContestEntity contest) {
        this.id = id;
        this.user = user;
        this.questions = questions;
        this.level = level;
        this.contest = contest;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<UserEntity> getUser() {
        return this.user;
    }

    public void setUser(List<UserEntity> user) {
        this.user = user;
    }

    public List<QuestionEntity> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ContestEntity getContest() {
        return this.contest;
    }

    public void setContest(ContestEntity contest) {
        this.contest = contest;
    }

    public LevelEntity id(Integer id) {
        setId(id);
        return this;
    }

    public LevelEntity user(List<UserEntity> user) {
        setUser(user);
        return this;
    }

    public LevelEntity questions(List<QuestionEntity> questions) {
        setQuestions(questions);
        return this;
    }

    public LevelEntity level(String level) {
        setLevel(level);
        return this;
    }

    public LevelEntity contest(ContestEntity contest) {
        setContest(contest);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LevelEntity)) {
            return false;
        }
        LevelEntity levelEntity = (LevelEntity) o;
        return Objects.equals(id, levelEntity.id) && Objects.equals(user, levelEntity.user) && Objects.equals(questions, levelEntity.questions) && Objects.equals(level, levelEntity.level) && Objects.equals(contest, levelEntity.contest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, questions, level, contest);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", questions='" + getQuestions() + "'" +
            ", level='" + getLevel() + "'" +
            ", contest='" + getContest() + "'" +
            "}";
    }


    
    
}
