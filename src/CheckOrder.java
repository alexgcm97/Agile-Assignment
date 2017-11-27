/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import domain.foodOrdered;
import domain.orderDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author REPUBLIC
 */
public class CheckOrder {

    public static void main(String[] args) throws IOException {
        List<orderDetails> od = new ArrayList<orderDetails>();
        ArrayList<foodOrdered> fo = new ArrayList<foodOrdered>();
        ArrayList<foodOrdered> fo1 = new ArrayList<foodOrdered>();
        ArrayList<foodOrdered> fo2 = new ArrayList<foodOrdered>();
        foodOrdered foodDetail = new foodOrdered(2001, "Nasi lemak", 1,0.0);
        foodOrdered foodDetail1 = new foodOrdered(2001, "Burger", 1,0.0);
        foodOrdered foodDetail2 = new foodOrdered(2001, "Kopi ice", 1,0.0);
        foodOrdered foodDetail3 = new foodOrdered(2002, "Roti bakar", 2,0.0);
        foodOrdered foodDetail4 = new foodOrdered(2002, "Telur", 2,0.0);
        foodOrdered foodDetail5 = new foodOrdered(2002, "Milo ais", 2,0.0);
        foodOrdered foodDetail6 = new foodOrdered(2002, "Roti telur", 3,0.0);
        foodOrdered foodDetail7 = new foodOrdered(2002, "Telur", 3,0.0);
        foodOrdered foodDetail8 = new foodOrdered(2002, "Limau ais", 3,0.0);

        fo.add(foodDetail);
        fo.add(foodDetail1);
        fo.add(foodDetail2);
        fo1.add(foodDetail3);
        fo1.add(foodDetail4);
        fo1.add(foodDetail5);
        fo2.add(foodDetail6);
        fo2.add(foodDetail7);
        fo2.add(foodDetail8);

        orderDetails orderDetail = new orderDetails(1001, 2001, 3001, "Kopitiam", "Jordan", "Taman Gembira", "012-3456789", fo);
        orderDetails orderDetail2 = new orderDetails(1001, 2003, 3003, "Kopitiam3", "Jordan3", "Taman Gembira3", "0123456789(3)", fo2);
        orderDetails orderDetail1 = new orderDetails(1002, 2002, 3002, "Kopitiam2", "Jordan2", "Taman Gembira2", "012-3456789(2)", fo1);

        od.add(orderDetail);
        od.add(orderDetail1);
        od.add(orderDetail2);

        Scanner scan = new Scanner(System.in);

        int input;
        String confirm;

        System.out.println("Enter staff ID :");
        input = scan.nextInt();

        for (int i = 0; i < od.size(); i++) {
            if (input == (od.get(i).getStaffID())) {
                int ID = od.get(i).getOrderID();
                System.out.println("-------------------------------------------------------");
                System.out.println("Order ID :" + ID);
                System.out.println("Restaurant ID :" + od.get(i).getResID());
                System.out.println("Restaurant name :" + od.get(i).getResName());
                System.out.println("Customer name :" + od.get(i).getCustomerName());
                System.out.println("Delivery address :" + od.get(i).getCustomerAdd());
                System.out.println("Customer hp no. :" + od.get(i).getCustNo());
                System.out.println("\nFood ordered");

                List<foodOrdered> foo = od.get(i).getFood();
                for (int j = 0; j < foo.size(); j++) {
                    System.out.println(foo.get(j).getFood() + " x" + foo.get(j).getQuantity());
                }
                System.out.println("-------------------------------------------------------");
            }
        }

    }
}
