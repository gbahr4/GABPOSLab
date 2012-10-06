
package gabposlab;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(int qty, double price);
    
}
