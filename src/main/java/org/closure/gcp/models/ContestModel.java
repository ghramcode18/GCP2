package org.closure.gcp.models;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import org.closure.gcp.entities.LevelEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.entities.RankEntity;
import org.closure.gcp.entities.UserEntity;

public class ContestModel {
    private Integer id;
    private String nameOfContest;
    private Date start_date;
    private Date end_date;
    private List<UserEntity> participents;
    private List<LevelEntity> levels;
    private List<QuestionEntity> questions;
    private List<RankEntity> rank;

    public ContestModel() {
    }

    public ContestModel(Integer id, String nameOfContest, Date start_date, Date end_date, List<UserEntity> participents, List<LevelEntity> levels, List<QuestionEntity> questions, List<RankEntity> rank) {
        this.id = id;
        this.nameOfContest = nameOfContest;
        this.start_date = start_date;
        this.end_date = end_date;
        this.participents = participents;
        this.levels = levels;
        this.questions = questions;
        this.rank = rank;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfContest() {
        return this.nameOfContest;
    }

    public void setNameOfContest(String nameOfContest) {
        this.nameOfContest = nameOfContest;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<UserEntity> getParticipents() {
        return this.participents;
    }

    public void setParticipents(List<UserEntity> participents) {
        this.participents = participents;
    }

    public List<LevelEntity> getLevels() {
        return this.levels;
    }

    public void setLevels(List<LevelEntity> levels) {
        this.levels = levels;
    }

    public List<QuestionEntity> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }

    public List<RankEntity> getRank() {
        return this.rank;
    }

    public void setRank(List<RankEntity> rank) {
        this.rank = rank;
    }

    public ContestModel id(Integer id) {
        setId(id);
        return this;
    }

    public ContestModel nameOfContest(String nameOfContest) {
        setNameOfContest(nameOfContest);
        return this;
    }

    public ContestModel start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public ContestModel end_date(Date end_date) {
        setEnd_date(end_date);
        return this;
    }

    public ContestModel participents(List<UserEntity> participents) {
        setParticipents(participents);
        return this;
    }

    public ContestModel levels(List<LevelEntity> levels) {
        setLevels(levels);
        return this;
    }

    public ContestModel questions(List<QuestionEntity> questions) {
        setQuestions(questions);
        return this;
    }

    public ContestModel rank(List<RankEntity> rank) {
        setRank(rank);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ContestModel)) {
            return false;
        }
        ContestModel contestModel = (ContestModel) o;
        return Objects.equals(id, contestModel.id) && Objects.equals(nameOfContest, contestModel.nameOfContest) && Objects.equals(start_date, contestModel.start_date) && Objects.equals(end_date, contestModel.end_date) && Objects.equals(participents, contestModel.participents) && Objects.equals(levels, contestModel.levels) && Objects.equals(questions, contestModel.questions) && Objects.equals(rank, contestModel.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfContest, start_date, end_date, participents, levels, questions, rank);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nameOfContest='" + getNameOfContest() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", end_date='" + getEnd_date() + "'" +
            ", participents='" + getParticipents() + "'" +
            ", levels='" + getLevels() + "'" +
            ", questions='" + getQuestions() + "'" +
            ", rank='" + getRank() + "'" +
            "}";
    }


}