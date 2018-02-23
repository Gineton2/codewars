import java.util.*;

public class WhichAreIn { 
    public static String[] inArray(String[] array1, String[] array2) {
       Set<String> results = new TreeSet<String>();
        for (String a1 : array1) {
            for (String a2 : array2) {
                if (a2.contains(a1)) {
                    results.add(a1);
                    System.out.println(a1);
                    break;
                }
            }
        }
        return results.toArray(new String[results.size()]);
    }
}
