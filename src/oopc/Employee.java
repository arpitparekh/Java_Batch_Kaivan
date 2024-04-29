package oopc;

public class Employee {  // public // private // protected

    public int id;
    private String name;
    float height;

    public Employee(){            // default constructor
        System.out.println("This is from Constructor");
    }

    Employee(int id1,int id2){   // parameterized constructor
        if(id1>id2){
            System.out.println(id1+" is greater");
        }else{
            System.out.println(id2+" is greater");
        }
    }

    Employee(String myName){
        name=myName;
    }

    public void getName(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        Employee e = new Employee("Kaivan");
        e.getName();

    }

}
