
// Assignment 4 : Write a small program on File Handling:
// 1)Create File
// 2)Read File
// 3)Write File
// 4)Get File Information


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Assignment4 {
    public static void main(String[] args) {
        File f =new File("new.txt");

        //create file
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
            //Write file
        }
        try {
            FileWriter w=new FileWriter("new.txt");
            w.write("This is ainput");
            w.close();
        } catch (IOException e) {
        
            e.printStackTrace();
        }
        //Read file
        try {
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }sc.close();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            // Get info
        }
        if(f.exists()){
            System.out.println("filename:" +f.getName());
        }
        
        }

    
    }

    

