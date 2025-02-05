package conditional;

public class condition {
    public static void main(String[] args){
/*
        int age =18;
        if (age >= 18) {
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are not adult");
        }*/
   /*     int age = 50;
        int marks = 33;
        if(age<=20 && marks>=33){
            System.out.println("Congrates");
        }
        else{
            System.out.println("Better luck next time ");
        }
*/
        int day = 3;
        if (day== 1){
            System.out.println("monday");
        }else if (day==2){
            System.out.println("tuesday");
        }else if (day==3){
            System.out.println("wednesday");
        }else if (day==4){
            System.out.println("thursday");
        }else if (day==5){
            System.out.println("friday");
        }else if (day==6){
            System.out.println("saturday");
        }else if (day==7){
            System.out.println("sunday");
        }else{
            System.out.println("not valid");
        }

int daylist =3;
switch (daylist){
    case 1:{
        System.out.println("monday");
        break;
    }
    case 2:{
        System.out.println("tuesday");
        break;
    }
    case 3:{
        System.out.println("wednesday");
        break;
    }
    case 4:{
        System.out.println("thursday");
        break;
    }
    case 5:{
        System.out.println("friday");
        break;
    }
    case 6:{
        System.out.println("saturday");
        break;
    }
    case 7: {
        System.out.println("sunday");
        break;
    }
    default : {
        System.out.println("not valid");
    }
}







    }
}

