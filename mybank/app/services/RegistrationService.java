package services;
import dao.DbConnector;
import dao.UserDao;
import dto.RegistrationRequestDto;
import dto.RegistrationResponseDto;
import models.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Date;
import java.util.List;

@Singleton
public class RegistrationService {


    private final UserDao userDao;

    @Inject
    public RegistrationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public RegistrationResponseDto save(RegistrationRequestDto requestDto){
       RegistrationResponseDto responseDto = new RegistrationResponseDto();
       try {
           User user = new User();

           user.setFname(requestDto.getFirstName());
           user.setLname(requestDto.getLastName());
           user.setPassword(requestDto.getPassword());
           user.setAadharNo(requestDto.getAadhaarNo());
           user.setCreatedOn(new Date());
           user.setMobileNo(requestDto.getMobileNo());
           user.setEmail(requestDto.getEmail());

           Status status = Status.getInstanceOf(Status.currentStatusEnum.Active.getId());
           RoleType roleType = RoleType.getInstanceOf(RoleType.currentRoleTypeEnum.Customer.getId());

           user.setStatus(status);
           user.setRoleType(roleType);

           userDao.saveUser(user);


           responseDto.setStatus(200);
           responseDto.setMessage("Data saved successfully");
       } catch (Exception e ) {
           e.printStackTrace();
           responseDto.setStatus(500);
           responseDto.setMessage("Some exception occured");
       }
        return responseDto;

    }

    public void update(){
        User user = User.find.query().where()
                .eq("email","sanger705@gmail.com")
                .eq("id",1234)
                .findOne();

        user.setFname("urvashi");
        user.setLname("tyagi");
        user.setDob(new Date());
        user.setAadharNo("6459678678");
        user.setCreatedOn(new Date());
        user.setMobileNo("78458705");


        user.setEmail("urvashi.tyagi@gmail.com");
        DbConnector.update(user);
    }
}
