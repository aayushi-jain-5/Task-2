import java.util.*;
public class Main {
    public static boolean isMirrorInverse(int arr[]){
        for (int i = 0; i < arr.length; i++) {
 
            if (arr[arr[i]] != i)
                return false;
        }
 
        // Given array is mirror-inverse
        return true;
    }
 
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int arr[];
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}    