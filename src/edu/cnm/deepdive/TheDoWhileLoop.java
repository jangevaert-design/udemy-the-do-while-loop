package edu.cnm.deepdive;

public class TheDoWhileLoop {

  public static void main(String[] args) {

    int a = 0;

    do {
      a++;
    } while (false);
    System.out.println("a = " + a);//a = 1 because we execute the body of the do statement once.

    //if we would do something similar with a while loop:
    // while (false) {
    //    a++;
    // } This does not compile because of a++ being an unreachable statement after while(false)

    int x = 20;

    while (x > 10) {
      x--;
    }
    System.out.println("x = " + x);// x = 10

    int x2 = 20;
    do {
      x2--;
    } while (x2 > 10);
    System.out.println("x2 = " + x2);//x2 = 10

//    int y = 10;
//    int z = 5;
//
//    while (y < 20)
//      y++;
//      z += 2;
//      y += 10;
//
//    System.out.println("y = " + y + " and z = " + z);

    //careful with code without curly braces. Just rewrite it:

    int y = 10;
    int z = 5;

    while (y < 20) {
      y++;
}
    z += 2;
    y += 10;

    System.out.println("y = " + y + " and z = " + z);

    int number = 10;

    while (number > 10) {
      number--;
    }
    do{
      number --;
      while (number > 5) {
        number += 1;//endless loop
      }
    } while (number < 10);
    System.out.println("number = " + number);

  }

}
