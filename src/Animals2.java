/**
 * Добавьте классу Animal статичный метод на ваш вкус и статичное свойство String description,
 * в котором будет храниться описание класса.
 * Убедитесь, что его нельзя вызвать у объекта, но можно вызвать у класса.
 */
public class Animals2 {
    static String description = "ebelex";
    private final String type;
    protected String name;
    private final int age;
    private final float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    Animals2(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }

    void InfoDescription() {
        System.out.println("It's secret , bro!");
    }
}

class Bird1 extends Animals2 {

    private String area;
    private boolean winterFly;

    public Bird1() {
        super("Bird", null, 0, 0.0f, true, true, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    void chirickChirick() {
        System.out.println("Chirik-Chirik");
    }

}

class Fish1 extends Animals2 {

    private String squama;
    private boolean upStreamSwim;

    public Fish1() {
        super("Fish", null, 0, 0.0f, false, false, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquama() {
        return squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    void bulBul() {
        System.out.println("Bul-bul");
    }

}

class Insect1 extends Animals2 {

    private int wingCount;
    private boolean likeJesus;

    public Insect1() {
        super("Insect", null, 0, 0.0f, true, true, true);
    }

    void ggggg() {
        System.out.println("Ggggg");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }
}


class Main2356 {
    public static void main(String[] args) {
        Animals2 duck = new Animals2("Duck", "Duckas", 3, 5.8f, true, true, true);
        duck.display();

        Bird1 b = new Bird1();
        b.setName("Bob");
        b.display();
        b.setArea("On ugs");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirickChirick();


        Fish f = new Fish();
        f.setName("Fishka");
        f.display();
        f.setSquama("Big");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect i = new Insect();
        i.setName("Insect Insectich");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

