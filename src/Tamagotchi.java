public class Tamagotchi {
    private String name;
    private int energy;
    private String[] food;

    public Tamagotchi(){
        this.energy = (int)(Math.random()*10 + 10);
        food = new String[]{"Whopper", "Big mac", "Ramen", "Hawaii Pizza", "Block of cheese"};
    }

    public void setName(String name){
        this.name = name.trim();
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public String getName(){
        return name;
    }


    public int getEnergy(){
        return energy;
    }

    public void play(){
        setEnergy(energy - 1);
        System.out.println(name + " is playing with a ball! it's energi went down with 1");
    }

    public void feed(){
        int sum = getEnergy() + 1;
        energy = Math.min(sum, 20);
        System.out.println(name + " is feeding on a delicous " + food[(int)(Math.random() * 5)] + ", " + name + " it's energy went up by 1");
    }

    public void sleep(){
        int sum = getEnergy() + 1;
        energy = Math.min(sum, 20);
        System.out.println(name + " went to sleep, and her energy went up by 1");
    }

    public void pet(){
        int sum = energy - 1;
        energy = Math.min(sum, 20);
        System.out.println(getName() + " loved your peeting! it's energy went down with 1");
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", food='" + food + '\'' +
                '}';
    }
}
