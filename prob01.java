import java.util.Scanner;
import java.io.*;

public class prob01{
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("input.txt"));
            String name = input.nextLine();
            System.out.println("Your real strength comes from being the best " + name + " you can be!");
            input.close();
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}