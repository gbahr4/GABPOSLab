
package gabposlab;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class SmallDiscount implements DiscountStrategy {
    
    private static final double SMALL_DISCOUNT = .15;
    
    public double getDiscount(int qty, double price) {
        return price * qty * SMALL_DISCOUNT;
    }
    
}
