

public class example1 {
    // cleate the object of class BankAccount
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.username ="AKASH MONDAL";
        // account1.setPassword("12344");

            System.out.println("Username is " + account1.username);
             // System.out.println("Password is " + account1.password);  // we can't access private variable password outside the class BankAccount
    }
    
}


//cleate classes

class BankAccount {
    public String username;
    // private String password ;

    // public void setPassword ( String newPassword){  //we can accress private variable passeord inside the same class .
    //     password = newPassword;  
    // }
}