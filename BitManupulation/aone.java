package BitManupulation;

public class aone {
  
        public static void main(String[] args) {
            
            int bit_mask = 1;
            int n = 3;
            if ((n & bit_mask) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    
}
