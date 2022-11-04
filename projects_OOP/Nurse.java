import java.util.Scanner;
public class Nurse {
    Scanner scan = new Scanner(System.in);
    public void menu(){

        System.out.println("Welcome Doctor");

        System.out.println("Main menu");
        System.out.println("Press 1 show a list of procedures");
        System.out.println("Press 2 find a patient");
        System.out.println("Press 3 show a list of tasks for");
        System.out.println("Press 4 run an order");
        System.out.println("Press 5 show completed quests");
        System.out.println("Press 6 to exit");
        do {
            System.out.print("Your choose: ");
            String nurse_choose = scan.nextLine();
            switch(nurse_choose){
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
        System.out.println("show a list of procedures");
    }

    public void action2(){
        System.out.println("find a patient");
    }
    public void action3(){
        System.out.println("show a list of tasks for");
    }
    public void action4(){
        System.out.println("run an order");
    }
    public void action5(){
        System.out.println("show completed quests");
    }
}
