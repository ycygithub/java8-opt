package opt;

import opt.interfaces.Converter;

import java.io.IOException;

/**
 * Created by Dell 1 on 15-5-12.
 */
public class Scopes {

    public static void main(String... args) throws IOException {

        String convert1 = new Scopes().convert1();
        String convert2 = new Scopes().convert2();
        String convert3 = new Scopes().convert3();

        System.out.println(convert1+","+convert2+","+convert3);

    }

    public String convert1(){
        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        return stringConverter.convert(5);
    }

    public String convert2(){
        int num = 1;
        Converter<Integer, String> stringConverter =(from) -> String.valueOf(from + num);
        return stringConverter.convert(5);
    }

    public String convert3(){
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        //num = 3;这里不允许改变
        return stringConverter.convert(5);
    }

}
