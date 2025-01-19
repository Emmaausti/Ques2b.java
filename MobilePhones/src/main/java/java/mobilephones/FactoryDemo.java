package java.mobilephones;

 import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        // Input the Model of a MobilePhone
        try ( // Get user input for MobilePhone and TV models
                Scanner scanner = new Scanner(System.in)) {
            // Input the Model of a MobilePhone
            System.out.print("Enter the model of the Mobile Phone (A10, X25, TPlus): ");
            String mobileModel = scanner.nextLine();
            
            // Input the Model of a TV
            System.out.print("Enter the model of the TV (Alpha 40, Gamma 50, Theta 65): ");
            String tvModel = scanner.nextLine();
            
            // Create the MobileFactory and TVFactory
            AbstractFactory mobileFactory = new MobileFactory();
            AbstractFactory tvFactory = new TVFactory();
            
            // Get the MobilePhone and TV objects using the AbstractFactory pattern
            MobilePhone mobilePhone = mobileFactory.createMobilePhone(mobileModel);
            TV tv = tvFactory.createTV(tvModel);
            
            // Display the details of the MobilePhone and TV
            if (mobilePhone != null) {
                mobilePhone.display();
            } else {
                System.out.println("Invalid Mobile Phone Model.");
            }
            
            if (tv != null) {
                tv.display();
            } else {
                System.out.println("Invalid TV Model.");
            }
        }
    }
}

