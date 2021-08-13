public class RUN_ZOO {
    public static void main(String args[]){
        Zoo myZoo = new Zoo();
        Employee Jack = new Employee("Jack");
        Employee Jessica = new Employee("Jessica");
        Lion l = new Lion(1.3, 1.2, 3, "F", "小西吉");
        Toucan t = new Toucan(0.6, 0.03, 2, "M", "大嘴鳥");
        Elephant e = new Elephant(2,2560, 4, "M","小均");
        myZoo.addAnimal(l);
        myZoo.addAnimal(t);
        myZoo.addAnimal(e);
        myZoo.getAnimalList();
        for(int i=0;i<myZoo.AnimalList.size();i++)
        {
            myZoo.getAnimalInfo(myZoo.AnimalList.get(i));
        }
        for(int i=0;i<myZoo.AnimalList.size();i++)
        {
            myZoo.getAnimalStatus(myZoo.AnimalList.get(i));
        }
        l.get_value();
        for(int i =0; i<10; i++){
            l.sleep();
            l.get_value();
        }
        myZoo.askEmployeeFeed(Jack);
        myZoo.askEmployeeTrain(Jack);
        for(int i=0;i<myZoo.AnimalList.size();i++) {
            myZoo.getAnimalStatus(myZoo.AnimalList.get(i));
        }
    }
}
