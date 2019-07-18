//: holding/UniqueWords.java
package chapter11.pr16; /* Added by Eclipse.py */

import net.mindview.util.TextFile;

import java.util.*;

public class UniqueWords {
  public static void main(String[] args) {
    //a，e，i，o，u
    int sum = 0;
    int count = 0;
    String ss = null;
    Set<Character> chars = new TreeSet<Character>();
    Collections.addAll(chars,'A','E','I','O','U','a','e','i','o','u');
    Set<String> words = new TreeSet<String>(
      new TextFile("src/main/java/chapter11/pr16/SetOperations.java", "\\W+"));
    Iterator<String> it = words.iterator();
    while(it.hasNext()){
      ss = it.next();
      for (int i = 0; i < ss.length(); i++) {
        if (chars.contains(ss.charAt(i))){
          count++;
        }
      }
      sum+=count;
      System.out.println(ss+": "+count);
      count = 0;
    }
    System.out.println(words);
    System.out.println("sum"+sum);
  }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
