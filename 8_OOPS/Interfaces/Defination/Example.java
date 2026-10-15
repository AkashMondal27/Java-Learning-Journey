//create an interface and implement it in different classes
interface  ChessPlayer{
    void Moves();
}


//implementing interface in different classes
class Queen implements  ChessPlayer{
    @Override
   public  void Moves(){
   System.out.println("up , down , left , right and diagonal(all direction)");
    }
}

class Rook implements ChessPlayer{
    @Override
    public void Moves(){
        System.out.println("up , down , left and right (all direction except diagonal)");
    }
}

class King implements ChessPlayer{
    @Override
    public void Moves(){
        System.out.println("left , right , up and down (one step only)");
    }}

public class Example {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.Moves();
        Rook r = new Rook();
        r.Moves();
        King k = new King();
        k.Moves();
    }
}


/*  ..............NOTES..............................

Interface :-  In Java Interfaces is blue print of a classs that is contains abstruct methods .*/