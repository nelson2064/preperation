
//selection sort is all about selecting an ellement and putting it into right place

public class bone {
    public static void main(String[] args) {
        
        int arr[] = {1 , 2 , 3 , 4 , 5};

        for(int i = 0 ; i<arr.length-1 ; i++){
            int max = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;;
        }

        for(int j = 0 ; j<arr.length ;j++){
            System.out.println(arr[j]);
        }
    }
}
