import java.util.Scanner;
public class RectangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of rectangle: ");
        double Length = sc.nextDouble();
        System.out.print("Width of rectangle: ");
        double Width = sc.nextDouble();
        double area = Length * Width;
        System.out.println("Area of Rectangle:" + area);
        sc.close();

    
    }
}