



public class bone {
    
//linear search

public static void main(String[] args) {
    int arr[] = {4 , 2 , 7  , 6};
    int key = 2;
    for(int i = 0 ; i<arr.length;  i++){
        if(arr[i] == key){
            System.out.print(i);
            return;
        }
    }
    System.out.print("key not found");

}
}
