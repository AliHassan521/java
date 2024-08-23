class Mobile {

    // Instance variables
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand: " + brand + " Price: " + price + " Name: " + name);
    }

    // static method
    public static void display(Mobile obj) {
        System.out.println("Brand: " + obj.brand + " Price: " + obj.price + " Name: " + name);
    }
}

public class Statickeyword {

    public static void main(String[] args) {

        // static variable is shared among all objects of the class, called using its
        // class name and it is a class member not object

        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 20000;
        Mobile.name = "Smartphone";

        Mobile m2 = new Mobile();

        m2.brand = "Apple";
        m2.price = 50000;
        Mobile.name = "Smartphone";

        Mobile.name = "Phone";

        m1.show();
        m2.show();

        // Mobile.show(); Error: non-static method show() cannot be referenced from a
        // static context or class name

        Mobile.display(m1);
    }
}