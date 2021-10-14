package services;


import dto.TransactionHistoryResponseDto;
import models.Transaction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistoryService {

        public List<TransactionHistoryResponseDto> transactionHistoryService(Integer userId){

            List<Transaction> transactionList= Transaction.find.query().where()
                    .eq("userId.id",userId).findList();

            List<TransactionHistoryResponseDto>transactionHistoryResponseDtoList=new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            for(Transaction transaction: transactionList){

                TransactionHistoryResponseDto transactionHistoryResponseDto = new TransactionHistoryResponseDto();

                transactionHistoryResponseDto.setUserId(transaction.getUserId().getId());
                transactionHistoryResponseDto.setTransactionId(transaction.getId());
                transactionHistoryResponseDto.setTransactionTypeId(transaction.getTransactionType().getId());
                transactionHistoryResponseDto.setAmount(transaction.getAmount());
                transactionHistoryResponseDto.setCreatedOn(sdf.format(transaction.getCreatedOn()));
//                transactionHistoryResponseDto.setBankDetailsId(transaction
//                        .getBank().getId());
                transactionHistoryResponseDtoList.add(transactionHistoryResponseDto);

            }
            return transactionHistoryResponseDtoList;

        }
    }




