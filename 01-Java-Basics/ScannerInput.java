import java.util.Scanner;
public class ScannerInput{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your AGE:");
        int AGE=sc.nextInt();
        System.out.println("AGE is:"+AGE);
        sc.close();
    }
}