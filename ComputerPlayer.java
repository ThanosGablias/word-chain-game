import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer {
    //Δημιουργία δυναμικού πίνακα - λίστας
    private ArrayList<String> words = new ArrayList<String>();
    //Δημιουργία αντικειμένου Random
    Random rand = new Random();

    //Default constructor
    public ComputerPlayer(){
        setWordList();
    }

    //Μέθοδος για την έναρξη του παιχνιδιού - Επιλογή τυχαίου String από τον υπολογιστή
    public String StartGame(){
        String selectedWord = ""; //Αρχικοποιούμε ένα κενό String

        int number = new Random().nextInt(words.size()); /* Επιλέγει έναν τυχαίο αριθμό απο την λίστα words που αντιστοιχεί
         σε μία από τις λέξεις της λίστας που κάναμε add στην κλάση WordsCreator*/

        selectedWord = words.get(number); //Εγχωρούμε στο String 'selectedWord' μία τυχαία λέξη

        this.words.remove(selectedWord); //Αφαιρεί την λέξη από την λίστα για να μην την ξαναεμφανίσει

        return selectedWord; //επιστροφή της τιμής του String
    }

    //Σε περίπτωση που δεν μπορεί να βρει την λέξη επιστρέφει <QUIT>
    public String Play(String userWord) {
        String properWord = ""; //Δημιουργία κενού String
        char lastChar = userWord.charAt(userWord.length()-1);
        //αν δεν υπάρχει τέτοια λέξη τότε properWord = "QUIT" αλλιώς επέστρεψε την λέξη
        properWord = FindProperWord(lastChar);
        if(properWord != "QUIT"){
            this.words.remove(properWord);
        }
        return properWord; //επιστροφή του String
    }


    private String FindProperWord(char c){
        int maxPoints = 0;
        String maxWord = "QUIT";

        int charPoints = 0;
        for (int i=0;i<words.size();i++) {
            if(words.get(i).charAt(0) == c){
                charPoints = Utils.calculateWordPoints(words.get(i));
                if(charPoints > maxPoints){
                    maxPoints = charPoints;
                    maxWord = words.get(i);
                }
            }
        }
        return maxWord;
    }

    private void setWordList(){
        WordsCreator lejiko = new WordsCreator(); //Δημιουργία αντικειμένου lejiko τύπου WordsCreator

        this.words = lejiko.getWords(); //Εγχωρεί στην λίστα words το σύνολο λέξεων που δημιουργήσαμε στην κλάση WordsCreator
    }
}
