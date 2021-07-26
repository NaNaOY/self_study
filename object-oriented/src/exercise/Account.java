package exercise;


import  java.util.Date;

public class Account {
 private int id = 0;
 private double balance = 0;
 private double annualInterestRate = 0;
 private Date dateCreated= new Date();
 private int count=0;
 
 public void account(){
  
 }
 
 public Account(){
  count++;
  this.id=count;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance(double balance) {
  this.balance = balance;
 }

 public double getAnnualInterestRate() {
  return annualInterestRate;
 }

 public void setAnnualInterestRate(double annualInterestRate) {
  this.annualInterestRate = annualInterestRate;
 }

 public Date getDateCreated() {
  return dateCreated;
 }
 
 public double getMonthlyInterestRate(){
  double MonthlyInterestRate;
  MonthlyInterestRate=annualInterestRate/12;
  return MonthlyInterestRate;
 }
 
 public double withDrad(double drad){
  balance = balance - drad;
  return balance;
 }
 
 public double deposit(double save){
  balance = balance + save;
  return balance;
 }

 @Override
 public String toString() {
  return "Account [id=" + id + ", balance=" + balance + ", getDateCreated()=" + getDateCreated()
    + ", getMonthlyInterestRate()=" + getMonthlyInterestRate() + "%]";
 }

}
