import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class lambdaTest {

    @Test
    public void lambdaGrammar() {
        //Old way:
        List<Integer> oldlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (Integer n : oldlist) {
            System.out.println(n);
        }
        System.out.println("================================");

        //New way:
        List<Integer> newlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        newlist.forEach((x)->{System.out.println(x);});
        System.out.println("================================");
        newlist.forEach(n -> System.out.println(n));
        System.out.println("================================");


        //or we can use :: double colon operator in Java 8
        newlist.forEach(System.out::println);
        System.out.println("================================");
    }
}
