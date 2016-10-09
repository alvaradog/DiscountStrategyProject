
package discountstrategyproject;

public class LineItem {
    private Product product;
    private PersistenceStrategy db;
    private int qty;

    public LineItem(PersistenceStrategy db, String prodId, int qty) {
        this.db = db;
        product = db.findProductById(prodId);
        this.qty = qty;
    }

    
    public final Product findProductById(PersistenceStrategy db,String productId){
        db.findProductById(productId);
        return product;
    }
    
    public String toString() {
        double price = product.getProductRetailPrice();
        double discount = product.getDiscountAmount(qty);
        return product.getProductId() + " " + product.getProductName()
                + " " + price + " "
                + (price * qty) + " " + discount;
    }
    
    public static void main(String[] args) {
        LineItem item = new LineItem(new ArrayDatabase(),"P1000",2);
        System.out.println(item.toString());
    }
    
}
