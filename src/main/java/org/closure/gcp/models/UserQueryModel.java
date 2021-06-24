package org.closure.gcp.models;

import java.util.Objects;

import javax.persistence.Entity;


public class UserQueryModel {

    private String name;
    private String college_name;


    public UserQueryModel() {
    }

    public UserQueryModel(String name, String college_name) {
        this.name = name;
        this.college_name = college_name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege_name() {
        return this.college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public UserQueryModel name(String name) {
        setName(name);
        return this;
    }

    public UserQueryModel college_name(String college_name) {
        setCollege_name(college_name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserQueryModel)) {
            return false;
        }
        UserQueryModel userQueryModel = (UserQueryModel) o;
        return Objects.equals(name, userQueryModel.name) && Objects.equals(college_name, userQueryModel.college_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, college_name);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", college_name='" + getCollege_name() + "'" +
            "}";
    }

    
}
