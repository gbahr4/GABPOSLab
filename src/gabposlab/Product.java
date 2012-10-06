
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public class Product {
    
    private String productID;
    private String description;
    private double price;
    private DiscountStrategy discountStrategy;
    

    public Product(String productNumber, String description, double price, 
            DiscountStrategy discountStrategy) {
        this.productID = productNumber;
        this.description = description;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductNumber(String productNumber) {
        this.productID = productNumber;
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
