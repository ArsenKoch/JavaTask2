public class WritingMaterials3 {
    String name;
    String color;
    int price;
    double length;
    boolean canDraw;

    void display() {
        System.out.println("Name: " + name + ", Color: " + color + ", Length: " + length + ", Price: " + price + ", Can draw: " + (canDraw ? "Yes" : "No"));
    }

    void replaceRod(String newColor) {
        color = newColor;
    }

    void priceUp(int up) {
        price += up;
    }

    void priceDown(int down) {
        price -= down;
    }

    void draw() {
        if (canDraw) System.out.println(name + " drew a line. Her color - " + color + ".");
        else System.out.println(name + " can't draw anything.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCanDraw(boolean canDraw) {
        this.canDraw = canDraw;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    public boolean isCanDraw() {
        return canDraw;
    }
}

class Main3 {
    public static void main(String[] args) {
        WritingMaterials3 pen = new WritingMaterials3();
        pen.setName("Pen");
        pen.setColor("Red");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setCanDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replaceRod("Blue");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isCanDraw());
    }
}