public class Cat extends Animal {

        public void setName(String name) {
        this.name = name;
    }

        public String getName()
        {
            return name;
        }
        //constructor
    public Cat(String name, int age) {super(name, age);}

        @Override
        public void play() {
        System.out.println("CAT: " + name + " jumps on the table");
    }

        @Override //this compared to the override function above is an example of overloading
        public void play(Toy toy) {
        System.out.println("CAT: " + name + " is playing with the toy " + toy);
    }




    }

