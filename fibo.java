package fibo;

/**
 *
 * @author anshul
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=1,i,c;
        System.out.println("fibonacci series");
        for(i=2;i<10;i++){
           c=a+b;
           System.out.println(""+c);
           a=b;
           b=c; 
        }
    }
    
}
