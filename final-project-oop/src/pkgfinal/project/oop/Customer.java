package pkgfinal.project.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer {
/////المتغيرات 
    private static Customer Customers[] = new Customer[1000];
    private static int Customer_index = 0;
    private static Item items[] = new Item[1000];
    private static int items_index = 0;
    private static int cart1[] = new int[1000];
    public static Scanner c = new Scanner(System.in);

    private int number;
    private String name;
    private Item[] cart;
////جيتر وسيتر
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getCart() {
        return cart;
    }

    public void setCart(Item[] cart) {
        this.cart = cart;
    }

    public Customer(int number, String name, Item[] cart) {
        this.number = number;
        this.name = name;
        this.cart = cart;
    }

    //Save To Item
    private static void saveItem(Item newItem) {
        items[items_index] = newItem;
        items_index++;
        System.out.println("Item added Successfully");
    }

    //1 المطلوبات
    public static void AddItem() {
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Enter the number: ");
            int number = c.nextInt();
            System.out.println("Enter the quantity: ");
            int quantity = c.nextInt();
            System.out.println("Enter the price: ");
            int price = c.nextInt();
            System.out.println("Enter the name: ");
            c.nextLine();
            String name = c.nextLine();
            System.out.println("Enter the type of item (B)Book, (s)shoes, (G)Game ? : ");
            String type = c.nextLine();
            String book = "B";
            if (type.equalsIgnoreCase("B")) {
                System.out.println("Enter the Book Auther :");
                String titele = c.nextLine();
                System.out.println("Enter the Book language :");
                String author = c.nextLine();

            } else {

            }
            Item newOne = new Item(number, name, quantity, price, type);
            saveItem(newOne);
            System.out.println("Do you want add another item (y/n)?");
            answer = c.next();
        }
    }

    //Save To Customer
    private static void saveCustoemr(Customer customer) {
        Customers[Customer_index] = customer;
        Customer_index++;
        System.out.println("Customer added with empty shopping cart Successfully ");
    }

    //2
    public static void AddCustomer() {
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Please enter the customer number : ");
            int num = c.nextInt();
            System.out.println("Please enter the customer Name : ");
            String name = c.nextLine();
            c.nextLine();
            Item[] itemCart = new Item[1000];
            Customer customer = new Customer(num, name, itemCart);
            saveCustoemr(customer);
            System.out.println("Do you want add another item (y/n)? ");
            answer = c.next();
        }
    }

    //3 اضافة جديدة
    public static void AddItemtoCustomerShoppingCart() {
        System.out.println("Add Item to Customer Shopping Cart Operation :  ");
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Please Enter customer number");
            int customerNumber = c.nextInt();
            boolean isExist = false;
            Customer customer = new Customer(0, "", null);
            for (int i = 0; i < Customer_index; i++) {
                if (customerNumber == Customers[i].getNumber()) {
                    isExist = true;
                    customer = Customers[i];
                    break;
                }
            }
            if (isExist) {
                System.out.println("The customer no :" + customer.getNumber() + " ,The customer name : " + customer.getName() + "");
                System.out.println("Items in the store");
                for (int i = 0; i < items_index; i++) {
                    Item x = items[i];
                    System.out.println((i + 1) + ">>>> " + x.getNumber() + " " + x.getName() + ".[" + x.getQuantity() + "]");
                }
//                 System.out.println("0 >>> . Return to a main menu");
//                int GoToMain= c.nextInt();
//               if(GoToMain==0){
//                  answer = c.next();
//               }

                System.out.println("Enter your choice item :");
                int choice = c.nextInt();

                for (int i = 0; i < items_index; i++) {
                    Item x = items[i];

                    System.out.println((choice) + ">>>> " + x.getNumber() + " " + x.getName() + ".[" + x.getQuantity() + "]");

                    System.out.println("Enter the quantity you need :");
                    int need = c.nextInt();
                    if (need > x.getQuantity()) {
                        System.out.println("Sorry the required quantity is not available,try again!");
                        System.out.println("Do you want add another item to shopping cart (y/n)?");
                        String u = c.nextLine();
//                        String f = "Y";
//                        if (u.equalsIgnoreCase(f)) {
//                          
//                        }
                    } else {
                        System.out.println((choice) + ">>>> " + x.getNumber() + " " + x.getName() + ".[" + x.getQuantity() + "]" + "\n"
                                + " " + " adding to shopping cart is success"
                        );

                    }

//                    System.out.println("Do you want add another item to shopping cart (y/n)?");
//                    String rr = c.nextLine();
                }

            } else {

                System.out.println("The customer is not exits, Do you want try again(y/n)?");
                answer = c.next();

            }
        }
    }

