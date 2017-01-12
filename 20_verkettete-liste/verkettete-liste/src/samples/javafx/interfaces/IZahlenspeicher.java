package samples.javafx.interfaces;

import samples.javafx.enums.SortOrder;

public interface IZahlenspeicher {
    /**
     * Fügt eine Zahl in den Zahlenspeicher ein.
     * @param n
     */
    void add(int n);

    /**
     * Gibt true zurück, wenn die Zahl n im Zahlenspeicher vorhanden ist.
     * @param n
     * @return
     */
    boolean contains(int n);

    /**
     * Gibt alle Zahlen des Zahlenspeichers in einem Array zurück,
     * und zwar sortiert in der gewünschten Reihenfolge.
     * @param sortOrder
     * @return
     */
    String get(SortOrder sortOrder);

    /**
     * Löscht alle Zahlen aus dem Zahlenspeicher.
     */
    void clear();
}
