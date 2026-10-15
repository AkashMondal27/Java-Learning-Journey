import java.util.*;
public class narrowingTypecasting {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the float value : ");
        float a = sc.nextFloat();
        int b =(int)a;
        long c =(long)a;
        char d = (char)a;
        char ch = 'a';
        int num = ch;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(num);

       }
    }
}

