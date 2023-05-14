public class Utils {
    public static int calculateWordPoints(String word){
        int totalPoints = 0;
        char[] letters = word.toCharArray(); //Δημιουργούμε πίνακα χαρακτήρων για να μπορούμε να ελέγχουμε τους χαρακτήρες

        //Ανάλογα τους χαρακτήρες που έχει κάθε String(λέξη) προστίθενται στο χρήστη και οι αντίστοιχοι πόντοι
        for(int i = 0; i < word.length(); i++){
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u'
                    || letters[i] == 'y')
                totalPoints += 3;                  //totalPoints = totalPoints + 3
            else
                totalPoints += 5;                  //totalPoints = totalPoints + 5
        }
        return totalPoints; //επιστρέφει τους πόντους
    }
}
