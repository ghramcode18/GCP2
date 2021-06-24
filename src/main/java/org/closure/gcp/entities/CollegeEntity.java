package org.closure.gcp.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class CollegeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(nullable = false)
    private String collegeName;

    @OneToMany(mappedBy = "college")
    private List<UserEntity> user;

    @Column(nullable = true)
    private String image;


    public CollegeEntity() {
    }

    public CollegeEntity(Integer id, String collegeName, List<UserEntity> user, String image) {
        this.id = id;
        this.collegeName = collegeName;
        this.user = user;
        this.image = image;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<UserEntity> getUser() {
        return this.user;
    }

    public void setUser(List<UserEntity> user) {
        this.user = user;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CollegeEntity id(Integer id) {
        setId(id);
        return this;
    }

    public CollegeEntity collegeName(String collegeName) {
        setCollegeName(collegeName);
        return this;
    }

    public CollegeEntity user(List<UserEntity> user) {
        setUser(user);
        return this;
    }

    public CollegeEntity image(String image) {
        setImage(image);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CollegeEntity)) {
            return false;
        }
        CollegeEntity collegeEntity = (CollegeEntity) o;
        return Objects.equals(id, collegeEntity.id) && Objects.equals(collegeName, collegeEntity.collegeName) && Objects.equals(user, collegeEntity.user) && Objects.equals(image, collegeEntity.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, collegeName, user, image);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", collegeName='" + getCollegeName() + "'" +
            ", user='" + getUser() + "'" +
            ", image='" + getImage() + "'" +
            "}";
    }



}
