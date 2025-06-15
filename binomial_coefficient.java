import java.util.Scanner;

public class binomial_coefficient {

    public static int facto(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int bincofficient(int n ,int r){
        int fact=facto(n);
        int fact_r=facto(r);
        int factnmr=facto(n-r);
        
        int bincofficient=fact/(fact_r *factnmr);
        return bincofficient;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of r");
        int r=sc.nextInt();
        System.out.println(bincofficient(n, r));

        
    }
}
