import java.util.Scanner;;
public class MainDoctor {
    Scanner scan = new Scanner(System.in); 
    public void menu(){

        System.out.println("Welcome Doctor");

        System.out.println("Main menu");
        System.out.println("Press 1 show list of nurses");
        System.out.println("Press 2 show list of attending physicians");
        System.out.println("Press 3 show number of patients");
        System.out.println("Press 4 show the employee with the highest salary");
        System.out.println("Press 5 show employee with minimum");
        System.out.println("Press 6 to exit");
        do {
            System.out.print("Your choose: ");
            String mainDoctor_choose = scan.nextLine();
            switch(mainDoctor_choose){
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
        System.out.println("show list of nurses");
    }

    public void action2(){
        System.out.println("show list of attending physicians");
    }
    public void action3(){
        System.out.println("show number of patients");
    }
    public void action4(){
        System.out.println("show the employee with the highest salary");
    }
    public void action5(){
        System.out.println("show employee with minimum");
    }

   
}
