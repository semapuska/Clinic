import java.util.Scanner;
public class Doctor {
   Scanner scan = new Scanner(System.in);
    public void menu(){

        System.out.println("Welcome Doctor");

        System.out.println("Main menu");
        System.out.println("Press 1 show patient list");
        System.out.println("Press 2 show number of patients");
        System.out.println("Press 3 show list of orders for");
        System.out.println("Press 4 write an assignment for nurses");
        System.out.println("Press 5 show Completed Quests");
        System.out.println("Press 6 patient searcht");
        System.out.println("Press 7 diagnose the patient");
        System.out.println("Press 8 to exit");
        do {
            System.out.print("Your choose: ");
            String doctor_choose = scan.nextLine();
            switch(doctor_choose){
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
                action6();
                break;

                case "7":
                action7();
                break;

                case "8":
                System.exit(0);

                

            }
        } while(true);
    }
    public void action1(){
        System.out.println("show patient list");
    }

    public void action2(){
        System.out.println("show number of patients");
    }

    public void action3(){
        System.out.println("show list of orders for");
    }

    public void action4(){
        System.out.println("write an assignment for nurses");
    }

    public void action5(){
        System.out.println("show Completed Quests");
    }

    public void action6(){
        System.out.println("patient searcht");
    }

    public void action7(){
        System.out.println("diagnose the patient");
    }
 
}
