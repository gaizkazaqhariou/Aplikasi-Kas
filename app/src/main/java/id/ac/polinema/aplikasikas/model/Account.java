package id.ac.polinema.aplikasikas.model;

import java.util.List;

public class Account {
    private String name;
    private int balance;
    private List<Transaction> transactions;

    public Account(String name, int balance, List<Transaction> transactions) {
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        if (transaction.getType() == Transaction.Type.CREDIT) {
            balance += transaction.getAmount();
        } else {
            balance -= transaction.getAmount();
        }
        this.transactions.add(transaction);
    }
}
