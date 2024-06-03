    public class Zoo {
        public static void main(String[] args) {
            Animal lion = new Lion("Simba", 5);
            Animal elephant = new Elephant("Dumbo", 10);
            Animal monkey = new Monkey("George", 3);

            lion.makeSound();
            lion.eat();
            lion.makeSound(3);
            lion.eat("meat");

            elephant.makeSound();
            elephant.eat();
            elephant.makeSound(2);
            elephant.eat("grass");

            monkey.makeSound();
            monkey.eat();
            monkey.makeSound(4);
            monkey.eat("bananas");
        }
    }