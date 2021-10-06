public class Elephant extends Animal{
    private int count;
    public Elephant(double height, double weight, int age, String gender, String name){
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.type = "Elephant";
        this.upper_MP = 500;
        this.MP = 250;
        count++;
    }
    public void eat() {
        System.out.println("Elephant eat!");
        super.eat();
    }
    public void sleep(){
        System.out.println("Elephant sleep!");
        super.sleep();
        if (this.MP <= 0) {
            System.out.println("Elephant hungry!");
        }
    }
    static public getCount(){
        return count;
    }
    public void get_value(){
        super.get_value();
    }
}
