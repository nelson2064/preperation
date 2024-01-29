package String;

public class eone {
    public static void main(String[] args) {
        // string compression

        // aaabbcccdd  a3b2c3d2
        String str = "aaabbcccda";

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<str.length() ; i++){
            int count = 1;

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }

        System.out.print(sb.toString());

    }
}


    //     StringBuilder sb = new StringBuilder("");
    //     char ch = str.charAt(0);
    //     int count = 1;

    //     for (int i = 1; i < str.length(); i++) {
    //         if (str.charAt(i) == ch) {
    //             count++;
    //         } else {
    //             sb.append(ch);
    //             if (count > 1) {
    //                 sb.append(count);
    //             }
    //             count = 1;
    //             ch = str.charAt(i);
    //         }
    //     }

    //     // Append the last character and its count
    //     sb.append(ch);
    //     if (count > 1) {
    //         sb.append(count);
    //     }

    //     System.out.print(sb.toString());
    // }
// }
