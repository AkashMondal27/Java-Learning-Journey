import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of redious");
        float r = sc.nextFloat();
        float pi = 3.14f;
        System.out.print("The are of a circle  is : ");
        float area = pi*r*r ;
        System.out.println(area);
        sc.close();  // closes the scanner

    }
}