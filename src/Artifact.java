public class Artifact {
    int number;
    String culture;
    int century;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, int century) {
        this.number = number;
        this.culture = culture;
        this.century = century;

    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(1212);
        Artifact artifact2 = new Artifact(1213, "Prussia");
        Artifact artifact3 = new Artifact(1214, "Awerama", 12);

        System.out.println(artifact1.number);
        System.out.println(" ");
        System.out.println(artifact2.number+"\n"+artifact2.culture);
        System.out.println(" ");
        System.out.println(artifact3.number+"\n"+artifact3.culture+"\n"+ artifact3.century);
    }
}