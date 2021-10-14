package models;


import io.ebean.Finder;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "password")
public class Password {

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private int user_id;
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "password")
    private String password;

    @Column(name = "created_on")
    private Date created_on;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public static final Finder<Integer, Password> find = new Finder<>(Password.class);
}
