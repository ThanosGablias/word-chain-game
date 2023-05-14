import java.util.ArrayList;
import java.util.Scanner;

public class GamePanel {
    //Δημιουργία αντικειμένου Scanner
    Scanner input = new Scanner(System.in);
    //Δημιουργία δυναμικού πίνακα - λίστας
    private ArrayList<String> computerWords = new ArrayList<String>();
    //Δημιουργία δυναμικού πίνακα - λίστας
    private ArrayList<String> userWords = new ArrayList<String>();
    //Δημιουργία αντικειμένου της κλάσης ComputerPlayer
    private ComputerPlayer pcPlayer = new ComputerPlayer();

    //Default constructor
    public void GamePanel(){}

    //Μέθοδος που περιλαμβάνει την υλοποίηση του παιχνιδιού
    public void startGame(){
        System.out.println("Insert the amount of words: ");
        int amount = input.nextInt();
        int counter = 0;

            System.out.println("Gaming Starting"); //εκτύπωση μηνύματος

            String computerWord = pcPlayer.StartGame(); //ο υπολογιστής κάνει την πρώτη κίνηση, δηλαδή εμφανίζει την πρώτη τυχαία λέξη από ένα σύνολο λέξεων
            computerWords.add(computerWord); //αποθηκεύει τις λέξεις που επέλεξε ο υπολογιστής(computer) στη λίστα 'computerWords'

            System.out.println("Computer says: " + computerWord); //Μήνυμα που εμφανίζει την επιλογή του υπολογιστή
            counter++;

            //Ο χρήστης κάνει την πρώτη κίνηση
            System.out.print("Insert your first word: "); //εκτύπωση μηνύματος
            String userWord = input.nextLine(); //εγχωρεί στην μεταβλητή 'userWord' την επιλογή του χρήστη
            userWords.add(userWord); //αποθήκευση της λέξης που έπαιξε ο χρήστης στη λίστα 'userWords'
            System.out.println("User says: " + userWord); //Μήνυμα που εμφανίζει την επιλογή του χρήστη
            counter++;

            while (counter <= amount) {
                computerWord = pcPlayer.Play(userWord); /* Καλεί την μέθοδο 'Play()' της κλάσης ComputerPlayer για να ελέγξει
            αν υπάρχει η κατάλληλη λέξη */
                if (computerWord == "QUIT") {              //Έλεγχος της μεταβλητής 'computerWord'
                    System.out.println("Computer quits"); //εκτύπωση μηνύματος
                    break;                                //jump out από το loop
                } else {
                    System.out.println("Computer says: " + computerWord); //Εμφάνιση της επιλογής του υπολογιστή
                    counter++;
                    computerWords.add(computerWord); /* αποθήκευση της λέξης που επέλεξε ο υπολογιστής στη λίστα
                'computerWords' */
                }

                //Ο χρήστης πραγματοποιεί την επόμενη κίνηση
                System.out.print("Insert your next word: "); //Εμφάνιση μηνύματος
                userWord = input.nextLine(); //Εγχωρεί στην μεταβλητή 'userWord' την επιλογή του χρήστη

                if (userWord == "QUIT") {                   //έλεγχος της μεταβλητής 'userWord'
                    System.out.println("User quits");      //Εμφάνιση μηνύματος
                    break;                                 //jump out από το loop
                } else {
                    if (isUserWordProper(userWord, computerWord)) {
                        System.out.println("User says: " + userWord); //Εμφάνιση της επιλογής του χρήστη
                        counter++;
                        userWords.add(userWord); //αποθηκεύει της λέξεις που επέλεξε ο χρήστης στη λίστα 'userWords'
                    } else {
                        System.out.println("Word is not proper. Unfortunately the game is over"); //Εμφάνιση μηνύματος
                        break; //jump out από το loop
                    }
                }
            }  //end of while (game)
        System.out.println("\nStarting report..."); //εκτύπωση μηνύματος
        report(); /* Στο τέλος του παιχνιδιού καλεί την μέθοδο 'report()' η οποία θα εμφανίσει τους πόντους του χρήστη
        και του υπολογιστή και θα εμφανίσει τον νικητή */
    }

    //Ελέγχει αν ο χρήστης έβαλε την σωστή λέξη
    private Boolean isUserWordProper(String userWord, String computerWord){
        char lastComputerChar = computerWord.charAt(computerWord.length()-1);
        char userFirstChar = userWord.charAt(0);
        return lastComputerChar == userFirstChar;
    }

    //θα εμφανίζει τους πόντους του κάθε παίκτη
    public void report(){
        int userTotalPoints = calculateListPoints(userWords); //Οι συνολιοπόντοι του χρήστη
        int computerTotalPoints = calculateListPoints(computerWords);

        //Ελέγχει ποιος απο τους 2 έχει τους περισσότερους πόντους και αντίστοιχα εμφανίζει το κατάλληλο μήνυμα
        if(userTotalPoints > computerTotalPoints)
            System.out.println("User is the winner!!!");       //εκτύπωση μηνύματος
        else if(computerTotalPoints > userTotalPoints)
            System.out.println("Computer is the winner!!!");   //εκτύπωση μηνύματος

        System.out.println("Computer points: " + computerTotalPoints);   //Εμφανίζει τους πόντους του υπολογιστή
        System.out.println("User points: " + userTotalPoints);           //Εμφανίζει τους πόντους του παίκτη
    }

    //Υπολογίζει τους συνολικούς πόντους για τις λέξεις που παίχτηκαν
    private int calculateListPoints(ArrayList<String> wordsPlayed){
        int totalPoints = 0;

        for(int i = 0; i < wordsPlayed.size(); i++){
            totalPoints += Utils.calculateWordPoints(wordsPlayed.get(i)); //Προσθέτει τους πόντους της τρέχουσας λέξης από την λίστα
        }
        return totalPoints; //επιστρέφει τους πόντους
    }
}
