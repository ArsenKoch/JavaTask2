
public class AnimalTask4 {
    private final String type;
    protected String name;
    private final int age;
    private final float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    AnimalTask4(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
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

class BirdTask4 extends AnimalTask4 {
    private String area;
    private boolean winterFly;

    public BirdTask4() {
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

class FishTask4 extends AnimalTask4 {
    private String squamous;
    private boolean upStreamSwim;

    public FishTask4() {
        super("Fish", null, 0, 0.0f, false, false, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquamous(String squamous) {
        this.squamous = squamous;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquamous() {
        return squamous;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    void bulBul() {
        System.out.println("Bul-bul");
    }
}

class InsectTask4 extends AnimalTask4 {
    private int wingCount;
    private boolean likeJesus;

    public InsectTask4() {
        super("Insect", null, 0, 0.0f, true, true, true);
    }

    void ggggg() {
        System.out.println("G-g-g-g-g");
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

class MainTask4 {
    public static void main(String[] args) {
        AnimalTask4 duck = new AnimalTask4("Duck", "Donald", 3, 5.8f, true, true, true);
        duck.display();

        BirdTask4 b = new BirdTask4();
        b.setName("Bob");
        b.display();
        b.setArea("On the sea");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirickChirick();

        Fish f = new Fish();
        f.setName("Pike");
        f.display();
        f.setSquamous("Big");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquamous());
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