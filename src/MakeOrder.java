
import domain.orderDetails;
import domain.Menu;
import domain.Restaurant;
import domain.foodOrdered;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author junkit
 */
public class MakeOrder {

    private static ArrayList<Restaurant> resList = new ArrayList();
    private static ArrayList<Menu> menuList = new ArrayList();
    private static ArrayList<Menu> menuList2 = new ArrayList();
    private static int orderID = 1001;
    private static ArrayList<foodOrdered> foList = new ArrayList();

    public static void initializeMenu() {
        menuList.add(new Menu(9001, 1, "Nasi Lemak", 5.00));
        menuList.add(new Menu(9001, 2, "Burger", 5.00));
        menuList.add(new Menu(9001, 3, "Roti Telur", 5.00));
        menuList.add(new Menu(9001, 4, "Maggie Goreng", 5.00));
        menuList.add(new Menu(9001, 5, "Kopi Ice", 2.00));
        menuList.add(new Menu(9001, 6, "Teh O Ice", 2.00));
        resList.add(new Restaurant(9001, "Alibaba Restaurant", menuList));

        menuList2.add(new Menu(9002, 1, "Chicken Chop", 10.00));
        menuList2.add(new Menu(9002, 2, "Carbonara", 8.00));
        menuList2.add(new Menu(9002, 3, "Balognese", 8.00));
        menuList2.add(new Menu(9002, 4, "Mushroom Soup", 4.00));
        menuList2.add(new Menu(9002, 5, "Fresh Orange Juice", 3.00));
        menuList2.add(new Menu(9002, 6, "Fresh Apple Juice", 3.00));
        resList.add(new Restaurant(9002, "Garden Cafe", menuList2));
    }

    public static void MakeOrder() {
        int ans;
        int resId = 0;
        Scanner scan = new Scanner(System.in);

        initializeMenu();
        System.out.println("=============================");
        System.out.println("Please select the restaurant");
        System.out.println("=============================");
        for (int i = 0; i < resList.size(); i++) {
            System.out.println(resList.get(i).getResId() + ". " + resList.get(i).getResName());
        }
        System.out.print("Enter restaurant no. :");
        ans = scan.nextInt();
        scan.nextLine();
        resId = ans;

        for (int i = 0; i < resList.size(); i++) {
            if (resId == resList.get(i).getResId()) {
                resId = resList.get(i).getResId();
                for (Menu m : resList.get(i).getMenuList()) {
                    System.out.println(m.getFoodId() + ". " + m.getFood() + " - " + "RM " + m.getPrice());
                }
            }
        }
        System.out.print("Please select food: ");
        ans = scan.nextInt();
        foodOrdered fo = new foodOrdered();
        fo.setOrderID(orderID);
        for (int i = 0; i < resList.size(); i++) {
            if (resId == resList.get(i).getResId()) {
                for (Menu m : resList.get(i).getMenuList()) {
                    if (ans == m.getFoodId()) {
                        fo.setFoodID(m.getFoodId());
                        fo.setFood(m.getFood());
                        if (foList.contains(fo)) {
                            fo.setQuantity(fo.getQuantity() + 1);
                        } else {
                            fo.setQuantity(1);
                        }
                    }
                }
            }
        }
        foList.add(fo);
        System.out.println("\n\n==Food Order==");
        System.out.println("Food ID:" +foList.get(0).getFoodID());
        System.out.println("Food Name:" +foList.get(0).getFood());
        System.out.println("Quantity:" +foList.get(0).getQuantity());
    }

    public static void main(String[] args) {
        MakeOrder();
    }
}
