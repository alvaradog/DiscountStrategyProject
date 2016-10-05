
package discountstrategyproject;

public class Receipt {
    Customer customer;
    PersistenceStrategy db;
    LineItem [] lineItems = {
        new LineItem("null","null",0,0,0)
    };

    public Receipt(String custId, PersistenceStrategy db) {
        this.db = db;
        findCustomerById(custId);
    }
    
    public final Customer findCustomerById(String custId){
        return db.findCustomerById(custId);
    }
    
    public final void addLineItem(String productId, int quantity){
        String [] temp = new String [lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1]= "";
    }
}
