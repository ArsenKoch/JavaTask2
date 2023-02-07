public class AnimalTask1 {
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

    void rename(String s) {
    }
}

class MainAnimalTask1 {
    public static void main(String[] args) {
        AnimalTask1 tiger = new AnimalTask1();
        AnimalTask1 sparrow = new AnimalTask1();

        tiger.type = "Tiger";
        tiger.name = "Artem";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Anton");
        tiger.display();

        sparrow.type = "Pirate";
        sparrow.name = "Capitan Jack";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();
    }
}