package dao;

import models.User;

import java.util.List;

public class UserDao {
    public void saveUser(User user){
        DbConnector.save(user);
}

public List<User> getList(Integer roleId) {
       List<User> userList = User.find.query().where().eq("roleType.id", roleId).findList();
       return userList;
}
}
