package services;

import dao.DbConnector;
import dto.DeactivateRequestDto;
import dto.DeactivateResponseDto;
import models.Status;
import models.User;

public class DeactivateService {

    public DeactivateResponseDto deactivateCustomer(Integer userId) {

    DeactivateResponseDto deactivateResponse = new DeactivateResponseDto();

    try {
        User user = User.find.byId(userId);
        if (user == null) {
            System.out.println("doesnt exist");
            deactivateResponse.setStatus(404);
            deactivateResponse.setMessage("user id doesnt exist");
            return deactivateResponse;
        }

        if (user.getStatus().getId() == Status.currentStatusEnum.Inactive.getId())
        {
            deactivateResponse.setStatus(404);
            deactivateResponse.setMessage("user already deactivated");
            return deactivateResponse;
        }
        user.setStatus(Status.getInstanceOf(Status.currentStatusEnum.Inactive.getId()));

        DbConnector.update(user);
        deactivateResponse.setStatus(200);
        deactivateResponse.setMessage("user deactivated successfully");
    }
    catch(Exception e)
    {
        deactivateResponse.setStatus(500);
        deactivateResponse.setMessage("some exception occured");
    }

     return deactivateResponse;

    }
}
