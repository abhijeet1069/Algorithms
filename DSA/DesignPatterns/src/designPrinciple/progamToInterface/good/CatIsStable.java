package designPrinciple.progamToInterface.good;

//Food interface
interface Food {
 int getNutrition();
}

//Sausage class implementing Food
class Sausage implements Food {
 private int nutrition;
 private String color;
 private String expiration;

 // Constructor
 public Sausage(int nutrition, String color, String expiration) {
     this.nutrition = nutrition;
     this.color = color;
     this.expiration = expiration;
 }

 // Implement getNutrition from Food interface
 @Override
 public int getNutrition() {
     return nutrition;
 }

 // Additional methods
 public String getColor() {
     return color;
 }

 public String getExpiration() {
     return expiration;
 }
}

//Milk class implementing Food
class Milk implements Food {
 private int nutrition;
 private String type;
 private String expiration;

 // Constructor
 public Milk(int nutrition, String type, String expiration) {
     this.nutrition = nutrition;
     this.type = type;
     this.expiration = expiration;
 }

 // Implement getNutrition from Food interface
 @Override
 public int getNutrition() {
     return nutrition;
 }

 // Additional methods
 public String getType() {
     return type;
 }

 public String getExpiration() {
     return expiration;
 }
}

//Cat class
class Cat {
 private int energy;

 // Constructor
 public Cat(int initialEnergy) {
     this.energy = initialEnergy;
 }

 // Method to make the cat eat any Food
 public void eat(Food food) {
     System.out.println("Cat is eating the food.");
     energy += food.getNutrition();  // Increase cat's energy by the nutrition value of the food
 }

 public int getEnergy() {
     return energy;
 }
}

//Main class
public class CatIsStable {
 public static void main(String[] args) {
     // Create instances of Sausage and Milk
     Food sausage = new Sausage(50, "brown", "2024-12-01");
     Food milk = new Milk(30, "whole", "2024-11-30");

     // Create a Cat instance with initial energy
     Cat cat = new Cat(100);

     System.out.println("Initial energy of the cat: " + cat.getEnergy());

     // Cat eats the sausage
     cat.eat(sausage);
     System.out.println("Energy of the cat after eating sausage: " + cat.getEnergy());

     // Cat drinks the milk (treating it as food)
     cat.eat(milk);
     System.out.println("Energy of the cat after drinking milk: " + cat.getEnergy());
 }
}
