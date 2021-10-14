package services;


import dao.UserDao;
import dto.CustomerListResponseDto;
import dto.ViewListResponseDto;
import models.User;


import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class ViewListService {

    @Inject
    private UserDao userDao;

    public List<CustomerListResponseDto> viewList(Integer  roleId) {
        List<User> userList = userDao.getList(roleId);
        List<CustomerListResponseDto> customerListResponseDtoList = new ArrayList<>();
        for(User user : userList) {
            CustomerListResponseDto responseDto = new CustomerListResponseDto();

            responseDto.setFirstName(user.getFname());
            responseDto.setLastName(user.getLname());
            responseDto.setRole(user.getRoleType().getName());
            responseDto.setStatus(user.getStatus().getName());
            responseDto.setUserId(user.getId());
            responseDto.setAadhaarNo(user.getAadharNo());
            responseDto.setMobileNo(user.getMobileNo());

            customerListResponseDtoList.add(responseDto);
        }
        return customerListResponseDtoList;
    }
}
