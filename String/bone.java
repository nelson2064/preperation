package String;


import java.util.*;
public class bone {
    public static void main(String[] args){
    String path = "WNEENESENNN";
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        float ans = (float)Math.sqrt(X2 + Y2);
        System.out.print(ans);
    }
}
