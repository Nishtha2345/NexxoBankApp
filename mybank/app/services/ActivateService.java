package services;

import dao.DbConnector;
import dto.*;
import models.Status;
import models.User;

public class ActivateService {


    public ActivateResponseDto activateCustomer(Integer userId) {

        ActivateResponseDto activateResponse = new ActivateResponseDto();
        try {
            User user = User.find.byId(userId);

            if (user == null) {
                System.out.println("doesnt exist");
                activateResponse.setStatus(404);
                activateResponse.setMessage("user id doesnt exist");
                return activateResponse;
            }

            if (user.getStatus().getId() == Status.currentStatusEnum.Active.getId()) {
                activateResponse.setStatus(404);
                activateResponse.setMessage("User already activated");
                return activateResponse;
            }

            user.setStatus(Status.getInstanceOf(Status.currentStatusEnum.Active.getId()));
            DbConnector.update(user);
            activateResponse.setStatus(200);
            activateResponse.setMessage("user activated successfully");
        } catch (Exception e) {
            activateResponse.setStatus(500);
            activateResponse.setMessage("some exception occured");
        }

        return activateResponse;


    }
}




