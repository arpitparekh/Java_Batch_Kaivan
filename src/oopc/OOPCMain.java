package oopc;

import java.util.Arrays;

public class OOPCMain {

    public static void main(String[] args) {

        Employee e = new Employee("Kaivan");
        e.id = 23;
        e.getName();

        Flight f =  new Flight("12:34","12-12-2001");

        System.out.println(f.getTime());
        System.out.println(f.getDate());

        int arr[] = f.getSum();
        System.out.println(Arrays.toString(arr));

    }
}
