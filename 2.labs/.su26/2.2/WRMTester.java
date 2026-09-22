import java.util.Scanner;

public class WRMTester {

    public static void printOptions() {
        System.out.println("==Choose an Option==");
        System.out.println("1. RegisterPatient()");
        System.out.println("2. ServePatient()");
        System.out.println("3. CancelAll()");
        System.out.println("4. CanDoctorGoHome()");
        System.out.println("5. ShowAllPatient()");
        System.out.println("6. ReverseTheLine()");
        System.out.println("7. exit");
        System.out.println("=====================");
    }

    //after each operation you can choose option 5
    //to check whether your operation was correct or not
    public static void main(String[] args) {
        System.out.println("**Welcome to Waiting Room Management System**");

        Scanner sc = new Scanner(System.in);
        WRM wrm = new WRM();

        while (true) {
            printOptions();
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("executing RegisterPatient()...");
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Blood group: ");
                    String bloodGroup = sc.nextLine();
                    wrm.registerPatient(id, name, age, bloodGroup);
                    break;

                case "2":
                    System.out.println("executing ServePatient()...");
                    wrm.servePatient();
                    break;

                case "3":
                    System.out.println("executing CancelAll()...");
                    wrm.cancelAll();
                    break;

                case "4":
                    System.out.println("executing CanDoctorGoHome()...");
                    System.out.println(wrm.canDoctorGoHome());
                    break;

                case "5":
                    System.out.println("executing ShowAllPatient()...");
                    wrm.showAllPatient();
                    break;

                case "6":
                    System.out.println("executing ReverseTheLine()...");
                    wrm.reverseTheLine();
                    break;

                case "7":
                    System.out.println("\nThank You For Using \"Waiting Room Management System\"");
                    return;

                default:
                    System.out.println("No Such Option");
            }
            System.out.println();
        }
    }
}

