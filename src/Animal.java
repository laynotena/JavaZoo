public class Animal {
    
    public Animal(){
    private int count;
    public double height;
    public double weight;
    public int age;
    public String gender;
    public String name;
    public String type;
    public int HP = 100;
    public int MP;
    public int upper_MP;
    public int LV = 0;
    count++;
    }
    
    public void eat(){
        this.MP+=100;
        if (this.MP>=this.upper_MP){
            this.MP=this.upper_MP;
        }
    }
    
    public void sleep(){
        this.MP-=10;
        if (this.MP<=0){
            this.MP=0;
        }
    }
    
    public void move(){
        this.MP-=2;
        if (this.MP<=0){
            this.MP=0;
            this.eat();
        }
    }
    
    public void get_value(){
        System.out.println(this.type + " : " + this.name +" "+ this.gender+" 身高："+this.height + " (m) "+" 體重："+
                this.weight + "(kg) " + this.age + "歲 " +" HP:" +this.HP+ "   MP:"+this.MP+"  LV."+this.LV);
    }

}
