package samples.javafx;

import samples.javafx.enums.SortOrder;
import samples.javafx.interfaces.IZahlenspeicher;

/**
 * Created by nuu on 20.12.2016.
 */
public class Zahlenspeicher implements IZahlenspeicher {

    private Elem first;
    private Elem last;

    @Override
    public void add(int n) {
        Elem newElem = new Elem();
        newElem.setNumber(n);

        if (first == null) {
            first = newElem;
            last = first;
        } else {
            Elem elem = first;
            while (elem != null) {
                // Suchen, wo das Element eingefügt werden soll
                if (newElem.getNumber() < elem.getNumber())
                    break;

                elem = elem.getNext();
            }

            if (elem == first) {
                // am Anfang einfügen
                newElem.setNext(first);
                first.setPrevious(newElem);
                first = newElem;
            } else if (elem == null) {
                // am Ende einfügen
                newElem.setPrevious(last);
                last.setNext(newElem);
                last = newElem;
            } else {
                // in der Mitte einfügen
                newElem.setNext(elem);
                newElem.setPrevious(elem.getPrevious());
                elem.getPrevious().setNext(newElem);
                elem.setPrevious(newElem);
            }
        }
    }

    @Override
    public boolean contains(int n) {
        Elem el = first;
        while (el != null) {
            if (el.getNumber() == n)
                return true;

            el = el.getNext();
        }

        return false;
    }

    @Override
    public String get(SortOrder sortOrder) {
        String result = "";

        if (sortOrder == SortOrder.ASCENDING)
        {
            Elem elem = first;
            while (elem != null) {
                result += String.valueOf(elem.getNumber()) + ", ";
                elem = elem.getNext();
            }
        }
        else
        {
            Elem elem = last;
            while (elem != null) {
                result += String.valueOf(elem.getNumber()) + ", ";
                elem = elem.getPrevious();
            }
        }

        if (result.endsWith(", ")) {
            result = result.substring(0, result.lastIndexOf(", "));
        }

        return result;
    }

    @Override
    public void clear() {
        first = last = null;
    }
}
