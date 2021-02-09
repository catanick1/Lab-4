/*
Lab 4
Partners: Calvin Catania and Nicholas Natale
Date: 2/9/2021
*/

import java.util.Random;
class Main 
  {
  public static void main(String[] args) 
  {
    //assign random variable
    Random r = new Random();
    int randomNumber = r.nextInt(50) + 1;

    System.out.println("The Random number is: " + randomNumber);

    countDown(randomNumber);

    //specify countdown messages
    if (randomNumber <= 5) 
    {
      System.out.println("Ahoy mateys");
    } 
    else if (randomNumber > 25 && randomNumber < 42) 
    {
      System.out.println("Cannonball!");
    } 
    else 
    {
      System.out.println("Blast off!");
    }
  }
  
  //print next number and stop at zero
  static void countDown(int randomNum) 
  {
      while(randomNum != 0) 
      {
        randomNum--;
        System.out.println(randomNum);
      }
  }
}
