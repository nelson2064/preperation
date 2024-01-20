public class ione {

    //max subarray prfix sum approach
    public static void main(String[] args) {
        // int arr[] = {-2 , -3 , -4, -1, -2, 1, 5 , -3};
        int arr[] = {1 , -2 , 6 , -1 ,3};
        int max = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
       
        for(int i = 0 ; i<arr.length ; i++){
            int curr = 0;
            for(int j = i ; j<arr.length ; j++){
                curr = i==0? prefix[j] : prefix[j] - prefix[i-1];
                max = Math.max(max , curr);
            }
        }

        System.out.print(max);
    }
}
