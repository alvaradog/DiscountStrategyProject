
package discountstrategyproject;

public class NoDiscount implements DiscountStrategy{
    private final static double NO_DISCOUNT = 0;

    public NoDiscount() {
    }
    
    @Override
    public final double getDiscountAmount() {
        return NO_DISCOUNT;
    }

    @Override
    public final double getDiscountRate() {
        return NO_DISCOUNT;
    }

    @Override
    public final void setDiscountRate() {
    }
    
}
