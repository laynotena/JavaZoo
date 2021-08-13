public class Toucan extends Animal{
    public Toucan(double height, double weight, int age, String gender, String name){
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.type = "Toucan";
        this.upper_MP = 100;
        this.MP = 50;
    }
    public void eat(){
        super.eat();
        System.out.println("Toucan eat!");
    }
    public void sleep(){
        System.out.println("Toucan sleep!");
        super.sleep();
        if (this.MP <= 0) {
            System.out.println("Toucan hungry!");
        }
    }
    public void get_value(){
        super.get_value();
    }
}
