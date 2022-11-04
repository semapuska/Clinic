import java.util.Scanner;
public class Registration {
    Scanner scan = new Scanner(System.in);
    
    
    public void typeOfAccount(){
        System.out.println("Doctor account press: 1");
        System.out.println("Attending Doctor account press: 2");
        System.out.println("Nurse account press: 3");
        System.out.println("Patient account press: 4");

        do {
            System.out.print("Your choose: ");
            String choose = scan.nextLine();
            switch (choose) {
               
                case "1":
                    System.out.println("Enter your login and password");
                    mainDocterCome();
                    break;
              
                case "2":
                    System.out.println("Enter your login and password");  
                    yourDocterCome();
                    break;
                    
                case "3":
                    System.out.println("Enter your login and password");   
                    nurseCome();
                    break;
                case "4":
                    System.out.println("Enter your login and password");
                    patientCome();
                break;
                default:
                    System.out.print("Would you like to exit[1] or repeat[0]?");
                    int ex = scan.nextInt();
                    if (ex == 0){
                        typeOfAccount();
                    }
                    else if(ex == 1){
                        System.exit(0);
                    }
            }
            break;
        } while (true);


        
        
    }
    public void mainDocterCome(){
        String doctor_log = "Sema";
        String doctor_pas = "pushka";

        do{
            System.out.print("Enter login: ");
            String input_log = scan.nextLine();
            System.out.print("Enter password: ");
            String input_pas = scan.nextLine();
            boolean answear = false;
            if(doctor_log.equals(input_log) && doctor_pas.equals(input_pas)){
                answear = true;
            }
            if (answear == true){

                System.out.println("");
                MainDoctor mainDoctor = new MainDoctor();
                mainDoctor.menu();
                break;
            }else{
                System.out.println("Try again");
            }

         }while (true);
    }

    public void yourDocterCome(){
        String yourDoctor_log = "ema";
        String yourDoctor_pas = "nepushka";

        do{
            System.out.print("Enter login: ");
            String input_log = scan.nextLine();
            System.out.print("Enter password: ");
            String input_pas = scan.nextLine();
            boolean answear = false;
            if(yourDoctor_log.equals(input_log) && yourDoctor_pas.equals(input_pas)){
                answear = true;
            }
            if (answear == true){

                System.out.println("");
                Doctor doctor = new Doctor();
                doctor.menu();
                break;
            }else{
                System.out.println("Try again");
            }

         }while (true);
    }

    public void nurseCome(){
        String nurse_log = "nurse";
        String nurse_pas = "bomba";

        do{
            System.out.print("Enter login: ");
            String input_log = scan.nextLine();
            System.out.print("Enter password: ");
            String input_pas = scan.nextLine();
            boolean answear = false;
            if(nurse_log.equals(input_log) && nurse_pas.equals(input_pas)){
                answear = true;
            }
            if (answear == true){

                System.out.println("");
                Nurse nurse = new Nurse();
                nurse.menu();
                break;
            }else{
                System.out.println("Try again");
            }

         }while (true);
    }

    public void patientCome(){
        String patient_log = "Kutman";
        String patient_pas = "Manapov";

        do{
            System.out.print("Enter login: ");
            String input_log = scan.nextLine();
            System.out.print("Enter password: ");
            String input_pas = scan.nextLine();
            boolean answear = false;
            if(patient_log.equals(input_log) && patient_pas.equals(input_pas)){
                answear = true;
            }
            if (answear == true){
                Patient patient = new Patient();
                patient.menu();
                System.out.println("");
                break;
            }else{
                System.out.println("Try again");
            }

         }while (true);
    }

}
 