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
@Table(name="answer")
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @ManyToOne(optional = true)
    private QuestionEntity question;

    @Column(nullable = false)
    private String status;

    @Column(nullable =false)
    private String answer;

    public AnswerEntity() {
    }

    public AnswerEntity(Integer id, QuestionEntity question, String status, String answer) {
        this.id = id;
        this.question = question;
        this.status = status;
        this.answer = answer;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public QuestionEntity getQuestion() {
        return this.question;
    }

    public void setQuestion(QuestionEntity question) {
        this.question = question;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public AnswerEntity id(Integer id) {
        setId(id);
        return this;
    }

    public AnswerEntity question(QuestionEntity question) {
        setQuestion(question);
        return this;
    }

    public AnswerEntity status(String status) {
        setStatus(status);
        return this;
    }

    public AnswerEntity answer(String answer) {
        setAnswer(answer);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AnswerEntity)) {
            return false;
        }
        AnswerEntity answerEntity = (AnswerEntity) o;
        return Objects.equals(id, answerEntity.id) && Objects.equals(question, answerEntity.question) && Objects.equals(status, answerEntity.status) && Objects.equals(answer, answerEntity.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, status, answer);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", question='" + getQuestion() + "'" +
            ", status='" + getStatus() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }



}
