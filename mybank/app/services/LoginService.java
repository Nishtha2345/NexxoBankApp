package services;

import dto.LoginRequestDto;
import dto.LoginResponseDto;
import models.User;

    public class LoginService {

        public static LoginResponseDto checkLogin(LoginRequestDto loginRequest) {
                LoginResponseDto responseDto = new LoginResponseDto();
                try{
                User user = User.find.byId(loginRequest.getUserid());
                if (user == null) {
                    System.out.println("doesnt exist");
                    responseDto.setStatus(404);
                    responseDto.setMessage("user id doesnt exist");
                }

                if (!user.getPassword().equals(loginRequest.getPassword())) {
                    System.out.println("incorrect password for user id" + loginRequest.getUserid());
                    System.out.println("****" + loginRequest.getPassword());
                    System.out.println("&&&&" + user.getPassword());
                    responseDto.setStatus(404);
                    responseDto.setMessage("Incorrect password");
                    return responseDto;
                }

                System.out.println("Login successful for user id" + loginRequest.getUserid());
                responseDto.setStatus(200);
                responseDto.setMessage("Login successful");
                responseDto.setRoleId(user.getRoleType().getId());
                responseDto.setUserId(user.getId());
            } catch (Exception e) {
                responseDto.setStatus(500);
                responseDto.setMessage("some exception occured");
            }
            return responseDto;
            }

        }


