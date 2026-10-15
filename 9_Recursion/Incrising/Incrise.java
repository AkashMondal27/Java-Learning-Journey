// Print number from 1 to n


public class Incrise {
  public  static  void Print(int n){
    if(n==1){
   System.out.println(n);
   return;
    }

    Print(n-1);
    System.out.println(n);

  }

    public static void main(String[] args) {
        int n=5 ;
        Print(n);
    }
}


