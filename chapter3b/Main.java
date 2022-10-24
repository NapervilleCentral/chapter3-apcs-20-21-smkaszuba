import java.util.*;
import java.io.*;

class speeches{
  public static void main(String[] args) {
    File file = new File("speeches/speeches/jfk.txt");
    Scanner in = new Scanner(file);
    int words = 0, average, total = 0, length;
    boolean united = false, government = false, people = false, our = false;
    String word;
    
    length = in.length();
    while (in.hasNext()){
      word = in.next();
      total += word.length();
      if (word == "united")
        united = true;
      if (word == "government")
        government = true;
      if (word == "people")
        united = true;
      if (word == "our")
        our = true;
      words++;
    }
    average = total / words;
    System.out.println("file: " + file);
    System.out.println("length of file: " + length);
    System.out.println("# of words: " + words);
    System.out.println("average length of words: " + average);
    System.out.println("united was said: " + united);
    System.out.println("government was said: " + government);
    System.out.println("people was said: " + people);
    System.out.println("our was said: " + our);
  }
}