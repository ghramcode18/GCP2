package org.closure.gcp.models;

import java.util.List;
import java.util.Objects;

import org.closure.gcp.entities.ContestEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.entities.UserEntity;

public class LevelModel {
 private Integer id;
 private List<UserEntity> user;
 private List<QuestionEntity> questions;
 private String level;
 private ContestEntity contest;


    public LevelModel() {
    }

    public LevelModel(Integer id, List<UserEntity> user, List<QuestionEntity> questions, String level, ContestEntity contest) {
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

    public LevelModel id(Integer id) {
        setId(id);
        return this;
    }

    public LevelModel user(List<UserEntity> user) {
        setUser(user);
        return this;
    }

    public LevelModel questions(List<QuestionEntity> questions) {
        setQuestions(questions);
        return this;
    }

    public LevelModel level(String level) {
        setLevel(level);
        return this;
    }

    public LevelModel contest(ContestEntity contest) {
        setContest(contest);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LevelModel)) {
            return false;
        }
        LevelModel levelModel = (LevelModel) o;
        return Objects.equals(id, levelModel.id) && Objects.equals(user, levelModel.user) && Objects.equals(questions, levelModel.questions) && Objects.equals(level, levelModel.level) && Objects.equals(contest, levelModel.contest);
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
