

public class max {
    public static void main(String[] args) {
       
        int arr[] ={ 50,10,20,80,100};
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if ((arr[i]>max)) {
                max=arr[i];
                
            }

        }
        System.out.println(max);

    }
}
