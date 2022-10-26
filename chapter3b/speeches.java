// Mitchell Kaszuba
// 10/25/22
// speeches program
// analyses speeches
import java.util.*;
import java.io.*;

class speeches{
  public static void main(String[] args) throws IOException{
    // file is the file being analized
    File file = new File("speeches/Abraham Lincoln A House Divided.txt");
    Scanner in = new Scanner(file);
    
    // words - amount of words in speech
    // total - total length of all words in speech
    // average - average between the length of every word and amount of words
    int words = 0, average, total = 0, length;
    boolean united = false, government = false, people = false, our = false;
    String word;
    
    // while file has letters in it
    while (in.hasNext()){
      // word is next word in file
      word = in.next();
      // add length of word to total length of all words
      total += word.length();
      
      // if the given word is one of these words, declare that the word was said
      if (word.toLowerCase().contains("united"))
        united = true;
      if (word.toLowerCase().contains("government"))
        government = true;
      if (word.toLowerCase().contains("people"))
        people = true;
      if (word.toLowerCase().contains("our"))
        our = true;
      // increase amount of words said by 1
      words++;
    }
    
    // calculate average
    average = total / words;
    
    // display info to user
    System.out.println("file: " + file);
    System.out.println("# of words: " + words);
    System.out.println("average length of words: " + average);
    System.out.println("united was said: " + united);
    System.out.println("government was said: " + government);
    System.out.println("people was said: " + people);
    System.out.println("our was said: " + our);
  }
}