public class WritingMaterials251 {
    protected String name;
    private final String color;
    private final int price;
    protected double length;
    private final boolean canDraw;

    public WritingMaterials251(String name, String color, int price, double length, boolean canDraw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.canDraw = canDraw;
    }

    void display() {
        System.out.println("Name : " + name + ", Color : " + color + ", Length : " + length + ", Price : " + price + ", Can Draw : " + (canDraw ? "Yes" : "No"));
    }
}

class Pen extends WritingMaterials251 {
    int countColor;
    boolean auto;

    public Pen() {
        super("Pen", null, 0, 0.0f, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    void writeMyName() {
        System.out.println("My name is Arsen");
    }

    @Override
    void display() {
        System.out.println("This is " + Pen.class);
        super.display();
        System.out.println("Is Auto : " + auto);
        System.out.println("Count Color : " + countColor);
    }
}

class Ruler extends WritingMaterials251 {
    boolean wood;

    public Ruler() {
        super("Ruler", null, 0, 0.0f, false);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public boolean isWood() {
        return wood;
    }

    public double getLength() {
        return length;
    }

    void measure() {
        System.out.println("Now we measure the length.");
    }

    @Override
    void display() {
        System.out.println("This is " + Ruler.class);
        super.display();
        System.out.println("Is Wood :" + wood);
    }
}

class Divider extends WritingMaterials251 {
    String dividerType;
    boolean metal;

    public Divider() {
        super("Divider", null, 0, 0.0f, true);
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDividerType() {
        return dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    void drawCircle() {
        System.out.println("A circle is drawn.");
    }

    @Override
    void display() {
        System.out.println("This is " + Divider.class);
        super.display();
        System.out.println("Divider Type : " + dividerType);
        System.out.println("Metal : " + metal);
    }

}

class Main {
    public static void main(String[] args) {
        WritingMaterials251 wm = new WritingMaterials251("Pen", "Red", 145, 15.6f, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Parker");
        p.setCountColor(2);
        p.setAuto(false);
        p.display();
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Ruler");
        r.setLength(25);
        r.setWood(true);
        r.display();
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Divider");
        d.setDividerType("With pencil");
        d.setMetal(true);
        d.display();
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.drawCircle();
    }
}