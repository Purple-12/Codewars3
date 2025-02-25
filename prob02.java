import java.util.Scanner;
import java.io.*;

public class prob02 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("input.txt"));
            int x = input.nextInt();
            //int y = input.nextInt();
            System.out.println(2*x);
            input.close();
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}
