
package pkgfinal.project.oop;
import java.io.IOException;
import static pkgfinal.project.oop.Customer.AddCustomer;
import static pkgfinal.project.oop.Customer.AddItem;
import static pkgfinal.project.oop.Customer.AddItemtoCustomerShoppingCart;
import static pkgfinal.project.oop.Customer.EmptyCustomerShoppingCart;
import static pkgfinal.project.oop.Customer.ImportDataFromFile;
import static pkgfinal.project.oop.Customer.SaveTheDataToFile;
import static pkgfinal.project.oop.Customer.SearchForProductName;
import static pkgfinal.project.oop.Customer.ViewTheItemsInCustomerShoppingCart;
import static pkgfinal.project.oop.Customer.c;


public class FinalProjectOop {

   
    public static void main(String[] args) throws IOException{
  
        boolean isExit = false;
        while (!isExit) {
            System.out.println(
                      "1.Add a new Item to Store \n"
                    + "2. Add a new Customer to Store\n"
                    + "3. Add an item to Customer shopping cart  \n"
                    + "4. View the items in Customer shopping cart\n"
                    + "5. Empty Customer shopping cart\n"
                    + "6. Search for a product name inside the store .\n"
                    + "7. Save the data to a file.\n"
                    + "8.Import data from a file .\n"
                    + "9. Exit the program"
            );
            System.out.println(" ");
            System.out.println("Enter the number please :");
            int x = c.nextInt();
            
            switch (x) {
                case 1:
                    AddItem();
                    break;
                case 2:
                    AddCustomer();

                    break;

                case 3:
                    AddItemtoCustomerShoppingCart();
                    break;
                case 4:
                    ViewTheItemsInCustomerShoppingCart();
                    break;

                case 5:
                    EmptyCustomerShoppingCart();

                    break;

                case 6:
                    SearchForProductName();
                    break;
                case 7:

                    SaveTheDataToFile();
                    break;

                case 8:
                    ImportDataFromFile();
                    break;
                    
                case 9:
                    isExit =true;
            }
        }
    }

   
    
   
   

  
  
    
 

}