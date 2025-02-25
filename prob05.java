import java.util.Scanner;
import java.io.*;

public class prob05 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("input.txt"));
            while (input.hasNext()){
                int x = input.nextInt();
                System.out.print((char)x);
            }
            System.out.println();
            input.close();
        }catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }
        //int a = 73;
        //char b = (char)a;
        //System.out.println(b);
    }
}
