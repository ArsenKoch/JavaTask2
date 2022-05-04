public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public User(int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(int height, String name, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public static void main(String[] args) {

        User user17 = new User("Angela", (short) 18, 156);
        User user12 = new User("Kristina", 157, (short) 18);
        User user13 = new User((short) 17, 190, "Rita");
        User user14 = new User(173, (short) 18, "Polina");
        User user15 = new User((short) 17, "Marina", 160);
        User user16 = new User(180, "Kculya", (short) 19);
        System.out.println("Name : " + user13.name);
        System.out.println("Age : " + user13.age);
        System.out.println("Height : " + user13.height);
    }
}

