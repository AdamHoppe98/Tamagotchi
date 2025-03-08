import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tamagotchi tm = gameStart(scanner);
        boolean isAlive = true;
        while (isAlive) {

            isAlive = gameGoing(scanner, tm);

            if (tm.getEnergy() < 5 && isAlive) {
                isAlive = energyStatus(tm);
            }

            if (tm.getHunger() > 4 && isAlive) {
                isAlive = foodStatus(tm);
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

                    System.out.println("⠀⠀⠀⣠⠖⠒⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠒⠒⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⢠⡏⠀⠀⠀⠈⠓⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠁⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⣸⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡤⠤⠤⠤⠤⠤⠤⣤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⢀⡏⠀⠀⠀⠀⠀⣀⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⣸⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⢀⡴⠊⠉⠀⠀⠈⠉⠲⢄⠀⠀⠀");
                    System.out.println("⣿⠀⣀⣀⣀⠀⠈⠻⢿⠿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⠿⠃⠀⠀⢀⣀⣀⣀⠀⠀⡇⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡄⠀");
                    System.out.println("⢸⠀⢀⣀⣉⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣉⣀⠀⠀⢰⠇⠀⠀⠀⠀⢸⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄");
                    System.out.println("⠀⢧⡉⠉⠉⠀⠀⠀⠀⠀⠀⠈⠳⠶⠊⠙⠦⠴⠊⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠉⠉⢠⠞⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇");
                    System.out.println("⠀⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠘⠢⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿");
                    System.out.println("⠀⠀⠀⠀⠙⠦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⡯⠤⠤⠤⠤⠤⢤⣄⡀⠀⠀⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⢀⡇");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠉⠳⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠒⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⣄⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⣼⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡋⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢙⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⣠⠞⠁⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡧⠀⠀⢀⡴⠃⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⢀⡤⠛⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⢧⡀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠙⠢⣇⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⣿⠛⠙⠋⠛⠛⠒⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⠀⠀⠀⠈⡇⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠽⠀⠀⠀⢀⡧⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⡀⢸⠀⠀⣏⠀⢰⠀⠀⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⢸⡅⠀⡖⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠒⠒⠚⠓⠚⠲⠶⠖⠒⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠓⠒⠖⠒⠒⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                    return tm;
                }
                case "dog", "dawg", "d", "2": {
                    System.out.println("So you would like a Dog!!, but what should it's name be?");
                    Tamagotchi tm = new Dog();

                    tm.setName(scanner.nextLine().trim());
                    System.out.println("okay, here is your dog " + tm.getName());
                    System.out.println("⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⢀⡤⠞⠋⠉⠀⠀⠀⠀⠀⠀⠀⠉⠙⠳⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⣠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡆⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⢠⠇⠀⢰⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⡄⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⢸⠀⠀⢸⠀⠀⢰⣶⡀⠀⠀⠀⢠⣶⡀⠀⠀⡇⠀⢸⠂⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠈⢧⣀⢸⡄⠀⠀⠉⠀⠀⠀⠀⠀⠉⠀⠀⢠⡇⣠⡞⠁⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠉⠙⣇⠀⠂⠀⠀⢶⣶⣶⠀⠄⠀⠀⣾⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠘⢦⡀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⢠⠞⠓⠤⣤⣀⣀⣠⣤⠴⠚⠉⠑⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⢸⠀⠀⣀⣠⣀⣀⣠⣀⡀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⢸⠀⠰⡇⠀⠈⠁⠀⠈⡧⠀⠀⠀⠀⠀⠀⠀⠈⢦⠀⠀⢠⠖⡆");
                    System.out.println("⠀⠀⠀⠀⢸⠀⠀⠑⢦⡀⠀⣠⠞⠁⠀⢸⠀⠀⠀⠀⠀⠀⠈⣷⠞⠋⢠⠇");
                    System.out.println("⠀⠀⠀⠀⢸⠀⠀⠀⠀⠙⡞⠁⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⢹⢀⡴⠋⠀");
                    System.out.println("⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⡞⠉⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⢸⡀⠀⠀⠀⢠⣧⠀⠀⠀⠀⣸⡀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠈⠳⠦⠤⠴⠛⠈⠓⠤⠤⠞⠁⠉⠛⠒⠚⠋⠁⠀⠀⠀⠀⠀⠀");

                    return tm;
                }
                default:
                    System.out.println("it has to be a cat or dawg ");
            }
        }
    }

    public static boolean gameGoing(Scanner scanner, Tamagotchi tm) {

        while (true) {
            System.out.println("what would you like to do?");
            System.out.println("1 - play");
            System.out.println("2 - feed");
            System.out.println("3 - sleep");
            System.out.println("4 - pet");
            System.out.println("5 - stop playing, but know " + tm.getName() + " will die!");

            switch (scanner.nextLine().trim().toLowerCase()) {
                case "1": {
                    tm.play(1,1);
                    return true;
                }
                case "2": {
                    tm.feed(1, 10);
                    return true;
                }
                case "3": {
                    tm.sleep(3,1);
                    return true;
                }
                case "4": {
                    tm.pet(1,1);
                    return true;
                }
                case "5": {
                    System.out.println("\033[31m" + tm.getName() + " died a horrible death!\033[37m");
                    return false;
                }
                default:
                    System.out.println("you stupido");
            }
        }
    }

    public static boolean energyStatus(Tamagotchi tm) {

        if (tm.getEnergy() > 0 && tm.getEnergy() < 5) {
            System.out.println(tm.getName() + " low on energy");
            System.out.println();
            return true;
        }

        if (tm.getEnergy() <= 0) {
            System.out.println("\033[31myour " + tm.getName() + " has died!!!\033[37m ");
            System.out.println();
            return false;
        }
        return true;
    }

    public static boolean foodStatus(Tamagotchi tm) {
        if (tm.getHunger() >= 15) {
            System.out.println("\033[31m" + tm.getName() + " died of HUNGER!!!!\033[37m  🤤");
            return false;
        }else if (tm.getHunger() < 8) {
            System.out.println();
            System.out.println(tm.getName() + " is Starting to get hungry!");
            System.out.println();
            return true;
        } else {
            System.out.println();
            System.out.println("\033[33m" + tm.getName() + " is Starting to get REALLY hungry\033[37m 🍔🍕");
            System.out.println();
            return true;
        }
    }


}
