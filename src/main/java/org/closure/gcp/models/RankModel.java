package org.closure.gcp.models;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import org.closure.gcp.entities.ContestEntity;
import org.closure.gcp.entities.LevelEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.entities.RankEntity;
import org.closure.gcp.entities.UserEntity;

public class RankModel {
    private Integer id;
    private UserModel user;
    private int rank;
    private ContestModel contestModal;
   

    public RankModel() {
    }

    public RankModel(Integer id, UserModel user, int rank, ContestModel contestModal) {
        this.id = id;
        this.user = user;
        this.rank = rank;
        this.contestModal = contestModal;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserModel getUser() {
        return this.user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public ContestModel getContestModal() {
        return this.contestModal;
    }

    public void setContestModal(ContestModel contestModal) {
        this.contestModal = contestModal;
    }

    public RankModel id(Integer id) {
        setId(id);
        return this;
    }

    public RankModel user(UserModel user) {
        setUser(user);
        return this;
    }

    public RankModel rank(int rank) {
        setRank(rank);
        return this;
    }

    public RankModel contestModal(ContestModel contestModal) {
        setContestModal(contestModal);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RankModel)) {
            return false;
        }
        RankModel rankModel = (RankModel) o;
        return Objects.equals(id, rankModel.id) && Objects.equals(user, rankModel.user) && rank == rankModel.rank && Objects.equals(contestModal, rankModel.contestModal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, rank, contestModal);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", rank='" + getRank() + "'" +
            ", contestModal='" + getContestModal() + "'" +
            "}";
    }

}