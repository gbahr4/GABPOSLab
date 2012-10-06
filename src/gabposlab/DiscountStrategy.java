
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(int qty, double price);
    
}
