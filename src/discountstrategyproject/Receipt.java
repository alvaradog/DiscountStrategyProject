
package discountstrategyproject;

public class Receipt {
    private Customer customer;
    private PersistenceStrategy db;
//    LineItem [] lineItems = {
//        new LineItem()
//    };

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
