
class Student {
    int rollno;
    String name;
    int marks;
}

public class ArrayofObjects {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.rollno = 1;
        s1.name = "ali";
        s1.marks = 90;

        Student s2 = new Student();

        s2.rollno = 2;
        s2.name = "ahmed";
        s2.marks = 80;

        Student s3 = new Student();

        s3.rollno = 3;
        s3.name = "umer";
        s3.marks = 70;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println("Roll No: " + s.rollno);
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println();
        }

    }
}
