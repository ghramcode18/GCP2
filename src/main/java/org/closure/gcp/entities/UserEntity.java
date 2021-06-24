package org.closure.gcp.entities;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.closure.gcp.models.Gender;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true)
    private String password;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date birthday;

    @Column(nullable = true)
    private String address; 
  
    @Column(nullable = true)
    private Gender gender;
    
    @Column(nullable = true)
    private String image;
    
    @ManyToOne(optional = true)
    private CollegeEntity college;
    
    @OneToMany(mappedBy = "user")
    private List<InterestEntity> interests;
    
    @OneToOne
    private ScoreEntity score;

   
    @ManyToOne(optional = true)
    private LevelEntity level;

    @ManyToMany
    private List<ContestEntity> contests;

    @OneToMany(mappedBy = "user")
    private List<RankEntity> rank;


    @OneToMany(mappedBy = "user")
    private List<FireBaseEntity> firebase;


    public UserEntity() {
    }

    public UserEntity(Integer id, String name, String email, String password, Date birthday, String address, CollegeEntity college, Gender gender, String image, List<InterestEntity> interests, ScoreEntity score, LevelEntity level, List<ContestEntity> contests, List<RankEntity> rank, List<FireBaseEntity> firebase) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.college = college;
        this.gender = gender;
        this.image = image;
        this.interests = interests;
        this.score = score;
        this.level = level;
        this.contests = contests;
        this.rank = rank;
        this.firebase = firebase;
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

    public CollegeEntity getCollege() {
        return this.college;
    }

    public void setCollege(CollegeEntity college) {
        this.college = college;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<InterestEntity> getInterests() {
        return this.interests;
    }

    public void setInterests(List<InterestEntity> interests) {
        this.interests = interests;
    }

    public ScoreEntity getScore() {
        return this.score;
    }

    public void setScore(ScoreEntity score) {
        this.score = score;
    }

    public LevelEntity getLevel() {
        return this.level;
    }

    public void setLevel(LevelEntity level) {
        this.level = level;
    }

    public List<ContestEntity> getContests() {
        return this.contests;
    }

    public void setContests(List<ContestEntity> contests) {
        this.contests = contests;
    }

    public List<RankEntity> getRank() {
        return this.rank;
    }

    public void setRank(List<RankEntity> rank) {
        this.rank = rank;
    }

    public List<FireBaseEntity> getFirebase() {
        return this.firebase;
    }

    public void setFirebase(List<FireBaseEntity> firebase) {
        this.firebase = firebase;
    }

    public UserEntity id(Integer id) {
        setId(id);
        return this;
    }

    public UserEntity name(String name) {
        setName(name);
        return this;
    }

    public UserEntity email(String email) {
        setEmail(email);
        return this;
    }

    public UserEntity password(String password) {
        setPassword(password);
        return this;
    }

    public UserEntity birthday(Date birthday) {
        setBirthday(birthday);
        return this;
    }

    public UserEntity address(String address) {
        setAddress(address);
        return this;
    }

    public UserEntity college(CollegeEntity college) {
        setCollege(college);
        return this;
    }

    public UserEntity gender(Gender gender) {
        setGender(gender);
        return this;
    }

    public UserEntity image(String image) {
        setImage(image);
        return this;
    }

    public UserEntity interests(List<InterestEntity> interests) {
        setInterests(interests);
        return this;
    }

    public UserEntity score(ScoreEntity score) {
        setScore(score);
        return this;
    }

    public UserEntity level(LevelEntity level) {
        setLevel(level);
        return this;
    }

    public UserEntity contests(List<ContestEntity> contests) {
        setContests(contests);
        return this;
    }

    public UserEntity rank(List<RankEntity> rank) {
        setRank(rank);
        return this;
    }

    public UserEntity firebase(List<FireBaseEntity> firebase) {
        setFirebase(firebase);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) && Objects.equals(name, userEntity.name) && Objects.equals(email, userEntity.email) && Objects.equals(password, userEntity.password) && Objects.equals(birthday, userEntity.birthday) && Objects.equals(address, userEntity.address) && Objects.equals(college, userEntity.college) && Objects.equals(gender, userEntity.gender) && Objects.equals(image, userEntity.image) && Objects.equals(interests, userEntity.interests) && Objects.equals(score, userEntity.score) && Objects.equals(level, userEntity.level) && Objects.equals(contests, userEntity.contests) && Objects.equals(rank, userEntity.rank) && Objects.equals(firebase, userEntity.firebase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, birthday, address, college, gender, image, interests, score, level, contests, rank, firebase);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", address='" + getAddress() + "'" +
            ", college='" + getCollege() + "'" +
            ", gender='" + getGender() + "'" +
            ", image='" + getImage() + "'" +
            ", interests='" + getInterests() + "'" +
            ", score='" + getScore() + "'" +
            ", level='" + getLevel() + "'" +
            ", contests='" + getContests() + "'" +
            ", rank='" + getRank() + "'" +
            ", firebase='" + getFirebase() + "'" +
            "}";
    }



    
   

   

}
