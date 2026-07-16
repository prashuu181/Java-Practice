import java.util.*;
public class Prash{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("n is not a prime");
        }else{
            int c = 0;
            for(int i=1; i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
        if(c==2){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
        }

    }
}
