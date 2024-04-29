package static_example;

public class ExampleMain {

    public static void main(String[] args) {

        StudentData data = new StudentData();
        StudentData data1 = new StudentData();

        data.id = 34;
        data.height = (float)34.56;
        data.name = "Bascom";


        data1.id = 35;
        data1.height = (float)34.56;
        data1.name = "Bascom";

//        StudentData.age = 45;

        System.out.println(data.id);
        System.out.println(data.height);
        System.out.println(data.name);
        System.out.println(StudentData.age);
        System.out.println(data.age);

        data1.age = 45;

        System.out.println(StudentData.age);
        System.out.println(data.age);
        System.out.println(data1.age);

        StudentData.myFunction(12);
        StudentData.myFunction(13);
        int a = 34;  // stack

        data.leBhai();

        StudentData data6 =  data.arereBhai();   // like this you can create a copy of an object
        data6.arereBhai();

    }
}
