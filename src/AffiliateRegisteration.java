
import domain.Affiliate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julian
 */
public class AffiliateRegisteration {

    public static String currentDate ;
    
    public static void getDate(){
        
        GregorianCalendar date = new GregorianCalendar();      
        int month = date.get(Calendar.MONTH);
        month = month+1;
        switch (month){
        case 1:
            currentDate = ""+date.get(Calendar.DATE)+"-JAN-"+date.get(Calendar.YEAR);
            break;
        case 2:
            currentDate = ""+date.get(Calendar.DATE)+"-FEB-"+date.get(Calendar.YEAR);
            break;
        case 3:
            currentDate = ""+date.get(Calendar.DATE)+"-MAR-"+date.get(Calendar.YEAR);
            break;
        case 4:    
            currentDate = ""+date.get(Calendar.DATE)+"-APR-"+date.get(Calendar.YEAR);
            break;
        case 5:
            currentDate = ""+date.get(Calendar.DATE)+"-MAY-"+date.get(Calendar.YEAR);
            break;
        case 6: 
            currentDate = ""+date.get(Calendar.DATE)+"-JUN-"+date.get(Calendar.YEAR);
            break;
        case 7:
            currentDate = ""+date.get(Calendar.DATE)+"-JUL-"+date.get(Calendar.YEAR);
            break;
        case 8:
            currentDate = ""+date.get(Calendar.DATE)+"-AUG-"+date.get(Calendar.YEAR);
            break;
        case 9:
            currentDate = ""+date.get(Calendar.DATE)+"-SEP-"+date.get(Calendar.YEAR);
            break;
        case 10:
            currentDate = ""+date.get(Calendar.DATE)+"-OCT-"+date.get(Calendar.YEAR);
            break;
        case 11:
            currentDate = ""+date.get(Calendar.DATE)+"-NOV-"+date.get(Calendar.YEAR);
            break;
        case 12:
            currentDate = ""+date.get(Calendar.DATE)+"-DEC-"+date.get(Calendar.YEAR);
            break;
        };
        
        
        
    }
  
    public static void registerAffialiate(){
        
    }
    public static void main(String[] args) {
    
        
        List<Affiliate> Affialiates = new ArrayList<Affiliate>();
        boolean ToF; 
        String tryAgain ;
        Scanner scan = new Scanner(System.in);
        Affiliate regAffiliate = new Affiliate();
        getDate();
        
        regAffiliate.setJoinDate(currentDate);
        
        do{
            System.out.println("\n --Register As Affiliates--");
            System.out.println("-----------------------------");
            System.out.println("--Company Information--");
            System.out.print("Company Name :");
            regAffiliate.setCompanyName(scan.nextLine());
            
            do{
                ToF = true;
                try{

                System.out.print("Business License Number:");
                regAffiliate.setLicenseNumber(scan.nextInt());
                break;

                }catch(Exception  e){
                    System.out.println("Please enter Number only.");
                    scan.nextLine();
                    ToF = false;
                }
            }while(!ToF);
            
            scan.nextLine();
            System.out.print("Company Address :");
            regAffiliate.setAddress(scan.nextLine());
            
            System.out.print("Business Type :");
            regAffiliate.setCompanyType(scan.nextLine());
            
           
            System.out.println("\n\n--Owner Information--");
            System.out.println("-----------------------------");
            System.out.print("Full Name :");
            regAffiliate.setOwnerName(scan.nextLine());
          
            do{
                ToF = true;
                try{

                System.out.print("I/C No. :");
                regAffiliate.setOwnerICNumb(scan.nextInt());

                }catch(Exception  e){
                    System.out.println("Please enter Number only!.");
                    scan.nextLine();
                    ToF = false;
                }
            }while(ToF = false);
            
            scan.nextLine();
            System.out.print("Gender :");
            regAffiliate.setOwnerGender(scan.nextLine());
            
            System.out.print("Owner Address :");
            regAffiliate.setOwnerAddress(scan.nextLine());
            
            System.out.print("Phone No. :");
            regAffiliate.setOwnerPhoneNumber(scan.nextLine());
            
            do{
                System.out.println("\n\n\n");
                System.out.println("--Verify Information Entered--");
                System.out.println("Company Name :"+regAffiliate.getCompanyName());
                System.out.println("Business License Number:"+regAffiliate.getLicenseNumber());
                System.out.println("Company Address :"+regAffiliate.getCompanyaddress());
                System.out.println("Business Type :"+regAffiliate.getCompanyType());
                System.out.println("Owner Name :"+regAffiliate.getOwnerName());
                System.out.println("I/C No. :"+regAffiliate.getOwnerICNumb());
                System.out.println("Gender :"+regAffiliate.getOwnerGender());
                System.out.println("Ownder Address :"+regAffiliate.getOwnerAddress());
                System.out.println("Phone No. :"+regAffiliate.getOwnerPhoneNumber());
                System.out.println("------------------------------------------------");
                System.out.println("Are all information entered correctly? Y/N");
                tryAgain = scan.nextLine();
                
                if(tryAgain.equalsIgnoreCase("y")){
                    System.out.println("\n\n\n --For Login--");
                    System.out.println("--------------------");
                    System.out.print("User ID :");
                    regAffiliate.setUserName(scan.next());
                    scan.nextLine();
                    do{
                        System.out.print("Password :");
                        regAffiliate.setPassword(scan.nextLine());
                        
                        System.out.print("Re-Enter Password :");
                    }while(!scan.nextLine().equals(regAffiliate.getPassword()));
                    break;
                } else if (tryAgain.equalsIgnoreCase("n")){
                    break;
                }
                
            }while(!tryAgain.equalsIgnoreCase("n") && !tryAgain.equalsIgnoreCase("y"));
        }while(tryAgain.equalsIgnoreCase("n"));
        Affialiates.add(regAffiliate);
    }
    
}
