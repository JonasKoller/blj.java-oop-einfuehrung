package samples.javafx;

/**
 * Created by nuu on 20.12.2016.
 */
public class Elem {
    private Elem next;
    private Elem previous;
    private  int number;

    public Elem getNext() {
        return next;
    }

    public void setNext(Elem next) {
        this.next = next;
    }

    public Elem getPrevious() {
        return previous;
    }

    public void setPrevious(Elem previous) {
        this.previous = previous;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
