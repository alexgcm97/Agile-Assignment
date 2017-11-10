
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        List<Staff> staffList = new ArrayList<Staff>();
        Scanner scanner = new Scanner(System.in);
        int ID = 1001;
        boolean doMore;

        do {
            doMore = false;
            String input;
            Staff newStaff = new Staff();
            newStaff.setID(ID);

            System.out.println("***Staff Registration***\n");
            System.out.println("===Input Details===");
            System.out.println("Staff ID : " + newStaff.getID());
            System.out.print("Name : ");
            newStaff.setName(scanner.next());
            System.out.print("Phone Number : ");
            newStaff.setPhoneNo(scanner.next());
            System.out.print("Address : ");
            newStaff.setAddress(scanner.next());

            System.out.print("Verify Input Details (Y/N) ?  ");
            input = scanner.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                System.out.println("\n===Staff Details===");
                System.out.println("Staff ID : " + newStaff.getID());
                System.out.println("Name : " + newStaff.getName());
                System.out.println("Phone Number : " + newStaff.getPhoneNo());
                System.out.println("Address : " + newStaff.getAddress());
            }

            System.out.print("Confirm add into system (Y/N) ? ");
            input = scanner.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                staffList.add(newStaff);              

                System.out.print("Add more staff (Y/N) ? ");
                input = scanner.next();
                if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                    doMore = true;
                    ID++;
                    System.out.println("\n\n\n\n");
                    continue;
                }
            }
            
            System.out.print("Confirm exit (Y/N) ? ");
            input = scanner.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                System.exit(0);
            }
        } while (doMore == true);
    }

}
