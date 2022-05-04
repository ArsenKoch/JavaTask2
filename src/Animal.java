public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;


    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }


    String rename(String s) {
        return name.replace(name, s);
    }


}

class Main4 {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        Animal sparrow = new Animal();

        tiger.type = "tiger";
        tiger.name = "Artem";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Anton");
        tiger.display();

        sparrow.type = " ыввы";
        sparrow.name = "Capitan Jack";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();



    }
}
