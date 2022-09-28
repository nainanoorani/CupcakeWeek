import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        //red velvet
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");
        String rvPriceText = input.nextLine();
        double rvPrice = Double.parseDouble(rvPriceText);
        redVelvet.setPrice(rvPrice);
        //chocolate
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places)");
        String cPriceText = input.nextLine();
        double cPrice = Double.parseDouble(cPriceText);
        chocolate.setPrice(cPrice);
         //add to array list
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
        //Drink Menu
        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();
        System.out.println("We are deciding on the price for our water. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);
        System.out.println("We are deciding on the price for our soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);
        System.out.println("We are deciding on the price for our milk. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        new Order(cupcakeMenu,drinkMenu);
    }
}

class Cupcake{
    public double price;

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting.");
    }
}

class RedVelvet extends Cupcake{
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

class Drink{
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void type(){
        System.out.println("A bottle of water.");
    }
}

class Soda extends Drink{
    @Override
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

class Milk extends Drink{
    @Override
    public void type() {
        System.out.println("A bottle of milk.");
    }
}