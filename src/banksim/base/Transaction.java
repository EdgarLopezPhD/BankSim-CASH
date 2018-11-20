package banksim.base;

import java.io.Serializable;

public class Transaction implements Serializable {
    long step;
    date dateTransaction;
    long idTransaction;
    String idClient;
    String idBranch;
    String transactionType;
    double amount;
    boolean isSuspicious;
    boolean isFlaggedSuspicious;

    public Transaction(int step, date dateTransaction, int idTransaction, String idClient, String idBranch, String transactionType, double amount, boolean isSuspicious, boolean isFlaggedSuspicious) {
        this.step = step;
        this.dateTransaction = dateTransaction;
        this.idTransaction = idTransaction;
        this.idClient = idClient;
        this.idBranch = idBranch;
        this.transactionType = transactionType;
        this.amount = amount;
        this.isSuspicious = isSuspicious;
        this.isFlaggedSuspicious = isFlaggedSuspicious;
    }

    public long getStep() {
        return step;
    }

    public void setStep(long step) {
        this.step = step;
    }

    public date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isSuspicious() {
        return isSuspicious;
    }

    public void setSuspicious(boolean suspicious) {
        isSuspicious = suspicious;
    }

    public boolean isFlaggedSuspicious() {
        return isFlaggedSuspicious;
    }

    public void setFlaggedSuspicious(boolean flaggedSuspicious) {
        isFlaggedSuspicious = flaggedSuspicious;
    }
}
