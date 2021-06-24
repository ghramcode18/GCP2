package org.closure.gcp.models;

import java.util.Date;
import java.util.Objects;

public class UserModel {
    private Integer id;

    private String username;

    private String email;

    private String password;

    private Date birthday;

    
    private String address; 

    private String college;

    private String gender;


    public UserModel() {
    }

    public UserModel(Integer id, String username, String email, String password, Date birthday, String address, String college, String gender) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.college = college;
        this.gender = gender;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserModel id(Integer id) {
        setId(id);
        return this;
    }

    public UserModel username(String username) {
        setUsername(username);
        return this;
    }

    public UserModel email(String email) {
        setEmail(email);
        return this;
    }

    public UserModel password(String password) {
        setPassword(password);
        return this;
    }

    public UserModel birthday(Date birthday) {
        setBirthday(birthday);
        return this;
    }

    public UserModel address(String address) {
        setAddress(address);
        return this;
    }

    public UserModel college(String college) {
        setCollege(college);
        return this;
    }

    public UserModel gender(String gender) {
        setGender(gender);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserModel)) {
            return false;
        }
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) && Objects.equals(username, userModel.username) && Objects.equals(email, userModel.email) && Objects.equals(password, userModel.password) && Objects.equals(birthday, userModel.birthday) && Objects.equals(address, userModel.address) && Objects.equals(college, userModel.college) && Objects.equals(gender, userModel.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, birthday, address, college, gender);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", address='" + getAddress() + "'" +
            ", college='" + getCollege() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }


}
