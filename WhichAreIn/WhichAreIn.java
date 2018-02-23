import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreIn { 
    public static String[] inArray(String[] array1, String[] array2) {
       List<String> results = new ArrayList<String>();
        for (String a1 : array1) {
            for (String a2 : array2) {
                if (a2.contains(a1)) {
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
