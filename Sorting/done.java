public class done {
    public static void main(String[] args) {
        //counting sort
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
       
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int[] count = new int[max + 1]; // array to store the count of each element
      
        // count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
         
    }
}
