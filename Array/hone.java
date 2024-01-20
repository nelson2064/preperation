public class hone {
    //max subarrays
    public static void main(String[] args) {
        //brute force

        int max = 0;
        
        int arr[] = {3 , 5 , 6 , 7 , 4 , 1};
        for(int i = 0 ; i<arr.length ; i++){
               
            for(int j = i ; j<arr.length ; j++){
                int curr = 0;
                for(int k = i ; k<=j ; k++){
                    curr += arr[k];
                }
                max = Math.max(curr , max);
                System.out.println(curr);
            }
          
          
        }
        System.out.println(" max subarrays is " + max);
    }
}
