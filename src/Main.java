import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        testAnimal(dog);
        Animal duck = new Duck();
        testAnimal(duck);
        Animal turtle = new Turtle();
        testAnimal(turtle);


        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Welcome to Animal creation");
        System.out.println("==========================\n");
        System.out.print("Which animal you want: ");
        String animalName = sc.nextLine();
        System.out.print("Animal's food: ");
        String animalFood = sc.nextLine();
        System.out.print("Animal's voice: ");
        String animalVoice = sc.nextLine();
        System.out.print("What is animal's covering: ");
        String animalCovering = sc.nextLine();
        System.out.print("Can animal fly: ");
        String animalFly = sc.nextLine();
        System.out.print("Total number of animal's leg: ");
        Integer animalLegs = sc.nextInt();

        Animal userAninmal = new UserAninmal(animalName, animalFood, animalCovering, animalVoice, animalFly, animalLegs);
        testAnimal(userAninmal);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nWish to modify the animal's legs");
        String userChoice = sc1.nextLine();
        if (userChoice.toLowerCase().equals("yes")) {
            System.out.print("Total number of animal's leg: ");
            Integer animalNewLegs = sc1.nextInt();
            UserAninmal.setLegs(animalNewLegs);
            System.out.println(userAninmal.walk());
        } else {
            return;
        }

    }

    public static void testAnimal(Animal animal) {
        //concatenate all output together
        String output = animal.speak();
        output += "\n" + animal.eat();
        output += "\n" + animal.pet();
        output += "\n" + animal.fly();
        output += "\n" + animal.walk();
        //print all output at once per test
        System.out.println("\n" + output);
    }
}