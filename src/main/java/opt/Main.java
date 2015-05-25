package opt;

import opt.interfaces.Converter;
import opt.interfaces.Formula;
import opt.interfaces.PersonFactory;

/**
 * Created by Dell 1 on 15-5-12.
 */
public class Main {

    public static void main(String... args) {

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        double a = formula.calculate(100);
        double b = formula.sqrt(16);
        System.out.println(a+","+b);

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter2.convert("123");
        System.out.println(converted2);

        Something something = new Something();
        Converter<String, String> converter3 = something::startsWith;
        String converted3 = converter3.convert("Java");
        System.out.println(converted3);

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

    }

}
