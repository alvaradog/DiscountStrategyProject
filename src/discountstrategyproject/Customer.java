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

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        this.custId = custId;
    }
    
    
}
