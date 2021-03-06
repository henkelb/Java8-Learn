package Nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ArrayUsage.java
 * Created by Anca.Barbu on 9/8/2015.
 */
public class ArrayUsage {

    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            engine.eval(new FileReader("src/Nashorn/arrayusage.js"));
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e + " -- Script invoked in main method, in ArrayUsage class, not found");
        }
    }
}
