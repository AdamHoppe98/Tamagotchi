public class Cat extends Tamagotchi{

    public Cat(){}

    @Override
    public void play(int energyLost,int hungerGained){
        System.out.println(getName() + " is playing with a yarn ball!" );
        super.play(energyLost, hungerGained);
    }


}
