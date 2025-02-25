import java.util.Scanner;
import java.io.*;

public class prob06 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("input.txt"));
            int total = input.nextInt();
            for (int i = 0; i <total; i++){
                String name = input.next();
                int y = input.nextInt();
                int m = input.nextInt();
                int tmn = 300 - 12 * y - m;
                System.out.println(name + " " + tmn);
            }
            input.close();
        }catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
