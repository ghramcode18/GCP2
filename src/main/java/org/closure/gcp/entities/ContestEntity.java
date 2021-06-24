package org.closure.gcp.entities;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="contest")
public class ContestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;


    @Column(nullable = false)
    private String name;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date start_date;


    @ManyToMany
    private List<UserEntity> participents;

    @OneToMany(mappedBy = "contest")
    private List<LevelEntity> levels;


    @ManyToMany
    private List<QuestionEntity> questions;

    @OneToMany(mappedBy = "contest")
    private List<RankEntity> rank;


    public ContestEntity() {
    }

    public ContestEntity(Integer id, String name, Date start_date, List<UserEntity> participents, List<LevelEntity> levels, List<QuestionEntity> questions, List<RankEntity> rank) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
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

    public ContestEntity id(Integer id) {
        setId(id);
        return this;
    }

    public ContestEntity name(String name) {
        setName(name);
        return this;
    }

    public ContestEntity start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public ContestEntity participents(List<UserEntity> participents) {
        setParticipents(participents);
        return this;
    }

    public ContestEntity levels(List<LevelEntity> levels) {
        setLevels(levels);
        return this;
    }

    public ContestEntity questions(List<QuestionEntity> questions) {
        setQuestions(questions);
        return this;
    }

    public ContestEntity rank(List<RankEntity> rank) {
        setRank(rank);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ContestEntity)) {
            return false;
        }
        ContestEntity contestEntity = (ContestEntity) o;
        return Objects.equals(id, contestEntity.id) && Objects.equals(name, contestEntity.name) && Objects.equals(start_date, contestEntity.start_date) && Objects.equals(participents, contestEntity.participents) && Objects.equals(levels, contestEntity.levels) && Objects.equals(questions, contestEntity.questions) && Objects.equals(rank, contestEntity.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, start_date, participents, levels, questions, rank);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", participents='" + getParticipents() + "'" +
            ", levels='" + getLevels() + "'" +
            ", questions='" + getQuestions() + "'" +
            ", rank='" + getRank() + "'" +
            "}";
    }








    
}
