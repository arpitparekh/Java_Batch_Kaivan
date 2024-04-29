package static_example;

public class StudentData {

    int id = 0;
    String name = "";
    float height = (float)0.0;

    static int age = 34;   // it is not a part of any object but part class itself

    // There is no object of the class available at the time of starting java runtime,
    // and because of that,
    // we have to define the main() method as static

     static void myFunction(int x){   // static function
        System.out.println("Hello this is my function "+x);
    }

    static{
        System.out.println("THis is static block");
    }

    public StudentData(){
        System.out.println("This is constructor");
    }


    public void bhaiBhai(StudentData kaivan){
        System.out.println(kaivan.id);
        System.out.println(kaivan.name);
        System.out.println(kaivan.height);
    }

    public StudentData arereBhai(){
        return this;
    }

    public void leBhai(){
        bhaiBhai(this);
    }


}
