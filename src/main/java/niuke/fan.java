package niuke;

import java.util.Scanner;

public class fan {

    public static String getIntFromDouble(String a){
        String[] ss = a.split(" ");
        String s = "";
        for (int i = ss.length-1; i >= 0; i--) {
            if(i == 0){
                s+=ss[i];
                break;
            }
            s+=ss[i]+" ";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(getIntFromDouble(a));
    }
}
