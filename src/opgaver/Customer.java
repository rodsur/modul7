/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

/**
 *
 * @author rodsur
 */
public class Customer {
    String name;
    int id;
    double balance;

    public Customer(String startName,int startId) {
        name = startName;
        id = startId;
        balance = 0;
    }

    public Customer(String startName, int startId, double startBalance) {
        name = startName;
        id = startId;
        balance = startBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}