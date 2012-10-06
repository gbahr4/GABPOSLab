
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public class LineItem {
    Product product;
    int qty;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public double getOrigPriceSubTotal() {
         double subTotal = 0.0;
         subTotal += product.getPrice();
         return subTotal;
     }
    
}
