package inherit;

public class Student {

    int id;
    String name = "kaivan";
    private int age;

    void hello(){
        System.out.println("Hello from student");
    }



    public static void main(String[] args) {

        Student s = new Student();
        s.age = 34;

    }
}
