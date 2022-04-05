package com.company;

public class PingPong {
    public static void main(String[] args) {
        //int counter = 1;
       // while ( counter <= 100){
         //   System.out.println(counter);
           // if (counter % 6 == 0) {
             //   System.out.println("ping pong");
            //}
      //      if (counter % 3 == 0) {
        //        System.out.println("pong");
        //    }
          //  else if (counter % 2 == 0){

            //}
            //else {
              //  System.out.println("-");
            //}
            //counter++;
        //}



        for (int number = 0; number < 100; number++) {
            System.out.println(number);
            if (number % 6 == 0){
                System.out.println("ping pong");
            }
            if (number % 3 == 0){
                System.out.println("pong");
            }
            else if (number % 2 == 0){
                System.out.println("ping");
            }
            else
            {System.out.println("-");}

        }


    }
}
