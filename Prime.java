package prime;

import java.util.Scanner;

/**
 *
 * @author anshul
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        n = sc.nextInt();
        if(n%2==0)
            System.out.println(+n+" "+"IS NOT PRIME NUMBER");
        else{
            System.out.println(+n+" "+"IS A PRIME NUMBER");
        }
    }
    
}
