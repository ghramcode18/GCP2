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
@Table(name="interest")
public class InterestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @ManyToOne(optional = true)
    private UserEntity user;

    @Column(nullable = false)
    private String interest;
    
    @Column(nullable=true)
    private String logo;

    @OneToMany(mappedBy = "interest")
    private List<QuestionEntity> questions;


    public InterestEntity() {
    }

    public InterestEntity(Integer id, UserEntity user, String interest, String logo, List<QuestionEntity> questions) {
        this.id = id;
        this.user = user;
        this.interest = interest;
        this.logo = logo;
        this.questions = questions;
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

    public String getInterest() {
        return this.interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<QuestionEntity> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }

    public InterestEntity id(Integer id) {
        setId(id);
        return this;
    }

    public InterestEntity user(UserEntity user) {
        setUser(user);
        return this;
    }

    public InterestEntity interest(String interest) {
        setInterest(interest);
        return this;
    }

    public InterestEntity logo(String logo) {
        setLogo(logo);
        return this;
    }

    public InterestEntity questions(List<QuestionEntity> questions) {
        setQuestions(questions);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InterestEntity)) {
            return false;
        }
        InterestEntity interestEntity = (InterestEntity) o;
        return Objects.equals(id, interestEntity.id) && Objects.equals(user, interestEntity.user) && Objects.equals(interest, interestEntity.interest) && Objects.equals(logo, interestEntity.logo) && Objects.equals(questions, interestEntity.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, interest, logo, questions);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", interest='" + getInterest() + "'" +
            ", logo='" + getLogo() + "'" +
            ", questions='" + getQuestions() + "'" +
            "}";
    }
    
}
