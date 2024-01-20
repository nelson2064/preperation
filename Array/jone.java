public class jone {
    //kadanes algorithm
    public static void main(String[] args) {
        int arr[] = {-2 , -3 , -4, -1, -2, 1, 5 , -3};
            int max = 0;
            int curr = 0;
        for(int i = 0; i<arr.length ; i++){
            curr += arr[i];
            if(curr < 0){
                curr = 0;
            }
            max = Math.max(curr , max);
        }

        System.out.println(max);
    }
}
