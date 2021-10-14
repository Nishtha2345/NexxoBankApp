package services;

import dao.DbConnector;
import dao.UserDao;
import dto.*;

import models.Transaction;
import models.TransactionType;
import models.User;

import java.util.Date;

public class DepositService {
    public static DepositResponseDto depositMoney(DepositRequestDto depositRequest) {

        DepositResponseDto depositResponse = new DepositResponseDto();
        try {
            User user = User.find.byId(depositRequest.getUserId());
            if (user == null) {
                System.out.println("doesnt exist");
                depositResponse.setStatus(404);
                depositResponse.setMessage("user id doesnt exist");
            }

            Transaction transaction = new Transaction();
            transaction.setCreatedOn(new Date());
            transaction.setUserId(user);
            transaction.setAmount(depositRequest.getAmount());
            transaction.setTransactionType(TransactionType.getInstanceOf(TransactionType.transactionTypeEnum.CREDIT.getId()));
            DbConnector.save(transaction);


            depositResponse.setStatus(200);
            depositResponse.setMessage("Payment Successful");
        } catch (Exception e) {
            depositResponse.setStatus(500);
            depositResponse.setMessage("some Exception occured");
        }

        return depositResponse;


    }
}
