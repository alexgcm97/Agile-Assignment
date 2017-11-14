/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author junki
 */
public class Menu {
    int resId;
    int foodId;
    String food;
    double price;

    public Menu() {

    }

    public Menu(int resId, int foodId, String food, double price) {
        this.resId = resId;
        this.foodId = foodId;
        this.food = food;
        this.price = price;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

}
