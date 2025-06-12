import java.util.Scanner;

class remove_elements {
    public  static int removeDuplicates(int[]nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if ((nums[i]!=nums[j])) {
                nums[++j]=nums[i];
                
            }
        }
        return j+1;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[]nums=new int[n];

        System.out.println("enter the elements of array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
      int newLength=  removeDuplicates(nums);
      System.out.println("array after removing duplicates");

        for(int i=0;i<newLength;i++){
            System.out.println(nums[i] +"");
        }

    }
    
}
