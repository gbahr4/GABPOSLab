
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public class Receipt {
    
          
    public Receipt() {
    }
    
    LineItem[] lineItems = new LineItem[0];
        
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
               
    }
    
    
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
        
   public double getTotalBeforeDiscount() {
         double grandTotal = 0.0;
         for(LineItem item : lineItems) {
             grandTotal += item.getOrigPriceSubTotal();
         }
         return grandTotal;
     }
   
   
    
}
