import java.util.Scanner;
public class Patient {
    Scanner scan = new Scanner(System.in);
    public void menu(){

        System.out.println("Welcome Doctor");

        System.out.println("Main menu");
        System.out.println("Press 1 show medical history");
        System.out.println("Press 2 show last date of illness");
        System.out.println("Press 3 how treatment days");
        System.out.println("Press 4 show doctors schedule");
        System.out.println("Press 5 show my information");
        System.out.println("Press 6 to exit");
        do {
            System.out.print("Your choose: ");
            String patient_choose = scan.nextLine();
            switch(patient_choose){
                case "1":
                
                action1();
                break;
                case "2":
        
                action2();
                break;
                case "3":
                
                action3();
                break;
                case "4":
                
                action4();
                break;
                case "5":
                
                action5();
                break;
                case "6":
                System.exit(0);
                

            }
        } while(true);
    }

    public void action1(){
        System.out.println("show medical history");
    }

    public void action2(){
        System.out.println("show medical history");
    }
    public void action3(){
        System.out.println("show last date of illness");
    }
    public void action4(){
        System.out.println("show doctors schedule");
    }
    public void action5(){
        System.out.println("show my information");
    }
}
