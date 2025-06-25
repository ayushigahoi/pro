import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class missing_number {
    public static List<Integer>findMissingNumber(int[]nums){
        // for(int i=0;i<nums.length;i++){
        //int index=Math.abs(nums[i])-1;
        //if(nums[index]>0){
        // nums[index]=-1*nums[index];
    //}
    //}


        
        
         List<Integer> ArrayList=new ArrayList<>();


         //find the max element
         int max=nums[0];
         for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
         }
         //array to mark present elements
         boolean[] present =new boolean[max+1];
         for(int i=0;i<nums.length;i++){
            if ((nums[i]<=max)) {
                present [nums[i]]=true;
                
            }
         }
         //missing number
         for(int i=1;i<=max;i++){
            if(!present[i]){
                list.add(i);
            }
         }
        
   
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<=n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer>result=findMissingNumber(nums);
        System.out.println("missing numbers :" +result);  
    }
}