public class kone {
    
    public static void main(String[] args) {
        //trapping rain water
        int height[] = {4 , 2 , 0 , 6 , 3 , 2, 5};

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1 ; i<leftMax.length ; i++){
            leftMax[i] = Math.max(leftMax[i-1] , height[i]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        

        int trappedWater = 0;
        int width = 1;

        for(int i = 0 ; i<height.length ; i++){
           int waterLevel = Math.min(leftMax[i] , rightMax[i]);
           trappedWater += (waterLevel - height[i]) * width;

        }
        System.out.print(trappedWater);
    }
}
