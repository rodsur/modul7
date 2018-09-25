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
public class CustomerDatabase {
    Customer[] customers;
    
    public CustomerDatabase() {
        customers = new Customer[100];
    }
    
    public void addCustomer(Customer customer) {
        if (customer.id>customers.length) {
            System.out.println("Too high ID");
        } else if ( customer.id<0 ||
                customers[customer.id] != null) {
            System.out.println("nice try");
        } else {
            customers[customer.id] = customer;
        }
    }
    
    public void respectPrivacy(int id) {
        customers[id] = null;
    }
    
    public Customer[] getCustomers() {
        return customers;
    }
    
    public void leakData() {
        for (int i = 0; i<customers.length; i++) {
            if (customers[i] != null) {
                System.out.println("Kunde nr. " + i + " hedder " + customers[i].name);
            }
        }
    }
}
