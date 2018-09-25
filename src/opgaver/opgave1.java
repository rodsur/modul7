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
public class opgave1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer aCustomer = new Customer("Kurt",0);
        aCustomer.deposit(5);
        aCustomer.withdraw(4);
        System.out.println("Kurt har: " + aCustomer.balance + " penge på sin konto");
    }

}
