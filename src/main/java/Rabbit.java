public class Rabbit extends Animal{

    public Rabbit(String name, int age, String eyeColor) { super(name, age);}


    //public Cat(String name, int age) {super(name, age);}


    @Override
    public void play() {
        System.out.println("Rabbit: " + name + " is being still.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit " + name + " is playing with the toy " + toy);
    }
}
