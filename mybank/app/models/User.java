package models;

import io.ebean.Finder;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "fname")
    private String fname;

    @Column(name ="password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "lname")
    private String lname;

    @Column(name ="dob")
    private Date dob;

    @Column(name ="email")
    private String email;

    @Column(name ="aadhar_no")
    private String aadharNo;

    @ManyToOne
    @JoinColumn(name="status_id",referencedColumnName = "id")
    private Status status;

    @ManyToOne
    @JoinColumn(name="role_type_id", referencedColumnName = "id")
    private RoleType roleType;

    @Column(name ="created_on")
    private Date createdOn;

    @Column(name ="mobile_no")
    private String mobileNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public static final Finder<Integer, User> find = new Finder<>(User.class);

}

