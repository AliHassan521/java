
class Area {
    static void fun1() {
        System.out.println("Area 1");
    }

    static void fun2() {
        System.out.println("Area 2");
    }

}

class Obj{
    int x = 5;
    int y;
    void fun1() {
        System.out.println("Obj 1");
    }
    void fun2() {
        System.out.println("Obj 2");
    }
}


class Example {
    

    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }

    public static void main(String[] args){

        Obj o1 = new Obj();
        System.out.println("C");
        Area.fun1();
        System.out.println(o1.x);
        System.out.println(o1.y);
        o1.fun2();
    }
}