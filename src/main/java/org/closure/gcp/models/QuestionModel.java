package org.closure.gcp.models;

import java.util.Objects;

public class QuestionModel {

    private Integer id;
    private String question;
    private String question_type;
    private String sup_file;
    private int pionts;


    public QuestionModel() {
    }

    public QuestionModel(Integer id, String question, String question_type, String sup_file, int pionts) {
        this.id = id;
        this.question = question;
        this.question_type = question_type;
        this.sup_file = sup_file;
        this.pionts = pionts;
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

    public QuestionModel id(Integer id) {
        setId(id);
        return this;
    }

    public QuestionModel question(String question) {
        setQuestion(question);
        return this;
    }

    public QuestionModel question_type(String question_type) {
        setQuestion_type(question_type);
        return this;
    }

    public QuestionModel sup_file(String sup_file) {
        setSup_file(sup_file);
        return this;
    }

    public QuestionModel pionts(int pionts) {
        setPionts(pionts);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof QuestionModel)) {
            return false;
        }
        QuestionModel questionModel = (QuestionModel) o;
        return Objects.equals(id, questionModel.id) && Objects.equals(question, questionModel.question) && Objects.equals(question_type, questionModel.question_type) && Objects.equals(sup_file, questionModel.sup_file) && pionts == questionModel.pionts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, question_type, sup_file, pionts);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", question='" + getQuestion() + "'" +
            ", question_type='" + getQuestion_type() + "'" +
            ", sup_file='" + getSup_file() + "'" +
            ", pionts='" + getPionts() + "'" +
            "}";
    }

    
}
