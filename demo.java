class Object {
    public int add() {
        return 0;
    }
}

public class demo {

    public static void main(String[] args) {

        int num = 5;
        Object obj = new Object();

        System.out.println(obj.add() + " " + num);
    }

}
