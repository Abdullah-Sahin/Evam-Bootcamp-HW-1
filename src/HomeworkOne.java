import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Homework 1 of Abdullah Şahin

// Answer of 1st question is 1; however, if any of these strings is
// changed, a new object is created for the changed string, others do not change

public class HomeworkOne {

    static String myString = "code";

    /**
     * Takes an array of Strings and return the first string that contains code, if no string
     * contains, returns null
     * @param words array of strings
     * @return word from words that contains statically defined myString object, null otherwise
     */
    public static String turnOne(String[] words){
        for(String word : words){
            if(word.contains(myString))
                return word;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantInput = true;
        List<String> wordList = new ArrayList<>();
        // User enters at least 5 strings by loop
        while(wantInput){
            System.out.println("Please type a string");
            wordList.add(scanner.nextLine());
            if(wordList.size() >= 5){
                System.out.println("Would you like to add another word?\nIf so, Press Y\nPress another key otherwisea");
                String answer = scanner.nextLine();
                if(!answer.equalsIgnoreCase("y")){
                    wantInput = false;
                }
            }
        }
        System.out.println(turnOne(wordList.toArray(new String[0])));
    }
}
