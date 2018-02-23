import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreIn { 
    public static String[] inArray(String[] array1, String[] array2) {
       List<String> results = new ArrayList<String>();
        for (String a : array1) {
            for (String b : array2) {
                if (b.contains(a)) {
                    System.out.print(a + "\n");
                    results.add(a);
                    break;
                }
            }
        }
        Collections.sort(results);
        String[] r = results.toArray(new String[results.size()]);
        return r;
    }
}

