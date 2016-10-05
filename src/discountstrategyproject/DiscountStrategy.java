
package discountstrategyproject;

public interface DiscountStrategy {
    
    public abstract double getDiscountAmount(double productRetailPrice, int qty);
    public double getDiscountRate();
    public void setDiscountRate();
    
}
