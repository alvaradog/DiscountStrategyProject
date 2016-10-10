package discountstrategyproject;

public class Receipt {
    private OutputStrategy output;
    private Customer customer;
    private PersistenceStrategy db;
    private int transactionNumber = 1;
//    LineItem [] lineItems = {
//        new LineItem()
//    };

    public Receipt(String custId, PersistenceStrategy db) {
        this.db = db;
        this.customer=findCustomerById(custId);
        transactionNumber++;
    }

    public final Customer findCustomerById(String custId) {
        return db.findCustomerById(custId);
    }

    public final void addLineItem(String productId, int quantity) {
        LineItem item = new LineItem(db, productId, quantity);
        /*
        ADD LINEITEM TO ARRAY;
        - IT MAY NOT HAVE TO BE LINEITEM OBJECTS
         */
    }

    public void outputReceipt(OutputStrategy output) {
        this.output = output;
        output.outputHeader(customer.getFirstName(), customer.getLastName(),
                customer.getCustId(), transactionNumber);
    }
    
//    public static void main(String[] args) {
//        PersistenceStrategy db = new ArrayDatabase();
//        
//        Receipt receipt = new Receipt("C103", db);
//        receipt.outputReceipt();
//    }
}
