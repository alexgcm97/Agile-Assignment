
import domain.Staff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class MaintainStaff {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Staff> staffList = new ArrayList<Staff>();
    private static int ID = 1001;

    /**
     * @param input
     * @return
     */
    public static int compareInput(String input) {
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("ye") || input.equalsIgnoreCase("yes")) {
            return 1; //Represent Yes
        } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
            return 0; //Represent No
        } else if (input.equalsIgnoreCase("exit")) {
            return -999; //Represent Exit
        } else {
            return -1; //Represent Invalid
        }
    }

    public static void addStaff() {
        boolean doMore;
        String input;

        OUTER:
        do {
            doMore = false;
            Staff newStaff = new Staff();
            newStaff.setID(ID);

            System.out.println("\n\n\n***Staff Registration***\n");
            System.out.println("===Input Details===");
            System.out.println("Staff ID : " + newStaff.getID());
            System.out.print("Name : ");
            newStaff.setName(scanner.nextLine());
            System.out.print("Phone Number : ");
            newStaff.setPhoneNo(scanner.nextLine());
            System.out.print("Address : ");
            newStaff.setAddress(scanner.nextLine());
            newStaff.setStatus("Active");

            do {
                System.out.print("Verify Input Details (Y/N/Exit) ?  ");
                input = scanner.nextLine();
                if (compareInput(input) == 1) {
                    System.out.println("\n===Verify Staff Details===");
                    System.out.println("Staff ID : " + newStaff.getID());
                    System.out.println("Name : " + newStaff.getName());
                    System.out.println("Phone Number : " + newStaff.getPhoneNo());
                    System.out.println("Address : " + newStaff.getAddress());
                    break;
                } else if (compareInput(input) == -1) {
                    System.out.println("Invalid Input");
                } else if (compareInput(input) == -999) {
                    break OUTER;
                }
            } while (compareInput(input) != 0);

            do {
                System.out.print("Confirm add into system (Y/N/Exit) ? ");
                input = scanner.nextLine();
                if (compareInput(input) == 1) {
                    staffList.add(newStaff);
                    ID++;
                    break;
                } else if (compareInput(input) == -1) {
                    System.out.println("Invalid Input");
                } else if (compareInput(input) == -999) {
                    break OUTER;
                }
            } while (compareInput(input) != 0);

            do {
                System.out.print("Add more staff (Y/N) ? ");
                input = scanner.nextLine();
                if (compareInput(input) == 1) {
                    doMore = true;
                    break;
                } else if (compareInput(input) == -1) {
                    System.out.println("Invalid Input");
                }
            } while (compareInput(input) != 0);
        } while (doMore == true);

        do {
            System.out.print("Return to Main Menu or Exit (Y = Return / N = Exit) ? ");
            input = scanner.nextLine();
            if (compareInput(input) == 0) {
                System.exit(0);
            } else if (compareInput(input) == -1) {
                System.out.println("Invalid Input");
            }
        } while (compareInput(input) != 1);
    }
    
    public static void retrieveDeliveries(){
            
    }

    public static void updateStaff(){
        
    }
    
    public static void updateStatus(){
        
    }
    
    public static void dailyReport(){
        
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int input;
        do {
            System.out.println("\n\n\n***HR Module***");
            System.out.println("1. Add Staff");
            System.out.println("2. Retrieve pending deliveries");
            System.out.println("3. Update Staff Details");
            System.out.println("4. Update Staff Status");
            System.out.println("5. Daily Report");
            System.out.println("0. Exit");
            System.out.print("Input Selection : ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 0:
                    break;
                case 1:
                    addStaff();
                    break;
                case 2:
                    retrieveDeliveries();
                    break;
                case 3:
                    updateStaff();
                    break;
                case 4:
                    updateStatus();
                    break;
                case 5:
                    dailyReport();
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        } while (input != 0);
    }

}
