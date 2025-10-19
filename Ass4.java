import java.util.Arrays;
import java.util.EmptyStackException;

public class Ass4 {
    public static void main(String[] args) {
        Arreystackimp<String> s1 = new Arreystackimp<>(3);
        s1.add("batman");
        s1.add("baba");
        s1.add("hh");
        s1.add("ee");
        s1.remove();
        s1.remove();
        s1.view();

    }
}

