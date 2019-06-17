package calctest;
import java.util.Scanner;
public class CalcTest {
    public static Eval X;
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        System.out.print("Input your task :  ");
        String s = read.nextLine();
        X=new Eval();
        X.getOper(s);
        System.out.println( String.valueOf( "\\"+ X.o) );
        X.split(s, "\\+");
        //X.split(s,String.valueOf( X.o));
        X.Check(X.a);
        X.Check(X.b);
        if(X.typ(X.a) != X.typ(X.b)){
            System.out.println("Incorrect request1");
            System.exit(0);
        }
        
        
    }
    
}
