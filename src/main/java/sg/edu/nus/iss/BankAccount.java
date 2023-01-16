package sg.edu.nus.iss;

import java.util.Date;

public class BankAccount {
    
    private final String accountNo;
    private String fullName;
    private double balance = 0.0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;
    
    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount(String accountNo, String fullName) {
        this.accountNo = accountNo;
        this.fullName = fullName;
    }

    public BankAccount(String accountNo, String fullName, double balance) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
    }

    public BankAccount(String accountNo, String fullName, double balance, boolean isActive, Date accountStartDate,
            Date accountEndDate) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }

    public String getAccountNo() {
        return accountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }

    public void showAccount(){

        System.out.println("Account No: " + accountNo);
        System.out.println("Fullname: " + fullName);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullName=" + fullName + ", balance=" + balance + ", isActive="
                + isActive + ", accountStartDate=" + accountStartDate + ", accountEndDate=" + accountEndDate + "]";
    }

    public void deposit(double amount){
        
        if(!isActive){
            throw new IllegalArgumentException("You cannot make a deposit to a closed account.\n");
        } 

        if(amount < 0){
            throw new IllegalArgumentException("You cannot make negative deposit\n");
        }
        else{
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(double amount){

        if(!isActive){
            throw new IllegalArgumentException("You cannot make a withdrawal from a closed account.\n");
        } 

        if(balance < amount){
            throw new IllegalArgumentException("Your balance is less than " + amount + "\n");
        }
        else{
            this.balance = this.balance - amount;
        }

    }

}
