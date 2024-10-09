public class Dog extends Animals{
    public Dog() {
    }

    public Dog(String name, int age, double weigth) {
        super(name, age, weigth);
    }

    public void walk(){
        System.out.println("животное идет по земле");
    }
    public void move(){
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле");
    }
}
