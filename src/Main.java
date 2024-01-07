import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet demoSet = createHashSet(10);
        int prova= 12;
        demoSet.add(prova);

        boolean provacontenuto = demoSet.contains(prova);
        System.out.println(prova + " è presente dentro il set? "+ provacontenuto);

    }

    public static HashSet createHashSet(int grandezza) {
        HashSet set = new HashSet();
        int aggiungere = 1;
        for (int i = 0; i < grandezza; i++) {
            set.add(aggiungere);
            aggiungere++;
        } return set;
    }
}
