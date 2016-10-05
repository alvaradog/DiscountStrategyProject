
package discountstrategyproject;

class Register {
    OutputStrategy output;
    Receipt receipt;

    void createNewPurchase(String custId,PersistenceStrategy db,OutputStrategy output) {
        receipt = new Receipt (custId, db);
        this.output = output;
    }

    void addProductToPurchase(String productId,int quantity) {
        receipt.addLineItem(productId, quantity);
    }

    void endPurchase() {
    }
    
}
