public class Animals {
    private String name;
    private int age;
    private double weigth;

    public Animals() {
    }

    public Animals(String name, int age, double weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    public void walk(){
        System.out.println("животное идет по земле");
    }
}
