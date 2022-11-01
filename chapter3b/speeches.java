// Mitchell Kaszuba
// 10/25/22
// speeches program
// analyses speeches
import java.util.*;
import java.io.*;

class speeches{
  public static void main(String[] args) throws IOException{
    // file is the file being analized
    File file = new File("speeches/gwbush.txt");
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
    
    /* 
     documents from 1776-1830:
     1. file: speeches\George Washington first Inaugural.txt
        # of words: 1438
        average length of words: 5
        united was said: true
        government was said: true
        people was said: true
        our was said: true
       
      2. file: speeches\AJackson Independence of Texas.txt
        # of words: 1810
        average length of words: 4
        united was said: true
        government was said: true
        people was said: true
        our was said: true
        
        Andrew Jackson's speech was longer than Geroge's. Washington had longer words, however.
        They both said basic government words
        
     documents from 1830-1920:
     1. file: speeches\MLK I have a Dream.txt
        # of words: 915
        average length of words: 4
        united was said: false
        government was said: false
        people was said: true
        our was said: true
     
     2. file: speeches\gwbush.txt
        # of words: 1586
        average length of words: 4
        united was said: true
        government was said: true
        people was said: true
        our was said: true
        
        MLK's speech was shorter than Bush's speech. MLK didn't say united or government in his speech
        which is very interesting. They both had a similar length of words
     */
  }
}