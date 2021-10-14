package models;

import io.ebean.Finder;

import javax.persistence.*;

@Entity(name="user")
public class Bank {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="account")
    private int ifsc;

    @Column(name="account")
    private String account;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIfsc() {
        return ifsc;
    }

    public void setIfsc(int ifsc) {
        this.ifsc = ifsc;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public static final Finder<Integer, Bank> find = new Finder<>(Bank.class);
}
