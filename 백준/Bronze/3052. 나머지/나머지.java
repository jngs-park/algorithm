import java.util.Scanner;
import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();
        int count = 0;
           
             for (int i = 0; i < 10; i ++) {
                 
                 h.add(sc.nextInt() % 42);
                 
             }     

                         
        
        System.out.println(h.size());
    }
}