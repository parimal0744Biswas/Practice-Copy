public class obj {
    public static void main(String[] args) {
        // System.out.println(0);

        Alien obj1 = new Alien();
        Alien obj2 = new Alien();

        obj2.name = "Biswas";
        obj2.salary = 5000;

        System.out.println(obj1.name);
        System.out.println(obj1.salary);

        System.out.println(obj2.name);
        System.out.println(obj2.salary);
    }
}

class Alien {
    String name = "Parimal";
    int age = 30;
    int salary = 5000;
    String tech = "Java";
}
