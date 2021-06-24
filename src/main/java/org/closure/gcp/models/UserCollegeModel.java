package org.closure.gcp.models;

import java.util.Objects;

public class UserCollegeModel {
    private Integer uid;
    private Integer out_cid;
    private Integer in_cid;


    public UserCollegeModel() {
    }

    public UserCollegeModel(Integer uid, Integer out_cid, Integer in_cid) {
        this.uid = uid;
        this.out_cid = out_cid;
        this.in_cid = in_cid;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOut_cid() {
        return this.out_cid;
    }

    public void setOut_cid(Integer out_cid) {
        this.out_cid = out_cid;
    }

    public Integer getIn_cid() {
        return this.in_cid;
    }

    public void setIn_cid(Integer in_cid) {
        this.in_cid = in_cid;
    }

    public UserCollegeModel uid(Integer uid) {
        setUid(uid);
        return this;
    }

    public UserCollegeModel out_cid(Integer out_cid) {
        setOut_cid(out_cid);
        return this;
    }

    public UserCollegeModel in_cid(Integer in_cid) {
        setIn_cid(in_cid);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserCollegeModel)) {
            return false;
        }
        UserCollegeModel userCollegeModel = (UserCollegeModel) o;
        return Objects.equals(uid, userCollegeModel.uid) && Objects.equals(out_cid, userCollegeModel.out_cid) && Objects.equals(in_cid, userCollegeModel.in_cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, out_cid, in_cid);
    }

    @Override
    public String toString() {
        return "{" +
            " uid='" + getUid() + "'" +
            ", out_cid='" + getOut_cid() + "'" +
            ", in_cid='" + getIn_cid() + "'" +
            "}";
    }

}
