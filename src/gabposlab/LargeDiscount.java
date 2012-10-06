
package gabposlab;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class LargeDiscount implements DiscountStrategy {
    
    private static final double LARGE_DISCOUNT = .30;
    
    public double getDiscount(int qty, double price) {
        return price * qty * LARGE_DISCOUNT;
    }
    
}
