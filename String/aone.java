package String;

import java.util.*;



public class aone {
  public static void main(String[] args){
    String str = new String("maffffdsffm");

    for(int i = 0 ; i<str.length() ; i++){
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            System.out.print("not palindrome");
            break;
        }
    }

    
  } 
}
