public class Cat extends Animals{
    public Cat() {
    }

    public Cat(String name, int age, double weigth) {
        super(name, age, weigth);
    }
@Override
    public void move(){
        System.out.println("Кошка по кличке " + super.getName() + " бежит по земле");
    }
}
