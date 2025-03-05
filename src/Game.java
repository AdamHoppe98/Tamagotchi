import javax.xml.namespace.QName;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tamagotchi tm = gameStart(scanner);
        boolean running = true;
        int foodCounter = 0;
        while (running){
        running = gamegGoing(scanner,tm);
        if (tm.getEnergy() < 5 && running){
            running = energyStatus(tm);
        }
        }

    }

    public static Tamagotchi gameStart(Scanner scanner) {
        while (true) {
            System.out.println("Hello, would you like to create a Cat or a Dog?");
            switch (scanner.nextLine().trim().toLowerCase()) {
                case "cat", "c", "tiger", "1": {
                    Tamagotchi tm = new Cat();
                    System.out.println("So you would like a cat!!, but what should it's name be?");
                    tm.setName(scanner.nextLine().trim());
                    System.out.println("okay, here is your cat " + tm.getName());
                    System.out.println("🐯");

                    return tm;
                }
                case "dog", "dawg", "d", "2": {
                    System.out.println("So you would like a Dog!!, but what should it's name be?");
                    Tamagotchi tm = new Dog();

                    System.out.println("okay, here is your dog " + tm.getName());
                    tm.setName(scanner.nextLine().trim());
                    System.out.println("🐶");
                    return tm;
                }
                default:
                    System.out.println("it has to be a cat or dawg ");
            }
        }
    }

    public static boolean gamegGoing(Scanner scanner, Tamagotchi tm) {

        while (true) {
            System.out.println("what would you like to do?");
            System.out.println("1 - pla y");
            System.out.println("2 - feed");
            System.out.println("3 - sleep");
            System.out.println("4 - pet");
            System.out.println("5 - stop playing, but know " + tm.getName() + " will die!");

            switch (scanner.nextLine().trim().toLowerCase()) {
                case "1": {
                    tm.play();
                    return true;
                }
                case "2": {
                    tm.feed();
                    return true;
                }
                case "3": {
                    tm.sleep();
                    return true;
                }
                case "4":{
                    tm.pet();
                    return true;
                }
                case "5":{
                    System.out.println(tm.getName() + " died a horrible death!");
                    return false;
                }
                default:
                    System.out.println("you stupido");
            }
        }
    }
    public static boolean energyStatus(Tamagotchi tm){

        if (tm.getEnergy() > 0 && tm.getEnergy() < 5){
            System.out.println(tm.getName() + " low on energy");
            return true;
        }
        if (tm.getEnergy() <= 0){
            System.out.println("your " + tm.getName() + " has died!!! ");
            return false;
        }
        return true;
    }


}
