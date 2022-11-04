import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("To start the program, please enter the type of account");
        Registration registration = new Registration();
        registration.typeOfAccount();

        


    

        scan.close();   
    }
    
}
