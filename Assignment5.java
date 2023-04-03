// Assignment 5: Create a java program to search through the home directory and look for 
// files that match a regular expression. The program should be able to take inputs repeatedly 
// and should print out the full absolute path of the matching files found.



import java.io.File;
import java.util.Scanner;

public class Assignment5{

    public void findFile()
    {
	
		
		File file = new File("/home/shubt/javaproject");
		
		String s ;
		
		Scanner in = new Scanner(System.in);
		
		do{
			int a =0;
			System.out.println("ENTER THE FILE NAME ");
			
			s =in.nextLine();
		
			 String[] files = file.list();
			
			for (String string : files){
			 	
				 Boolean s1 = s.equals(string);
				 
				if (s1){
				a = 1;
				System.out.println("File Found ");
				System.out.println(string);
				
				System.out.println("Path : "+ file.getAbsolutePath());
				}			
			}

				if(a == 0)
				{
					System.out.println("File not find ");
				}
			} while(true);
	}

			
            public static void main(String[] args){
			
                        Assignment5 obj =new  Assignment5();
			
			obj.findFile();
		}	
}



    

