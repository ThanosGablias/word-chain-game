import java.util.ArrayList;

public class WordsCreator {
    //Δημιουργία δυναμικού πίνακα - λίστας
    private ArrayList <String> words = new ArrayList<String>();

    //Default constructor
    public WordsCreator(){
        addWordsStartWith_A();
        addWordsStartWith_B();
        addWordsStartWith_C();
        addWordsStartWith_D();
        addWordsStartWith_E();
        addWordsStartWith_F();
        addWordsStartWith_G();
        addWordsStartWith_H();
        addWordsStartWith_I();
        addWordsStartWith_J();
        addWordsStartWith_K();
        addWordsStartWith_L();
        addWordsStartWith_M();
        addWordsStartWith_N();
        addWordsStartWith_O();
        addWordsStartWith_P();
        addWordsStartWith_Q();
        addWordsStartWith_R();
        addWordsStartWith_S();
        addWordsStartWith_T();
        addWordsStartWith_U();
        addWordsStartWith_V();
        addWordsStartWith_W();
        addWordsStartWith_X();
        addWordsStartWith_Y();
        addWordsStartWith_Z();
    }

    //Για να προσθέσουμε λέξεις
    public void addNewWord(String word){
        words.add(word);
    }
    //Επιστρέφει την τιμή του αντικειμένου
    public ArrayList<String> getWords(){
        return words;
    }

    //Δημιουργούμε μεθόδους με όλα τα γράμματα της αλφάβητου και προσθέτουμε στην καθεμία από 7 λέξεις που αρχίζουν από το ίδιο γράμμα
    private void addWordsStartWith_A(){
        words.add("apple"); words.add("abolish"); words.add("accumulation"); words.add("architect"); words.add("artificial");
        words.add("article"); words.add("attention");
    }

    private void addWordsStartWith_B(){
        words.add("book"); words.add("bicycle"); words.add("balloon"); words.add("barrier"); words.add("biology");
        words.add("blizzard"); words.add("browse");
    }

    private void addWordsStartWith_C(){
        words.add("calendar"); words.add("candy"); words.add("carpet"); words.add("cigarette"); words.add("circulation");
        words.add("commitment"); words.add("confirm");
    }

    private void addWordsStartWith_D(){
        words.add("death"); words.add("damage"); words.add("disappear"); words.add("debris"); words.add("deep");
        words.add("dentist"); words.add("duration");
    }

    private void addWordsStartWith_E(){
        words.add("exclusive"); words.add("exaggerate"); words.add("explosion"); words.add("expel"); words.add("exercise");
        words.add("exhaust"); words.add("envoy");
    }

    private void addWordsStartWith_F(){
        words.add("flamingo"); words.add("fire"); words.add("finland"); words.add("fish"); words.add("flat");
        words.add("financial"); words.add("floor");
    }

    private void addWordsStartWith_G(){
        words.add("greece"); words.add("grass"); words.add("gradient"); words.add("govern"); words.add("garden");
        words.add("grey"); words.add("guitar");
    }

    private void addWordsStartWith_H(){
        words.add("hood"); words.add("homework"); words.add("hose"); words.add("hustler"); words.add("humanity");
        words.add("hungry"); words.add("hero");
    }

    private void addWordsStartWith_I(){
        words.add("immigrate"); words.add("inch"); words.add("island"); words.add("irish"); words.add("inefficiency");
        words.add("influx"); words.add("inorganic");
    }

    private void addWordsStartWith_J(){
        words.add("jump"); words.add("jail"); words.add("journalist"); words.add("justification"); words.add("japanese");
        words.add("jacket"); words.add("jeep");
    }

    private void addWordsStartWith_K(){
        words.add("kid"); words.add("keno"); words.add("kind"); words.add("knock"); words.add("kiosk");
        words.add("kitchen"); words.add("knives");
    }

    private void addWordsStartWith_L(){
        words.add("lamp"); words.add("label"); words.add("land"); words.add("leader"); words.add("legacy");
        words.add("leather"); words.add("legible");
    }

    private void addWordsStartWith_M(){
        words.add("mountain"); words.add("madagascar"); words.add("mile"); words.add("manual"); words.add("marriage");
        words.add("messenger"); words.add("mexico");
    }

    private void addWordsStartWith_N(){
        words.add("nail"); words.add("neighborhood"); words.add("norway"); words.add("nursery"); words.add("nuclear");
        words.add("notation"); words.add("native");
    }

    private void addWordsStartWith_O(){
        words.add("offside"); words.add("object"); words.add("officer"); words.add("offish"); words.add("obligation");
        words.add("obsolete"); words.add("oat");
    }

    private void addWordsStartWith_P(){
        words.add("paint"); words.add("pallet"); words.add("pasta"); words.add("password"); words.add("parch");
        words.add("people"); words.add("pension");
    }

    private void addWordsStartWith_Q(){
        words.add("quarrel"); words.add("quarantine"); words.add("quick"); words.add("quiet"); words.add("qualify");
        words.add("quiz"); words.add("quote");
    }

    private void addWordsStartWith_R(){
        words.add("relief"); words.add("renovate"); words.add("reject"); words.add("regroup"); words.add("relay");
        words.add("relax"); words.add("relevant");
    }

    private void addWordsStartWith_S(){
        words.add("sweden"); words.add("suicide"); words.add("sarcasm"); words.add("scandal"); words.add("score");
        words.add("sceptic"); words.add("scotland");
    }

    private void addWordsStartWith_T(){
        words.add("tank"); words.add("table"); words.add("television"); words.add("tree"); words.add("talent");
        words.add("tennis"); words.add("team");
    }

    private void addWordsStartWith_U(){
        words.add("unhealthy"); words.add("unfold"); words.add("understand"); words.add("user"); words.add("unjust");
        words.add("unique"); words.add("useful");
    }

    private void addWordsStartWith_V(){
        words.add("vain"); words.add("vaccinate"); words.add("valiant"); words.add("vegan"); words.add("valid");
        words.add("vamp"); words.add("verb");
    }

    private void addWordsStartWith_W(){
        words.add("world"); words.add("weigh"); words.add("warm"); words.add("wage"); words.add("wall");
        words.add("week"); words.add("worker");
    }

    private void addWordsStartWith_X(){
        words.add("xylophone"); words.add("xray"); words.add("xenon"); words.add("xyloid"); words.add("xeroderma");
        words.add("xenophobia"); words.add("xyster");
    }

    private void addWordsStartWith_Y(){
        words.add("yoghurt"); words.add("yoga"); words.add("young"); words.add("yard"); words.add("yellow");
        words.add("yam"); words.add("yelp");
    }

    private void addWordsStartWith_Z(){
        words.add("zip"); words.add("zero"); words.add("zone"); words.add("zoologist"); words.add("zodiac");
        words.add("zeal"); words.add("zink");
    }
}
