public class Dog  extends Animal{
    @Override
    public void play(Toy toy) {
        System.out.println("DOG " + name + " is trying to eat the toy " + toy);

    }

    public Dog(String name, int age, String owner) {super(name, age);}

    @Override
    public void play() {
        System.out.println("Dog " + name + " is chasing its tail");

    }
}


