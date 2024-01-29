package String;
import java.util.*;
public class done {
    public static void main(String[] args){
        
        //convert the first letter of each word to uppercase

        String str = "hi, iam nelson";

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        System.out.print(sb.toString());

    
    }
    
}
