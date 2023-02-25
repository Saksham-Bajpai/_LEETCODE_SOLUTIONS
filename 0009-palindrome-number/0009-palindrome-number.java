 import java.util.*;

import java.lang.*;

import java.io.*;

import java.math.*;

class Solution {

  public static boolean isPalindrome(int n) {

  

        if (n<0 || n!=0 && n%10 == 0)

        return false;

        

        int reverse = 0;

        while (n>reverse) {

          reverse = reverse*10 + n%10;

          n = n/10;

        }

        return (n == reverse || n == reverse/10);

  }

  

  

 

  public static void main (String[] args) throws java.lang.Exception 

  {

    // your code goes here

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    if(isPalindrome(x))

   

    System.out.println("true");

    else

    System.out.println("false");

   

   }

 }