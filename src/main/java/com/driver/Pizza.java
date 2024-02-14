package com.driver;

public class Pizza {

    private int basePrice;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperbagAdded;
    private static final int vegBasePrice = 300;
    private static final int nonVegBasePrice = 400;
    private static final int extraCheese = 80;
    private static final int vegExtraToppingsPrice = 70;
    private static final int nonVegExtraToppingsPrice = 120;
    private static final int paperbag = 20;
    private String bill;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.basePrice = vegBasePrice;
        } else {
            this.basePrice = nonVegBasePrice;
        }
        this.bill = "";
    }

    public int getPrice(){
        int totalPrice = basePrice;
        if(extraCheeseAdded){
            totalPrice += extraCheese;
        }
        if(extraToppingsAdded){
            totalPrice += isVeg ? vegExtraToppingsPrice : nonVegExtraToppingsPrice;
        }
        if(paperbagAdded){
            totalPrice += paperbag;
        }
        return totalPrice;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded){
            extraCheeseAdded = true;
            bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded){
            extraToppingsAdded = true;
            int toppingPrice = isVeg ? vegExtraToppingsPrice : nonVegExtraToppingsPrice;
            bill += "Extra Toppings Added: " + toppingPrice + "\n";
        }
    }

    public void addTakeaway(){
        if(!paperbagAdded){
            paperbagAdded = true;
            bill += "Paper Bag Added: " + paperbag + "\n";
        }
    }

    public String getBill(){
        String bill = "";
        bill += "Base Price Of Pizza: " + basePrice + "\n";
        if(extraCheeseAdded){
            bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
        if(extraToppingsAdded){
            int toppingPrice = isVeg ? vegExtraToppingsPrice : nonVegExtraToppingsPrice;
            bill += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if(paperbagAdded){
            bill += "Paper Bag Added: " + paperbag + "\n";
        }
        bill += "Total Price: " + getPrice() + "\n";
        return bill;
    }

}
