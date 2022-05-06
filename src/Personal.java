abstract class Personal {
     int count = 0;
    protected String name;
    protected String lastName;
    protected String birthday;
    protected String document;
    protected String education;
    protected boolean married;


    {
        name = "No name";
        lastName = "No Last Name";
    }

    Personal(String name, String lastName, String birthday, String document) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.document = document;
        count++;
    }

    Personal(String name, String lastName, String birthday, String document, String education, boolean married) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        document = "Passport";
        this.education = education;
        this.married = married;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\n" + "LastName : " + this.lastName + "\n " + "Birthday : " + this.birthday + "\n "
                + "Document : " + this.document + "\n " + "Education : " + this.education + "\n"
                + "Married : " + (this.married ? "Yes" : "No") + "\n"+count;

    }
}

class Worker extends Personal implements WorkerManual {
    protected int salary;
    protected int hoursWorking;
    protected String position;


    Worker(String name, String lastName, String birthday, String document, String education, boolean married) {
        super(name, lastName, birthday, document, education, married);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHoursWorking() {
        return hoursWorking;
    }

    public void setHoursWorking(int hoursWorking) {
        this.hoursWorking = hoursWorking;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\n" + "LastName : " + this.lastName + "\n" + "Birthday : " +
                this.birthday + "\n"
                + "Document : " + this.document + "\n" + "Education : " + this.education + "\n"
                + "Married : " + (this.married ? "Yes" : "No");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello , readers!");
    }

    @Override
    public void sayBye() {
        System.out.println("Come again, we will be glad to meet you!");
    }
}

class Client extends Personal {

    Client(String name, String lastName, String birthday, String document) {
        super(name, lastName, birthday, document);
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\n" + "LastName : " + this.lastName + "\n" + "Birthday : " +
                this.birthday + "\n"
                + "Document : " + this.document;
    }
    void helloWorker(String nameWorker) {
        System.out.println("Hello , " + nameWorker);
    }
    void helloWorker(String nameWorker,String lastName) {
        System.out.println("Hello , " + nameWorker +" "+lastName);
    }
    void helloWorker(int num) {
        System.out.println("Hello , " + num + " workers.");
    }
}

class Book {
    protected String title;
    protected String type;
    protected String author;
    protected int yearOfPublication;
    protected String publishingHouse;

    {
        title = null;
        author = null;
        yearOfPublication = 0;
        publishingHouse = null;

    }

    Book(String title, String type, String author, int yearOfPublication, String publishingHouse) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Title : " + this.title + "\n" + "Type : " + this.type + "\n" + "Author : " +
                this.author + "\n" + "Year of publication : " +
                this.yearOfPublication + "\n" + "Publishing house : " + this.publishingHouse;
    }
}

interface WorkerManual {
    void sayHello();

    void sayBye();
}

class Main8 {
    public static void main(String[] args) {
        System.out.println("Workers");
        System.out.println(" ");

        Worker worker1 = new Worker("Andrey","Efremov","06.01.2003","passport","High",true);
        Worker worker2 = new Worker("Kostya","Alov", "05.09.1995","passport","High",false);
        System.out.println(worker1);
        worker1.setSalary(25000);
        System.out.println("Salary : "+worker1.getSalary());
        worker1.setHoursWorking(160);
        System.out.println("Hours working : "+worker1.getHoursWorking());
        worker1.setPosition("Security");
        System.out.println("Position : "+worker1.getPosition());
        worker1.sayHello();
        worker1.sayBye();
        System.out.println(" ");
        System.out.println(worker2);
        worker2.setSalary(20000);
        System.out.println("Salary : "+worker2.getSalary());
        worker2.setHoursWorking(150);
        System.out.println("Hours working : "+worker2.getHoursWorking());
        worker2.setPosition("Cashier");
        System.out.println("Position : "+worker2.getPosition());
        worker2.sayHello();
        worker2.sayBye();

        System.out.println(" ");
        System.out.println("Clients");
        System.out.println(" ");

        Client client = new Client("Vova","Grigpryan","12.11.1990","passport RF");
        System.out.println(client);
        client.helloWorker("Andrey");
        System.out.println(" ");
        Client client1 = new Client("Sava","Vikod","12.02.2004","passport");
        System.out.println(client1);
        client1.helloWorker("Kostya","Alov");
        System.out.println(" ");
        Client client2 = new Client("Artem","Saratov","23.09.2005","passport");
        System.out.println(client2);
        client2.helloWorker(2);

        System.out.println(" ");
        System.out.println("Books");
        System.out.println(" ");

        Book book = new Book("1984","Novel","D. Orwell",1965,"RosIzdat");
        System.out.println(book);
        System.out.println(" ");
        Book book1 = new Book("We","Novel","E.Zamyatin",1940,"MosCow");
        System.out.println(book1);




    }
}

