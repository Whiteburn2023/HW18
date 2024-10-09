public class Main {
    public static void main(String[] args) {
        Animals dog = new Dog("Жучка", 3, 4.5);
        dog.move();
        dog.walk();


        Animals duck = new Duck("кря", 2, 3);
        duck.move();
        duck.walk();

        Animals cat = new Cat("Мурка", 4, 3);
        cat.move();
        cat.walk();


    }
}
