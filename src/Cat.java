public class Cat extends Tamagotchi{

    public Cat(){}

    @Override
    public void play(){
        setEnergy(getEnergy() - 1);

        System.out.println(getName() + " is playing with a yarn ball! it's energy went down with 1" );
    }

    @Override
    public void pet(){
        int sum = getEnergy() - 1;
        setEnergy(Math.min(sum, 20));
        System.out.println(getName() + " loved your petting! it's energy went down with 1");
    }

}
