package models;

import io.ebean.Finder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
    public class Transaction {

        @Id
        @Column(name = "id")
        private int id;

        @ManyToOne
        @JoinColumn(name = "user_id", referencedColumnName = "id")
        private User userId;

        @Column(name = "amount")
        private Float amount;

        @ManyToOne
        @JoinColumn(name = "transaction_type_id", referencedColumnName = "id")
        private TransactionType transactionType;

        @Column(name = "created_on")
        private Date createdOn;

//        @ManyToOne
//        @JoinColumn(name = "action_type_id", referencedColumnName = "id")
//        private int action;

        @ManyToOne
        @JoinColumn(name = "bank_details_id", referencedColumnName = "id")
        private Bank bank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
//    public int getAction() {
//        return action;
//    }
//
//    public void setAction(int action) {
//        this.action = action;
//    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public static final Finder<Integer, Transaction> find = new Finder<>(Transaction.class);


    }

