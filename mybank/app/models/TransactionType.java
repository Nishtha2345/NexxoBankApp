package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_type")
public class TransactionType {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;

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

    public enum transactionTypeEnum {

        DEBIT(1), CREDIT(2);
        private int id;

        public int getId() {
            return this.id;
        }

        transactionTypeEnum(Integer id) {
            this.id = id;
        }

    }

    public static TransactionType getInstanceOf(int id) {
        TransactionType status = new TransactionType();
        status.setId(id);
        return status;
    }
}
