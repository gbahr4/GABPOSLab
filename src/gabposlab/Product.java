
package gabposlab;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class Product {
    
    private String productID;
    private String description;
    private double price;
    private DiscountStrategy discountStrategy;
    

    public Product(String productID, String description, double price, 
            DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.description = description;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductNumber(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
    
    
}
