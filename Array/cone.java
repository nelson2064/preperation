public class cone {
    //largest number
    public static void main(String[] args){
        int arr[] = {2 , 5 , 2 , 4 , 10,2};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print("the max value in array is " + max);
    }
   
}
