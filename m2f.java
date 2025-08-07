import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print(
                "enter the number in (M): ");
                double n = sc.nextDouble();
                double feet = n*3.28084;
                System.out.println("number in feet is "+feet);
                sc.close();
            
    }
}
