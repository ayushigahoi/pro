public class sum__call_by_value {
    public static int calculatesum(int a ,int b){
       int  sum=a+b;
       return sum;
    }
    public static void main(String[] args) {
         int a =10;
         int b=50;
      int sum=   calculatesum(a, b);
      System.out.println("sum is: "+sum);

    }
}
