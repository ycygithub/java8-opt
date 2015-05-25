package opt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Dell 1 on 15-5-12.
 */
public class Lambda {

    public static void main(String... args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));

    }

}
