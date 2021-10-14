package models;

import io.ebean.Finder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "role_type")
public class RoleType {


    @Id
    @Column(name = "id")
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

    public static final Finder<Integer, RoleType> find = new Finder<>(RoleType.class);

    public enum currentRoleTypeEnum {

        Admin(1), Customer(2);
        private int id;

        public int getId() {
            return this.id;
        }

        currentRoleTypeEnum(Integer id) {
            this.id = id;
        }


    }
    public static RoleType getInstanceOf(int id) {
        RoleType roleType = new RoleType();
        roleType.setId(id);
        return roleType;
    }
}
