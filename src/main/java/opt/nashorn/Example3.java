package opt.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Dell 1 on 15-5-25.
 */
public class Example3 {

    public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        String path = Example3.class.getResource("/").getFile() + "script/e3.js";
        System.out.println("path:"+path);

        engine.eval(new FileReader(path));

        Invocable invocable = (Invocable) engine;

        Object result = invocable.invokeFunction("fun1", "Peter Parker");
        System.out.println(result);
        System.out.println(result.getClass());

        invocable.invokeFunction("fun2", new Date());
        invocable.invokeFunction("fun2", LocalDateTime.now());


    }

}
