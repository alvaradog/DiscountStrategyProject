
package discountstrategyproject;

public class Receipt {
    Customer customer;
    PersistenceStrategy db;
//    LineItem [] lineItems = {
//        new LineItem("null","null",0,0,0)
//    };
    LineItem lineItem;

    public Receipt(String custId, PersistenceStrategy db) {
        this.db = db;
        findCustomerById(custId);
    }
    
    public final Customer findCustomerById(String custId){
        return db.findCustomerById(custId);
    }
    
    public final void addLineItem(String productId, int quantity){
        LineItem item = new LineItem(db, productId, quantity);

    }
}
