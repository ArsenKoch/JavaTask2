/**
 * Запретите наследование от класса Fish,
 * переопределение метода rename у класса Animal
 * и изменение свойства description.
 */
public class Animal4 {
        final static String description = "ebelex";
        final private String type;
        protected String name;
        final private int age;
        final private float weight;
        final private boolean isFly;
        final private boolean isWalk;
        final private boolean isSwim;

        public Animal4(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
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
        final void rename(String s ) {
            name = s;
        }
    }

    class Bird4 extends Animals {

        private String area;
        private boolean winterFly;

        public Bird4() {
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

    final class Fish4 extends Animals {

        private String squama;
        private boolean upStreamSwim;

        public Fish4() {
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

    class Insect4 extends Animals {

        private int wingCount;
        private boolean likeJesus;

        public Insect4() {
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


    class Main23123 {
        public static void main(String[] args) {
            Animals duck = new Animals("Утка", "Утя", 3, 5.8f, true, true, true);
            duck.display();

            Bird4 b = new Bird4();
            b.setName("Bob");
            b.display();
            b.setArea("На югах");
            b.setWinterFly(false);
            System.out.println(b.getArea());
            System.out.println(b.isWinterFly());
            b.chirickChirick();

            Fish4 f = new Fish4();
            f.setName("Сельд");
            f.display();
            f.setSquama("Крупная");
            f.setUpStreamSwim(true);
            System.out.println(f.getSquama());
            System.out.println(f.isUpStreamSwim());
            f.bulBul();

            Insect4 i = new Insect4();
            i.setName("Жук Жукыч");
            i.display();
            i.setWingCount(4);
            i.setLikeJesus(true);
            System.out.println(i.getWingCount());
            System.out.println(i.isLikeJesus());
            i.ggggg();
        }
    }

