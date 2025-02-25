import java.util.Scanner;
import java.io.*;

public class prob04 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("input.txt"));
            String breaking = input.nextLine();
            char sym = breaking.charAt(0);
            String rest = input.nextLine();
            for (int i = 0; i <rest.length(); i++){
                if (rest.charAt(i) == sym){
                    System.out.println();
                }
                else{
                    System.out.print(rest.charAt(i));
                }
            }
            /*for (int i = 0; i < rest.length()-1; i++){
                if (rest.substring(i,i+1).equals(breaking)){
                    System.out.println();
                }
                else{
                    System.out.print(rest.charAt(i));
                }
            }
            System.out.println(rest.substring(rest.length()-1));*/
            input.close();
        }catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
