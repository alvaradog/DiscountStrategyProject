
package discountstrategyproject;

public class QuantityDiscount implements DiscountStrategy{
    private double discountRate = 0.15;
    private double discountAmount= 0;
    private int minQuanitity=1;

    public QuantityDiscount(double productRetailPrice, int minQuantity,
            double discountRate) {
        this.discountAmount = discountRate;
        this.minQuanitity = minQuantity;
    }
    @Override
    public final double getDiscountAmount() {
    return discountAmount;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate() {
    }    
}
