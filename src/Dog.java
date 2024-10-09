public class Dog extends Animals{
    public Dog() {
    }

    public Dog(String name, int age, double weigth) {
        super(name, age, weigth);
    }
@Override
    public void move(){
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле");
    }
}
