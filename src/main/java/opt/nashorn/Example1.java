package opt.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Dell 1 on 15-5-25.
 */
public class Example1 {

    public static void main(String[] args) throws ScriptException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello World!');");

    }

}
