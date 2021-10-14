package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "status")
public class Status {

    @Id
   @Column(name="id")
    private int id;

    @Column(name = "name")
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

    public enum currentStatusEnum {

        Active(1), Inactive(2);
        private int id;

        public int getId() {
            return this.id;
        }

        currentStatusEnum(Integer id) {
            this.id = id;
        }

    }

    public static Status getInstanceOf(int id) {
        Status status = new Status();
        status.setId(id);
        return status;
    }
}

