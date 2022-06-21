import java.util.*;
// import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        int a,b,i;
        Scanner Sc= new Scanner(System.in);
        a = Sc.nextInt();
        b = Sc.nextInt();
        i = Sc.nextInt();
        switch(i){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;    
            default:
                System.out.println("Enter i again");
                break;
        }
        
    }
}