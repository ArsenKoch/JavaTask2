public class WritingMaterials2 {


    public boolean draw;
    String name;
    String color;
    int price;
    double length;
    boolean canDraw;

    public WritingMaterials2(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials2(String name, int price) {
        this.name = name;
        this.price = price;
        color = "Color";
    }

    public WritingMaterials2(int price, double length, boolean canDraw) {
        this.price = price;
        this.length = length;
        this.canDraw = canDraw;
        color = "Color";
        name = "No Name";
    }

    public WritingMaterials2(String name, String color, int price, double length, boolean canDraw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.canDraw = canDraw;
    }

    void display() {
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + (canDraw ? "Да" : "Нет"));
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
        if (canDraw) System.out.println(name + " провел линию. Ее цвет - " + color + ".");
        else System.out.println(name + " не может ничего нарисовать.");
    }
}
    class Main2{
        public static void main(String[] args) {
            WritingMaterials2 pen = new WritingMaterials2("ручка", "Красный", 145, 15.6, true);
            pen.display();
            pen.draw();
            pen.priceDown(10);
            pen.display();
            pen.priceUp(23);
            pen.display();
            pen.replaceRod("Синий");
            pen.draw();

            WritingMaterials2 ruler = new WritingMaterials2("линека", 34);
            ruler.display();
            ruler.draw();

            WritingMaterials2 wm1 = new WritingMaterials2(23, 67.8, false);
            wm1.display();
            wm1.draw();

            WritingMaterials2 wm2 = new WritingMaterials2("Циркуль", "Зелёный");
            wm2.draw = true;
            wm2.display();
            wm2.draw();
        }
    }


