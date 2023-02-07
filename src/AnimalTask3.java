class AnimalTask3 {
    protected String type;
    protected String name;
    final private int age;
    final private float weight;
    final private boolean isFly;
    final private boolean isWalk;
    final private boolean isSwim;

    {
        name = "No name";
        type = "No type";
    }

    AnimalTask3(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
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
}

class Bird extends AnimalTask3 {

    private String area;
    private boolean winterFly;

    {
        name = "Sparrow";
        type = "Bird";
    }

    public Bird() {
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

class Fish extends AnimalTask3 {

    private String squamous;
    private boolean upStreamSwim;

    {
        name = "Pike";
        type = "Fish";
    }

    public Fish() {
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

class Insect extends AnimalTask3 {

    private int wingCount;
    private boolean likeJesus;

    {
        name = "Tarkan";
        type = "Insect";
    }

    public Insect() {
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


class Main23 {
    public static void main(String[] args) {
        AnimalTask3 duck = new AnimalTask3("Duck", "Donald", 3, 5.8f, true, true, true);
        duck.display();

        Bird b = new Bird();
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