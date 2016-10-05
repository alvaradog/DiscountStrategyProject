/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author alvar
 */
public class Customer {
    private String lastName;
    private String firstName;
    private String custId;

    public Customer(String firstName, String lastName, String custId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.custId = custId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "Customer{" + "lastName=" + lastName + ", firstName=" + firstName + ", custId=" + custId + '}';
    }
    
    
}
