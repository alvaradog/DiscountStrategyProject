
package discountstrategyproject;

public class PercentDiscount implements DiscountStrategy{
    private double discountRate = 0.20;


    public PercentDiscount(double discountRate ) {
        this.discountRate = discountRate;
    }

    @Override
    public final double getDiscountAmount(double productRetailPrice, int qty) {
        return productRetailPrice * qty * discountRate;
    }

    @Override
    public final double getDiscountRate() {
       return discountRate;
    }

    @Override
    public final void setDiscountRate() {
    }
}
