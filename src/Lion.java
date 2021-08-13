public class Lion extends Animal{
    public Lion(double height, double weight, int age, String gender, String name){
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.type = "Lion";
        this.upper_MP = 200;
        this.MP = 100;
    }
    public void eat(){
        System.out.println("Lion eat!");
        super.eat();
    }
    public void sleep() {
        System.out.println("Lion sleep!");
        super.sleep();
        if (this.MP <= 0) {
            System.out.println("Lion hungry!");
        }
    }
    public void get_value(){
        super.get_value();
    }
}
