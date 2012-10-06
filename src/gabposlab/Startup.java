
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public class Startup {
    
    private static int qty;
    private static double price;
    private static Object lineItem;

    
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        
        cr.startNewSale("12345");
        cr.addItemToSale("UW345", 3);
        cr.endSale();
        
        
    }
}
