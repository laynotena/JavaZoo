import java.lang.reflect.Array;
import java.util.*;

public class Zoo {
    public ArrayList<Animal> AnimalList = new ArrayList();
    public void getAnimalInfo(Animal a){
        System.out.println(a.name + " : " + " 身高："+a.height + " (m) 體重："+a.weight + "(kg) " + a.age + "歲 " );
    }
    public void getAnimalStatus(Animal a){
        System.out.println(a.name+" :  HP:"+a.HP+" MP:"+a.MP+" LV."+a.LV);
    }
    public void getAnimalList()
    {
        System.out.println("目前動物園有 " + this.AnimalList.size() + " 隻動物");
        for(int i=0;i<this.AnimalList.size();i++){
            Animal a = AnimalList.get(i);
            System.out.println(i+1+". ("+a.type +") : " + a.name +" "+ a.gender);
        }
    }
    public void addAnimal(Animal a)
    {
        AnimalList.add(a);
    }
    public void askEmployeeFeed(Employee a){
        System.out.println(a.name+" feed animal !");
        a.FeedAnimal(AnimalList);
    }
    public void askEmployeeTrain(Employee a){
        System.out.println(a.name+" train animal !");
        a.TrainAnimal(AnimalList);
    }
}
