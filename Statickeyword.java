class Mobile {

    // Instance variables
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand: " + brand + " Price: " + price + " Name: " + name);
    }
}

public class Statickeyword {

    public static void main(String[] args) {

        // static variable is shared among all objects of the class and called using its
        // class name

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
    }
}