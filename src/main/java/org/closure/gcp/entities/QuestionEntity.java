package org.closure.gcp.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="question")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;


    @Column(nullable=false)
    private String question;

    @Column(nullable=false)
    private String question_type;

    @ManyToOne(optional = true)
    private InterestEntity interest;


    @ManyToOne(optional = true)
    private LevelEntity level;

    @Column(nullable = true)
    private String sup_file;

    @Column(nullable = false)
    private int pionts;


    @ManyToMany
    private List<ContestEntity> contest;

    @OneToMany(mappedBy ="question")
    private List<AnswerEntity> answers;



    public QuestionEntity() {
    }

    public QuestionEntity(Integer id, String question, String question_type, InterestEntity interest, LevelEntity level, String sup_file, int pionts, List<ContestEntity> contest, List<AnswerEntity> answers) {
        this.id = id;
        this.question = question;
        this.question_type = question_type;
        this.interest = interest;
        this.level = level;
        this.sup_file = sup_file;
        this.pionts = pionts;
        this.contest = contest;
        this.answers = answers;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion_type() {
        return this.question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public InterestEntity getInterest() {
        return this.interest;
    }

    public void setInterest(InterestEntity interest) {
        this.interest = interest;
    }

    public LevelEntity getLevel() {
        return this.level;
    }

    public void setLevel(LevelEntity level) {
        this.level = level;
    }

    public String getSup_file() {
        return this.sup_file;
    }

    public void setSup_file(String sup_file) {
        this.sup_file = sup_file;
    }

    public int getPionts() {
        return this.pionts;
    }

    public void setPionts(int pionts) {
        this.pionts = pionts;
    }

    public List<ContestEntity> getContest() {
        return this.contest;
    }

    public void setContest(List<ContestEntity> contest) {
        this.contest = contest;
    }

    public List<AnswerEntity> getAnswers() {
        return this.answers;
    }

    public void setAnswers(List<AnswerEntity> answers) {
        this.answers = answers;
    }

    public QuestionEntity id(Integer id) {
        setId(id);
        return this;
    }

    public QuestionEntity question(String question) {
        setQuestion(question);
        return this;
    }

    public QuestionEntity question_type(String question_type) {
        setQuestion_type(question_type);
        return this;
    }

    public QuestionEntity interest(InterestEntity interest) {
        setInterest(interest);
        return this;
    }

    public QuestionEntity level(LevelEntity level) {
        setLevel(level);
        return this;
    }

    public QuestionEntity sup_file(String sup_file) {
        setSup_file(sup_file);
        return this;
    }

    public QuestionEntity pionts(int pionts) {
        setPionts(pionts);
        return this;
    }

    public QuestionEntity contest(List<ContestEntity> contest) {
        setContest(contest);
        return this;
    }

    public QuestionEntity answers(List<AnswerEntity> answers) {
        setAnswers(answers);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof QuestionEntity)) {
            return false;
        }
        QuestionEntity questionEntity = (QuestionEntity) o;
        return Objects.equals(id, questionEntity.id) && Objects.equals(question, questionEntity.question) && Objects.equals(question_type, questionEntity.question_type) && Objects.equals(interest, questionEntity.interest) && Objects.equals(level, questionEntity.level) && Objects.equals(sup_file, questionEntity.sup_file) && pionts == questionEntity.pionts && Objects.equals(contest, questionEntity.contest) && Objects.equals(answers, questionEntity.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, question_type, interest, level, sup_file, pionts, contest, answers);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", question='" + getQuestion() + "'" +
            ", question_type='" + getQuestion_type() + "'" +
            ", interest='" + getInterest() + "'" +
            ", level='" + getLevel() + "'" +
            ", sup_file='" + getSup_file() + "'" +
            ", pionts='" + getPionts() + "'" +
            ", contest='" + getContest() + "'" +
            ", answers='" + getAnswers() + "'" +
            "}";
    }
    
    





}
