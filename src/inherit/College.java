package inherit;

public class College extends ClassB {

    String name ;
    String no_students;

    void hello(){
        System.out.println("Hello from college");
    }

    public static void main(String[] args) {

        College c = new College();
        System.out.println(c.name);
    }


}
