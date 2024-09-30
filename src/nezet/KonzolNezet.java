package nezet;

import java.util.Scanner;

public class KonzolNezet {
    private static final Scanner sc = new Scanner(System.in);
    
    public int bekeres() {
        megjelenit("Melyikben van a kincs? (1,2,3): ");
        return sc.nextInt() - 1;
    }
    
    public void megjelenit(String uzenet){
        System.out.print(uzenet);
    }
    
    public void bezar() {
        sc.close();
    }
}
