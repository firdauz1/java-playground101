public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        coco.setName("coco II");

        System.out.println("Main: there's a cat called " + coco.getName() + " on the table");

        Dog max = new Dog("max", 5, "Peng");
        Rabbit snowWhite = new Rabbit("snowBall",5, "brown");
        Toy curiousGeorge = new Toy("ABC corp");

        Action[] homeFriends = new Action[4]; //even though arrays can only take elements of the same type, Cat and Dog class are inherited from same class Animal
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = snowWhite;
        homeFriends[3] = curiousGeorge;

        Toy legoCar = new Toy("Lego Truck");

        for (Action friend : homeFriends) {
            friend.play(legoCar);
        }
    }


}