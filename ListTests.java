import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

public class ListTests{
    @Test
    static void testfilter(){
        List<String> list1 = new ArrayList<>();
        list1.add(0, "Lab");
        list1.add(1, "UCSD");
        list1.add(2, "Hello");
        StringChecker sc;
        ArrayList<String> check = new ArrayList<>();
        check.add(0,"Lab");
        check.add(1, "UCSD");
        check.add(2, "Hello");
        assertEquals(check,ListExamples.filter(list1, sc));
    }

}
