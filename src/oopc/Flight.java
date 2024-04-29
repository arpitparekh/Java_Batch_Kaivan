package oopc;

public class Flight {

    private String flyTime;
    private String date;

    Flight(String time,String myDate){
        flyTime = time;
        date = myDate;
    }

    public String getTime(){
        return flyTime;
    }

    public String getDate(){
        return date;
    }

    int[] getSum(){
        int arr[] = {1,2,3,4,5};
        return arr;
    }

    int myFunction(){
        if(12<13){
            return 12;
        }else{
            return 34;
        }
    }

}
