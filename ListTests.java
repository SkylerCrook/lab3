import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> input = new ArrayList<>();
        input.add("hello");
        input.add("there");
        input.add("im");
        input.add("skyler");
        List<String> output = new ArrayList<>();
        //output.add("hello");
        //output.add("there");
        //output.add("skyler");

        StringChecker sc = new StringChecker();

        ListExamples.filter(input, sc);
        assertEquals(output, input);
	}
}
/*
class StringChecker {
    public boolean checkString(String s) {
        if (s.length() > 2) return true;
        return false;
    }
}*/
