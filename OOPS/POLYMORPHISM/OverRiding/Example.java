

public class Example {
    public static void main(String[] args) {
        Goat g= new Goat();
        g.eat();
    }
    
}

class Animal{
    
    @SuppressWarnings("unused")
    void eat(){
        System.out.println(" animal eat everything ");
    }
}

class Goat extends Animal {
    @Override
    void eat(){
        System.out.println(" eat grass");
    }

}

/*   Method overridng :-

Parent and child  classes both contain the same funcation with a different defination */