
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public class NoDiscount implements DiscountStrategy {
    
    public double getDiscount(int qty, double price) {
        return price * qty;
    }
    
}
