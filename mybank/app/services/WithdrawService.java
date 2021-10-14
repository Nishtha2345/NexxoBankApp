package services;


import dao.DbConnector;
import dto.WithdrawRequestDto;
import dto.WithdrawResponseDto;
import models.Transaction;
import models.TransactionType;
import models.User;
import play.libs.Json;

import java.util.Date;
import java.util.List;

public class WithdrawService {
    public WithdrawResponseDto withdrawCash(WithdrawRequestDto withdrawRequest) {

        WithdrawResponseDto withdrawResponse = new WithdrawResponseDto();
        if(withdrawRequest.getAmount()>0) {
            try {
                System.out.println("funding User for ID " + withdrawRequest.getId());
                System.out.println(Json.toJson(withdrawRequest));
                User user = User.find.byId(withdrawRequest.getId());
                if (user == null) {
                    System.out.println("doesnt exist");
                    withdrawResponse.setStatus(404);
                    withdrawResponse.setMessage("user id doesnt exist");
                }

                if (!user.getPassword().equals(withdrawRequest.getPassword())) {
                    System.out.println("incorrect password for user id" + withdrawRequest.getId());
                    System.out.println("****" + withdrawRequest.getPassword());
                    System.out.println("&&&&" + user.getPassword());
                    withdrawResponse.setStatus(404);
                    withdrawResponse.setMessage("Incorrect password");
                    return withdrawResponse;
                }

                List<Transaction> transaction = Transaction.find.query().where()
                        .eq("userId.id", withdrawRequest.getId()).findList();
                if (transaction == null) {
                    System.out.println("doesnt exist");
                    withdrawResponse.setStatus(404);
                    withdrawResponse.setMessage("No amount exists ");
                    return withdrawResponse;

                }
                Transaction transaction1 = new Transaction();
                transaction1.setCreatedOn(new Date());
                transaction1.setUserId(user);
                transaction1.setTransactionType(TransactionType.getInstanceOf(1));
                transaction1.setAmount(withdrawRequest.getAmount());
                DbConnector.save(transaction1);

                System.out.println("Payment Successful" + withdrawRequest.getAmount());
                withdrawResponse.setStatus(200);
                withdrawResponse.setMessage("Payment Successful");
            } catch (Exception e) {
                e.printStackTrace();
                withdrawResponse.setStatus(500);
                withdrawResponse.setMessage("some exception occured");
            }
        }
        else
        {
            withdrawResponse.setMessage("amount is not correct");
        }
        return withdrawResponse;

    }

}




