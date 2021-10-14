package dao;

import models.RoleType;
import models.User;

public class RoleTypeDao {

    public RoleType findByName(String name) {

        RoleType roleType = RoleType.find.query().where()
                .eq("name","urvashi")
                .findOne();

        return roleType;
    }
}
