import java.util.*;
public class permutation_combination{
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n,r;
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        r= sc.nextInt();
        int p= factorial(n)/factorial(n-r);
        int c= factorial(n)/(factorial(n-r)*factorial(r));
        System.out.println("permutation is "+ p);
        System.out.println("combination is "+ c);
    }
}