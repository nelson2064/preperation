

public class cone {
    public static void main(String[] args) {
        //insertion sort
        int arr[] = {1 , 2 , 3 , 4 , 5 , 6};
        for(int i = 1 ; i<arr.length ; i++){
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
