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
public class opgave2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer aCustomer = new Customer("Kurt",0);
        Customer aCustomer2 = new Customer("Bo",2);
        Customer aCustomer3 = new Customer("Bent",2);
        Customer aCustomer4 = new Customer("Ib",-2);
        Customer aCustomer5 = new Customer("Bob",3);
        Customer aCustomer6 = new Customer("Umulius",1024);
        CustomerDatabase customers = new CustomerDatabase();
        customers.addCustomer(aCustomer);
        customers.addCustomer(aCustomer2);
        customers.addCustomer(aCustomer3);
        customers.addCustomer(aCustomer4);
        customers.addCustomer(aCustomer5);
        customers.addCustomer(aCustomer6);
        aCustomer.deposit(5);
        aCustomer.withdraw(4);
        System.out.println("Kurt har: " + aCustomer.balance + " penge på sin konto");
        System.out.println(customers.getCustomers()[1]);
        System.out.println(customers.getCustomers()[2]);
        customers.leakData();
        customers.respectPrivacy(3);
        customers.leakData();
    }
    
}
