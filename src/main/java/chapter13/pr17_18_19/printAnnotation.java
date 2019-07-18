package chapter13.pr17_18_19;

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class printAnnotation {
    private static String fileName = "D:\\11346\\Documents\\Github\\JavaPractise\\src\\main\\java\\chapter13\\pr15\\JGrep.java";
    private String regular = "(/[*][\\s\\S]+?[*]/)|(//.+)";
    private String regular2 = "class \\w+\\s+";
    private String sss="";

    public static void main(String[] args) throws Exception {
        int a = 0;
        printAnnotation pa = new printAnnotation();
        Pattern p = Pattern.compile(pa.sss);
        Matcher m = p.matcher("");
        File file = new File("D:\\11346\\Documents\\Github\\JavaPractise\\src\\main\\java\\chapter13\\pr15\\JGrep.java");
        FileInputStream fileInputStream = new FileInputStream(file);
        while((a = fileInputStream.read()) != -1){
            pa.sss+=(char)a;
        }
       // print(pa.sss);
        pa.pr19(pa.regular2,pa.sss);
        m.reset(pa.sss);
        while (m.find()){
            print("Matcher:"+m.group());
        }
    }

    public  void pr19(String regular,String sss) throws Exception {
        // we want all class names:
        Pattern p = Pattern.compile(regular);
        // not including those in comment lines:
        Pattern q = Pattern.compile("^(//|/\\*|\\*)");
        System.out.println("classes in " + fileName + ":");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); // creates emtpy Matcher object
        Matcher n = q.matcher("");
        for(String line : new TextFile(fileName)) {
            m.reset(line);
            n.reset(line);
            while(m.find() && !n.find())
                System.out.println(index++ + ": " + m.group());
        }
    }


}
