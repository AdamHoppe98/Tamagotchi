public class Dog extends Tamagotchi {


    public Dog(){}

    @Override
    public void play(int energyLost, int hungerGained){
        System.out.println(getName() + " is playing with a tennis ball!" );
        super.play(energyLost, hungerGained);
    }
}
