package designPrinciple.progamToInterface.bad;

class Sausage {
    private int nutrition;
    private String color;
    private String expiration;

    // Constructor
    public Sausage(int nutrition, String color, String expiration) {
        this.nutrition = nutrition;
        this.color = color;
        this.expiration = expiration;
    }

    // Getter methods
    public int getNutrition() {
        return nutrition;
    }

    public String getColor() {
        return color;
    }

    public String getExpiration() {
        return expiration;
    }
}

class Cat {
    private int energy;

    // Constructor
    public Cat(int initialEnergy) {
        this.energy = initialEnergy;
    }

    // Method to make the cat eat a sausage
    // If I add new food, I have to add another method in cat. Thus cat is fanning out.
    public void eat(Sausage s) {
        System.out.println("Cat is eating the sausage.");
        energy += s.getNutrition();  // Increase cat's energy by the nutrition value of the sausage
    }

    public int getEnergy() {
        return energy;
    }
}

public class CatFansOut {
    public static void main(String[] args) {
        // Create a Sausage instance
        Sausage sausage = new Sausage(50, "brown", "2024-12-01");

        // Create a Cat instance with initial energy
        Cat cat = new Cat(100);

        System.out.println("Initial energy of the cat: " + cat.getEnergy());

        // Cat eats the sausage
        cat.eat(sausage);

        System.out.println("Energy of the cat after eating: " + cat.getEnergy());
    }
}

