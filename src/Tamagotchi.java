public class Tamagotchi {


    private String name;
    private int energy = (int)(Math.random()*10 + 10);
    private final String[] food = {"Whopper", "Big mac", "Ramen", "Hawaii Pizza", "Block of cheese"};
    private int hunger = 0;
    private final int ENERGY_LIMIT = 20;


    public void setName(String name){
        this.name = name.trim();
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }


    public int getHunger(){
        return hunger;
    }

    public String getName(){
        return name;
    }


    public int getEnergy(){
        return energy;
    }

    public String getRandomFood(){
        return food[(int)(Math.random() * 5)];
    }

    public void play(int energyLost,int hungerGained){
        setEnergy(energy - energyLost);
        hunger = hunger + hungerGained;
        System.out.println("its energi went down with " + energyLost + ", and its hunger went up by " + hungerGained);
        System.out.println();
    }

    public void feed(int energyLost, int decreaseHunger){
        int sum = getEnergy() + energyLost;
        energy = Math.min(sum, ENERGY_LIMIT);
        System.out.println(name + " is feeding on a delicious " + getRandomFood() + ", " + name + " its energy went up by " + energyLost);
        System.out.println();
        hunger =- decreaseHunger;
        hunger = Math.max(0,hunger);
    }

    public void sleep(int energyGained, int hungerGained){
        int sum = getEnergy() + energyGained;
        energy = Math.min(sum, ENERGY_LIMIT);
        hunger = hunger + hungerGained;
        System.out.println(name + " went to sleep. its energy went up by " + energyGained + ", and its hunger went up by " + hungerGained);
        System.out.println();

    }

    public void pet(int energyLost, int hungerGained){
        int sum = energy - energyLost;
        energy = Math.min(sum, 20);
        hunger = hunger + hungerGained;
        System.out.println(getName() + " loved your peeting! its energy went down with " + energyLost + ", and its hunger went up by " + hungerGained);
        System.out.println();

    }

}
