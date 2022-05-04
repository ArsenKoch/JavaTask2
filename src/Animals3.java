/**
 * Добавьте автоматическую нумерацию создания всех животных и наследников. Используйте при этом статическое поле.
 * Так же, для удобства, сгенерируйте классу Animal  метод toString(),
 * который выводил бы подробную информацию о животном (данные по всем полям, включая номер).
 * Вывод номера в метод display() не добавляйте.
 */
public class Animals3 {
    static int count = 0;
    private final String type;
    protected String name;
    private final int age;
    private final float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    Animals3(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
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

class Bird3 extends Animals3 {

    private String area;
    private boolean winterFly;

    public Bird3() {
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

class Fish3 extends Animals3 {

    private String squama;
    private boolean upStreamSwim;

    public Fish3() {
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

class Insect3 extends Animals3 {

    private int wingCount;
    private boolean likeJesus;

    public Insect3() {
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


class Main2312 {
    public static void main(String[] args) {
        Animals3 duck = new Animals3("Duck", "Duckas", 3, 5.8f, true, true, true);
        System.out.println(duck);

        Bird3 b = new Bird3();
        b.setName("Bob");
        b.setArea("On ugs");
        b.setWinterFly(false);
        System.out.println(b);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirickChirick();


        Fish3 f = new Fish3();
        f.setName("Fishka");
        f.setSquama("Big");
        f.setUpStreamSwim(true);
        System.out.println(f);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect3 i = new Insect3();
        i.setName("Insect Insectich");
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

