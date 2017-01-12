package samples.javafx;


import java.util.Hashtable;

/**
 * Created by nuu on 23.12.2016.
 */
public class MorseCode {

    private Hashtable mapping = new Hashtable<String, String>();

    /**
     * Constructor.
     */
    public MorseCode() {
        // Morsealphabet: http://de.wikipedia.org/wiki/Morsecode
        mapping.put("A", ".-");
        mapping.put("B", "-···");
        mapping.put("C", "-·-·");
        mapping.put("D", "-··");
        mapping.put("E", "·");
        mapping.put("F", "··-·");
        mapping.put("G", "--·");
        mapping.put("H", "····");
        mapping.put("I", "··");
        mapping.put("J", "·---");
        mapping.put("K", "-·-");
        mapping.put("L", "·-··");
        mapping.put("M", "--");
        mapping.put("N", "-·");
        mapping.put("O", "---");
        mapping.put("P", "·--·");
        mapping.put("Q", "--·-");
        mapping.put("R", "·-·");
        mapping.put("S", "···");
        mapping.put("T", "-");
        mapping.put("U", "··-");
        mapping.put("V", "···-");
        mapping.put("W", "·--");
        mapping.put("X", "-··-");
        mapping.put("Y", "-·--");
        mapping.put("Z", "--··");
        // Zahlen
        mapping.put("0", "-----");
        mapping.put("1", "·----");
        mapping.put("2", "··---");
        mapping.put("3", "···--");
        mapping.put("4", "····-");
        mapping.put("5", "·····");
        mapping.put("6", "-····");
        mapping.put("7", "--···");
        mapping.put("8", "---··");
        mapping.put("9", "----·");
        // Umlaute
        mapping.put("Ä", "·-·-");
        mapping.put("Ö", "---·");
        mapping.put("Ü", "··--");
        mapping.put("ß", "···--··");
        // Sonderzeichen
        mapping.put(".", "·-·-·-");
        mapping.put(",", "--··--");
        mapping.put("?", "··--··");
        mapping.put("@", "·--·-·");
    }

    public String getMorseCode(String text){

        // das Morsealphabet macht keine Unterscheidung zwischen Gross- und Kleinschreibung
        // darum: alles zu Grossbuchstaben konvertieren
        String textUpper = text.toUpperCase();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < textUpper.length(); i++)
        {
            String character = textUpper.substring(i, i + 1);
            if (character == " ") {
                // Wortzwischenraum -> 3 Leerzeichen zum Code hinzufügen
                code.append("   ");
            } else if (mapping.containsKey(character)) {
                code.append(mapping.get(character));
                // plus Buchstabenzwischenraum
                code.append(" ");
            }
        }

        return code.toString();
    }

}
