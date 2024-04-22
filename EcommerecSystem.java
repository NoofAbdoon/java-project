
package e.commerec;
import java.util.Scanner;
public class EcommerecSystem {
public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        
        System.out.println("Welcome to E-Commerce System!");
        
        System.out.println("Please enter your ID:");
        int customerId = input.nextInt();
        input.nextLine();
        
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        
        System.out.println("Please enter your address:");
        String address = input.nextLine();
        
        Customer c1 = new Customer(customerId, name, address);
        
        System.out.println("How many products would you like to add to your cart?");
        int nProducts = input.nextInt();
        
        Cart cart = new Cart(customerId, nProducts);
        
        ElectronicProduct E1= new ElectronicProduct(1, "smartPhone", 599.9f, "samsung", 1);
        ClothingProduct Cc= new ClothingProduct(1, "T-shirt", 19.99f, "medium", "cotton");
        BookProduct B1=new BookProduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");
        
        
        
        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? 1-SmartPhone 2-T-shirt 3-OOP");
            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    cart.addProduct(E1,i);
                    break;
                case 2:
                    cart.addProduct(Cc,i);
                    break;
                case 3:
                    cart.addProduct(B1,i);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        
        System.out.println("Your total is $" + cart.CalculatePrice() + ". Would you like to place the order? 1-Yes 2-No");
        int decision = input.nextInt();
        if (decision == 1) {
           
            Order order = new Order(c1.getCustomerId(), 1, cart.getProducts());
           
            order.printOrderInfo();
        } else {
            System.out.println("Order not placed. Thank you for shopping with us!");
            
        }
}
}
         
         
        

        
        

