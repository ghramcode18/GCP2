package org.closure.gcp.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rank")
public class RankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @ManyToOne(optional = true)
    private UserEntity user;

    @Column(nullable=false)
    private int rank;

    @ManyToOne(optional = true)
    private ContestEntity contest;


    public RankEntity() {
    }

    public RankEntity(Integer id, UserEntity user, int rank, ContestEntity contest) {
        this.id = id;
        this.user = user;
        this.rank = rank;
        this.contest = contest;
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

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public ContestEntity getContest() {
        return this.contest;
    }

    public void setContest(ContestEntity contest) {
        this.contest = contest;
    }

    public RankEntity id(Integer id) {
        setId(id);
        return this;
    }

    public RankEntity user(UserEntity user) {
        setUser(user);
        return this;
    }

    public RankEntity rank(int rank) {
        setRank(rank);
        return this;
    }

    public RankEntity contest(ContestEntity contest) {
        setContest(contest);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RankEntity)) {
            return false;
        }
        RankEntity rankEntity = (RankEntity) o;
        return Objects.equals(id, rankEntity.id) && Objects.equals(user, rankEntity.user) && rank == rankEntity.rank && Objects.equals(contest, rankEntity.contest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, rank, contest);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", rank='" + getRank() + "'" +
            ", contest='" + getContest() + "'" +
            "}";
    }



    
}
