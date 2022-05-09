import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void add(){

        List<String> code =new ArrayList<>();
        code.add("99");
        String s = code.get(0);
        System.out.println(s);

    }
}
