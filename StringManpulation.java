
public class StringManpulation {

    public static void main(String[] args) {

        // String name = "ali";
        // name = name + " hassan";
        // System.out.println(name.hashCode());

        // String s1 = "Ali";
        // String s2 = "Ali";

        // System.out.println(s1 == s2);

        // to convert string to mutable StringBuffer and StringBuilder used

        StringBuffer sb = new StringBuffer("Ali");

        // by default capacity of StringBuffer is 16
        // System.out.println(sb.capacity());

        sb.append(" Hassan");
        System.out.println(sb);

    }

}
