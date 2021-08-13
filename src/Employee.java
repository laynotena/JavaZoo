import java.util.ArrayList;
public class Employee {
    public Employee(String name){
        this.name = name;
    }
    public String name;
    public void FeedAnimal(ArrayList<Animal> AnimalList){
        for (int i=0; i<AnimalList.size();i++){
            Animal a = AnimalList.get(i);
            if (a.MP<=0){
                this.feed(a);
            }
        }
    }
    public void TrainAnimal(ArrayList<Animal> AnimalList){
        for (int i=0; i<AnimalList.size();i++){
            Animal a = AnimalList.get(i);
            a.LV+=1;
            }
        }
    public void feed(Animal a){
        a.eat();
    }
}
