
package discountstrategyproject;

public class PercentDiscount implements DiscountStrategy{
    private double discountRate = 0.20;
    private double discountAmount = 0;

    public PercentDiscount(double productRetailPrice, double discountRate ) {
        this.discountAmount = discountRate;
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
