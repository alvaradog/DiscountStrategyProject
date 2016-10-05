
package discountstrategyproject;

public class Register {
    private OutputStrategy output;
    private Receipt receipt;

    public final void createNewPurchase(String custId,PersistenceStrategy db,OutputStrategy output) {
        receipt = new Receipt (custId, db);
        this.output = output;
    }

    public final void addProductToPurchase(String productId,int quantity) {
        receipt.addLineItem(productId, quantity);
    }

    public final void endPurchase() {
    }
    
}
