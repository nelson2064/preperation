public class eone {
    //reverse and array
    
    public static void main(String[] args) {
        int arr[] = {3 , 5 , 6 , 2 , 2};

        for(int i = 0 ; i<arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }


        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