//4  رؤية شو المستخدم طلب
    public static void ViewTheItemsInCustomerShoppingCart() {

        System.out.println("View the items in Customer shopping cart Operation :");
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Enter customer number:");
            int customerNumber = c.nextInt();
            boolean isExist = false;
            Customer customer = new Customer(0, "", null);
            for (int i = 0; i < Customer_index; i++) {
                if (customerNumber == Customers[i].getNumber()) {
                    isExist = true;
                    customer = Customers[i];
                    break;
                }
            }
            if (isExist) {
                for (int i = 0; i < items_index; i++) {
                    Item x = items[i];
                    for (int j = 0; j < Customer_index; j++) {
                        Customer t = Customers[j];
                    }
                    System.out.println("Item no  " + "    " + "Item name" + "      " + " Quantity " + "         " + " Item Type");
                    System.out.println(x.getNumber() + "             " + x.getName() + "                  " + x.getQuantity() + "              " + x.getTybe());

                    System.out.println("                                                       " + "Total Price : " + x.getPrice() * x.getQuantity());

                }

            } else {
                System.out.println("The customer is not exits, Do you want try again(y/n)?");
                answer = c.next();
            }

        }
        System.out.println("Press (m/M) key to return to the main menu :");
        c.next();
        String pp = c.nextLine();
        boolean isExiste = false;
        char a = 'M';
        if (pp.equalsIgnoreCase("M")) {
            isExiste = true;
            System.exit(1);

        }

    }

    //5 
    public static void EmptyCustomerShoppingCart() {

        System.out.println("Embty Shooping Cart.");
        boolean isExit = false;
        isExit = true;

    }

    //6
    public static void SearchForProductName() {

        System.out.println("Search for a products name inside the store :");
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Enter the product name you want to search :");
            String productName = c.nextLine();
            c.next();
            boolean isExist = false;
//            Customer customer = new Customer(0, "", null);
            Item item = new Item(0, "", 0, 0, "");
            for (int i = 0; i < Customer_index; i++) {
                if (productName == items[i].getName()) {
                    isExist = true;
                    item = items[i];
                    break;
                }
            }
            if (isExist) {
                for (int i = 0; i < items_index; i++) {
                    Item x = items[i];
                    for (int j = 0; j < Customer_index; j++) {
                        Customer t = Customers[j];
                    }
                    Customer customer = new Customer(0, "", items);
                    System.out.println("Product Exsit");
                    System.out.println("{ id" + x.getNumber() + " cust no  " + customer.getNumber() + "  " + "name " + x.getName() + "" + " Quantity " + x.getQuantity() + " " + "Type" + x.getTybe() + "}");

                }

            } else {
                System.out.println("The product is not exits, Do you want try again(y/n)?");
                answer = c.next();
            }

        }
        System.out.println("Press (m/M) key to return to the main menu :");
        c.next();
        String pp = c.nextLine();
        boolean isExiste = false;
        char a = 'M';
        if (pp.equalsIgnoreCase("M")) {
            isExiste = true;
            System.exit(1);

        }

    }

    //7
    public static void SaveTheDataToFile() throws IOException {

        for (int i = 0; i < items_index; i++) {
            Item item = items[i];

            for (int j = 0; j < Customer_index; j++) {

                Customer customer = Customers[j];

                try {
                    File myObj = new File("c//filename.txt");
                    if (myObj.createNewFile()) {
                        System.out.println("File created: " + myObj.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException exception) {
                    System.out.println("An error occurred.");
                    System.out.println(exception);
                }
                try {
                    FileWriter myWriter = new FileWriter("c//filename.txt");
                    myWriter.write("Customer Number : " + customer.getNumber() + "\n");

                    myWriter.write("----------------------------------------\n");

                    myWriter.write("Item Number : " + item.getNumber() + "\n");
                    myWriter.write("Item Name : " + item.getName() + "\n");
                    myWriter.write("Item Price : " + item.getPrice() + "\n");
                    myWriter.write("Item Quantity : " + item.getQuantity() + "\n");
                    myWriter.write("Item Type : " + item.getTybe() + "\n");
                    myWriter.write("----------------------------------------\n");

                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException iOException) {
                    System.out.println("An error occurred.");
                    System.out.println(iOException);
                }

            }

        }
    }

    //8 تجلب المعلومات
    public static void ImportDataFromFile() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
