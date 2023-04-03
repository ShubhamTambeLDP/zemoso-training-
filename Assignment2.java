

// Assignment 2 : Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). 
    import java.util.Scanner;
    public class Assignment2 {
       public static void main(String[] args) {
          String s; 
          Scanner p = new Scanner(System.in);
          System.out.print("\nEnter your String ");
          s =p.nextLine();
          s= s.toLowerCase();
          boolean[] alphaList = new boolean[26]; 
          int x = 0;
          int q = 1;
          for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) >= 'a' &&  s.charAt(i) <= 'z') {
              x= s.charAt(i) - 'a'; 
             }
             alphaList[x]= true; 
          }
          for (int i = 0; i <= 25; i++) {
             if (alphaList[i] == false)
                q = 0;
          }
          System.out.print("String: " );
          if (q == 1)
             System.out.print("string is in");
          else
             System.out.print( "sting is out");

}}
    

    

