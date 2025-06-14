import java.util.*;
import java.util.Arrays;

public class right_rotation_of_array {
    public static void ReverseArray(int[]arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;   
        }
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. of rotation");
        int k=sc.nextInt();

        ReverseArray(arr ,0 ,n-1);
         ReverseArray(arr ,k ,n-1);
          ReverseArray(arr ,0 ,k-1);

          for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
          }  
          
    }
}