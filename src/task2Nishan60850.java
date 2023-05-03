abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal() {
        this.name = "unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();

    public abstract String getVoice();

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Weight: " + this.weight;
    }
}

class Mammal extends Animal {
    public Mammal() {
        super();
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mammal(String name) {
        super(name, 0, 0.0);
    }

    public void eat() {
        System.out.println("Mammal is eating");
    }

    public String getVoice() {
        return "Mammal voice";
    }
}

class Dog extends Mammal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name) {
        super(name, 0, 0.0);
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public String getVoice() {
        return "Bark!";
    }

    public String toString() {
        return "Dog: " + super.toString();
    }
}

class Fish extends Animal {
    public Fish() {
        super();
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Fish(String name) {
        super(name, 0, 0.0);
    }

    public void eat() {
        System.out.println("Fish is eating");
    }

    public String getVoice() {
        return "Fish voice";
    }
}

class Blowfish extends Fish {
    public Blowfish() {
        super();
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Blowfish(String name) {
        super(name, 0, 0.0);
    }

    public void puff() {
        System.out.println("Blowfish is puffing");
    }

    public void eat() {
        System.out.println("Blowfish is eating");
    }

    public String getVoice() {
        return "Silent!";
    }

    public String toString() {
        return "Blowfish: " + super.toString();
    }
}

class Bird extends Animal {
    protected String featherColor;

    public Bird() {
        super();
        this.featherColor = "unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        super(name, 0, 0.0);
        this.featherColor = "unknown";
    }

    public String getFeatherColor() {
        return this.featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void eat() {
        System.out.println("Bird is eating");
    }

    public String getVoice() {
        return "Bird voice";
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Weight: " + this.weight + ", Feather color: " + this.featherColor;
    }
}

class Pigeon extends Bird {
    protected String species;

    public Pigeon() {
        super();
        this.species = "unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name) {
        super(name, 0, 0.0, "unknown");
        this.species = "unknown";
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void coo() {
        System.out.println("Coo coo!");
    }

    public void eat() {
        System.out.println("Pigeon is eating");
    }

    public String getVoice() {
        return "Coo!";
    }

    public String toString() {
        return "Pigeon: " + super.toString() + ", Species: " + this.species;
    }
}

public class task2Nishan60850 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Buddy", 3, 12.5);
        animals[1] = new Blowfish("Bubbles", 1, 0.3);
        animals[2] = new Pigeon("Pepper", 2, 0.2, "gray", "Rock dove");
        animals[3] = new Bird("Sparrow");

        for (Animal animal: animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());
            System.out.println();
        }

        ((Dog) animals[0]).bark();
        ((Blowfish) animals[1]).puff();
        ((Pigeon) animals[2]).coo();
    }
}