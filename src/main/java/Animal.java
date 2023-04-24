public abstract class Animal implements Action { //abstract class cannot be initialized in driver
    protected String name; //cannot be private when doing inheritance
    protected int age;
    protected String owner;

    protected String eyeColor;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


