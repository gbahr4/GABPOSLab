
package gabposlab;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class Startup {
    
    
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
              
        System.out.println("Customer ID: " + cr.startNewSale("12345"));
        LineItem[] lineItems = new LineItem[0];
                
        cr.addItemToSale("UW345", 3);
        cr.addItemToSale("MB234", 2);
        
        for(LineItem item : lineItems) {
            System.out.print(item.getProduct().getProductID());
            
        }
    }
}
