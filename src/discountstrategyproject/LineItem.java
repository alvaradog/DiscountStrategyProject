package discountstrategyproject;

public class LineItem {
    private Product product;
    private PersistenceStrategy db;
    private int qty;

    public LineItem(PersistenceStrategy db, String prodId, int qty) {
        this.db = db;
        product = db.findProductById(prodId);
        this.qty = qty;
        product.getDiscountAmount(qty);
    }

    LineItem(String product_Name, String product_ID, double retailPrice,
            double discountedPrice, int qty) {
    }

    public final Product findProductById(PersistenceStrategy db, String productId) {
        db.findProductById(productId);
        return product;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "LineItem{" + "product=" + product + ", qty=" + qty + '}';
    }
}
