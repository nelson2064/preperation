public class done {
    //binary search


    public static void main(String[] args){
        int arr[] = {1 , 4 , 6 , 9 , 10};

        int start = 0 ; int end = arr.length-1;
        int key = 10;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                System.out.println(mid);
                return;
            }

            if(arr[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    }
}
