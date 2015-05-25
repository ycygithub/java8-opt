package opt;

import opt.interfaces.Converter;

/**
 * Created by Dell 1 on 15-5-12.
 */
public class Lambda2 {

    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }

}
