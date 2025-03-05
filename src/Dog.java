public class Dog extends Tamagotchi {


    public Dog(){}

    @Override
    public void play(){
        int sum = getEnergy() - 1;
        setEnergy(Math.min(sum, 20));
        System.out.println(getName() + " is playing with a tennis ball! it's energi went down with 1" );
    }
}
