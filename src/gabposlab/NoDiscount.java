
package gabposlab;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class NoDiscount implements DiscountStrategy {
    
    public double getDiscount(int qty, double price) {
        return price * qty;
    }
    
}
