
package gabposlab;

/**
 *
 * @author Greg Bahr
 */
public class CashRegister {
    
    Receipt receipt = new Receipt();
    
    Product[] products = {
        new Product("GB123", "Green Bay Packers Jersey", 49.99, 
            new NoDiscount()), 
        new Product("MB234", "Milwaukee Brewers T-Shirt", 19.95,
            new SmallDiscount()), 
        new Product("UW345", "UW Madison Sweatshirt", 24.99, 
            new LargeDiscount())
    };
    
    Customer[] customers = {
        new Customer("Thomas Jefferson", "12345"),
        new Customer("Betsy Ross", "23456"),
        new Customer("Benjamin Franklin", "34567")
    };
   
    
    
    public void startNewSale(String customerID) {
        Customer customer = null;
        for(Customer c : customers) {
            if(customerID.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
            if(customer != null) {
                customer.getCustomerID();
                customer.getName();
        }
    }
    
    public void addItemToSale(String prodID, int qty) {
        Product product = null;
        for(Product p : products) {
            if(prodID.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
            if(product != null) {
                receipt.addLineItem(product, qty);
        }
    }
    
     public void endSale() {
         receipt.getTotalBeforeDiscount();
     }
}
     
    
    
    
