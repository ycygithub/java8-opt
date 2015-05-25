package opt.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Dell 1 on 15-5-25.
 */
public class Example2 {

    public static void main(String[] args) throws ScriptException, FileNotFoundException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        String path = Example3.class.getResource("/").getFile() + "script/e2.js";
        System.out.println("path:"+path);

        engine.eval(new FileReader(path));

    }

}
