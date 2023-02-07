
public class AnimalsTask2 {
    static int count = 0;
    private final String type;
    protected String name;
    private final int age;
    private final float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    AnimalsTask2(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        count++;
    }

    @Override
    public String toString() {
        return this.name + " " + this.type + " " + this.age + " " + this.weight + " " + this.isFly + " " + this.isWalk + " " + this.isSwim + " " +
                count;
    }
}

class BirdTask2 extends AnimalsTask2 {
    private String area;
    private boolean winterFly;

    public BirdTask2() {
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

class FishTask2 extends AnimalsTask2 {
    private String squamous;
    private boolean upStreamSwim;

    public FishTask2() {
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

class InsectTask2 extends AnimalsTask2 {

    private int wingCount;
    private boolean likeJesus;

    public InsectTask2() {
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

class MainTask2 {
    public static void main(String[] args) {
        AnimalsTask2 duck = new AnimalsTask2("Duck", "Donald", 3, 5.8f, true, true, true);
        System.out.println(duck);

        BirdTask2 b = new BirdTask2();
        b.setName("Bob");
        b.setArea("On the sea");
        b.setWinterFly(false);
        System.out.println(b);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirickChirick();


        FishTask2 f = new FishTask2();
        f.setName("Pike");
        f.setSquamous("Big");
        f.setUpStreamSwim(true);
        System.out.println(f);
        System.out.println(f.getSquamous());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        InsectTask2 i = new InsectTask2();
        i.setName("Insect Insectich");
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}