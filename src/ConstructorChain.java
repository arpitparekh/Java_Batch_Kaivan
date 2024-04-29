public class ConstructorChain {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {  // 0  // 1

            for (int j = 0; j < i; j++) { // 0//1

                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

/*
    1 => 1
    2=> 2
    3 => 3
    9 => 9+8+7+6+5+4+3+2+1 = 45

 */

class Dealer{

    private int price;
    private String location;

    public Dealer(int a){
        System.out.println("From Dealer Class "+a);
    }




}

class User extends Dealer{

    public User(int b){
        super(b);
        System.out.println("From User Class "+b);
    }
}

class Device extends User{

    public Device(){
        super(23);
        System.out.println("From Device Class");
    }

}
