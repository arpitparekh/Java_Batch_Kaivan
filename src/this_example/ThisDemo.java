package this_example;

public class ThisDemo {

    public static void main(String[] args) {

        Vehicle v = new Vehicle(12,13);
        v.setA(23);
        v.setB(25);

        Vehicle v1 = new Vehicle("Hello");
        v1.setA(24);
        v1.setB(30);

        v.getVariables();
        v1.getVariables();

    }

}

/////////////////////////////////////////////////////////

class Vehicle{

    private int a = 0;
    private int b = 0;

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void getVariables(){
        System.out.println(a+" "+b);
    }

    private void mojMa(){

    }

    public void fullMojMa(){
        this.mojMa();
    }


    /// not constructor

    public Vehicle(){
        System.out.println("Vehicle constructor");
    }

    public Vehicle(int a,int b){
        this();    // only work if this is the first statement in another constructor
        System.out.println("sum : "+(a+b));

    }

    public Vehicle(String name){
        this(12,12);                  // constructor chaining
        System.out.println(name);
    }


}
