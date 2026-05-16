

public class Example {
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        System.out.println(" SUM : "+ cal.sum(1, 2));
        System.out.println(" SUM : "+ cal.sum( (float)1.3, (float)2.7));
        System.out.println(" SUM : "+ cal.sum(1, 2,7));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

/*...................Method Overriding...................
 Method Overriding happens when a child class provides a new implementation 
 of a method already present in the parent class.*/