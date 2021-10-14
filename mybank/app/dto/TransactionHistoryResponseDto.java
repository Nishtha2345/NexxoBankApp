package dto;

import java.util.Date;

public class TransactionHistoryResponseDto {
    private Integer userId;
    private float amount;
    private Integer transactionTypeId;
    private Integer transactionId;
    private String createdOn;
    private Integer bankDetailsId;


    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Integer getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Integer transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getBankDetailsId() {
        return bankDetailsId;
    }

    public void setBankDetailsId(Integer bankDetailsId) {
        this.bankDetailsId = bankDetailsId;
    }
}
