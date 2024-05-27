package ExerciseGroup2;
import java.util.Scanner;
public class stringArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputSentence;
        String inputWord;
        String stopper="stop";
        System.out.println("Enter your Sentence: ");
        inputSentence = sc.nextLine();
        do {
            System.out.println("Input word to Find: ");
            inputWord = sc.nextLine();
            if(inputWord.compareTo(stopper) == 0){
                break;
            }
            wordFinder(inputSentence, inputWord);
        }
            while(inputWord.compareTo(stopper) != 0);
            sc.close();
    }

    public static void wordFinder(String sentence, String word){
        boolean flag = sentence.contains(word);

        if(flag){
            System.out.println(word + " Exists in the sentence");
        }
        else
            System.out.println("The word does not exist in the sentence");
    } 
}

