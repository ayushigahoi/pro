import java.util.Scanner;

public class kth_max_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of kth largest element");
        int k=sc.nextInt();
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            


        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[j]=arr[i];
                    arr[j]=temp;
                    
                    
                }
            }
            if (i==k-1) {
                System.out.println( k+"largest element is :" +arr[i]);

                
            }
        }
    
    
}
}
