public class Duck extends Animals{
    public Duck() {
    }

    public Duck(String name, int age, double weigth) {
        super(name, age, weigth);
    }

    public void walk(){
        System.out.println("животное идет по земле");
    }
    public void move(){
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }
}

