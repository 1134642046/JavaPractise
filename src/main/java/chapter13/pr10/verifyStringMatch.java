package chapter13.pr10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class verifyStringMatch {

    private String ss = "Java now has regular expressions";
    private String ss2 = "Arline ate eight apples and one orange while Anita hadn't any";


    public static void main(String[] args) {
        String[] s = {"^Java", "\\Berg.*", "n.w\\s+h(a|i)s", "S?", "S+", "s{4}", "s{1}.", "s{0,3}"};
        String[] s2 = {"(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"};//由a,e,i,o,u或空格加a,e,i,o,u开头中间由任意个字符组成且末尾由字符a,e,i,o,u组成的字符串
        verifyStringMatch v = new verifyStringMatch();
        for (String sss : s2 ) {
            System.out.println("Regular expression: " + sss);
            Pattern p = Pattern.compile(sss);
            Matcher m = p.matcher(v.ss2);
            if(!m.find())
                System.out.println("No match found for " + "\"" + sss + "\"");
            m.reset();
            while(m.find()) {
                System.out.println("Matcher:" + m.group());
            }
        }
    }
}
