package String;

public class cone {
    public static void main(String[] args){
        String list[] = {"apple" , "mango" , "banana"};
        //print the largest string
        String max = list[0];
        for(int i = 1 ; i<list.length; i++){
            if(list[i].compareToIgnoreCase(max) > 0){
                max = list[i];
            }
        }
        System.out.println(max);
    }
}
