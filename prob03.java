import java.util.Scanner;
import java.io.*;

public class prob03 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("input.txt"));
            int num;
            while(input.hasNextLine()){
                num = input.nextInt();
                if (num == -1){
                    break;
                }
                if (num == 1){
                    System.out.println("You, 1 minute ago.");
                }
                else{
                    System.out.println("You, " + num + " minutes ago.");
                }
            }
            input.close();
        }catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
