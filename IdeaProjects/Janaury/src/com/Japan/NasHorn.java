package com.Japan;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
Nashorn is javascript engine which replace the rhino the older one.
it directly compile the code in memory and passes the bytecode to the jvm.
it has dynamic feature
 */
public class NasHorn {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String name = "Nawaki";
        Integer result = null;
        try{
            nashorn.eval("print('"+name+"')");
            result = (Integer)nashorn.eval("10+2");
        }catch (ScriptException e){
            System.out.println("Error executing script:"+e.getMessage());
        }
        System.out.println(result.toString());
    }
}
