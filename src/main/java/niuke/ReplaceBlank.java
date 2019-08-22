package niuke;

import static net.mindview.util.Print.print;

public class ReplaceBlank {

    public String replaceSpace(StringBuffer str) {
        int count = 0,len = 0,len2 = 0,count2 = 0;
        String ss = str.toString();
        len2 = len = str.length();

        while(--len >= 0 ){
            if (str.charAt(len) == ' '){
                count++;
            }
        }
        len = len2 + count*2;
        char[] c = new char[len];
        for(int i = len2-1;i >= 0; i-- ){
            count2 = count*2;
            if (ss.charAt(i) == ' '){
                c[--len] = '0';
                c[--len] = '2';
                c[--len] = '%';
            }else{
                c[--len] = ss.charAt(i);
            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        ReplaceBlank r = new ReplaceBlank();
        String s = r.replaceSpace(str);
        print(s);
    }


}
