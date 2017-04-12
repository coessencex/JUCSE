/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScientificCalc;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 *
 * @author The Guardian
 */
public class Expression {
    private int[] nextIndex;
    StringBuffer exp;
    
    //CONSTRUCTORS
    Expression(){
        exp=new StringBuffer("");
        nextIndex=new int[exp.length()];
        Arrays.fill(nextIndex, 0);
    }
    Expression(String expression){
        this.exp=new StringBuffer(expression);        
        nextIndex=new int[exp.length()];
        Arrays.fill(nextIndex, 0);
    }
    Expression(StringBuffer expression){
        this.exp=expression;        
        nextIndex=new int[exp.length()];
        Arrays.fill(nextIndex, 0);
    }
    
    //EXPRESSION MODIFICAION
    public void set(String expression){
        this.exp=new StringBuffer(expression);
        this.nextIndex=new int[exp.length()];
        Arrays.fill(nextIndex, 0);
    }
    public void appendEnd(char c){
        this.exp.append(c);
    }
    public void delEnd(){
        this.exp.deleteCharAt(this.exp.length()-1);
    }
    
    /*
    private boolean indexUp(){
        Stack<Character> brackets=new Stack<Character>();
        Stack<Integer>   index=new Stack<Integer>();
        for(int i=0;i<this.exp.length();i++){
            char c=this.exp.charAt(i);
            if(c!='(' && c!=')' && c!='{' && c!='}' && c!='[' && c!=']')
                continue;
            
            switch(c){
                case '(' :{
                    brackets.add('(');
                    index.add(i);
                    break;
                }
                case '{' :{
                    brackets.add('{');
                    index.add(i);
                    break;
                }
                case '[' :{
                    brackets.add('[');
                    index.add(i);
                    break;
                }
                case ')' :{
                    if(brackets.isEmpty()){
                        return false;
                    }
                    if(brackets.lastElement()=='('){
                        this.nextIndex[index.pop()]=i;
                        brackets.pop();
                    }
                        
                    break;
                }
                case '}' :{
                    if(brackets.isEmpty()){
                        return false;
                    }
                    if(brackets.lastElement()=='{'){
                        this.nextIndex[index.pop()]=i;
                        brackets.pop();
                    }
                    break;
                }
                case ']' :{
                    if(brackets.isEmpty()){
                        return false;
                    }
                    if(brackets.lastElement()=='['){
                        this.nextIndex[index.pop()]=i;
                        brackets.pop();
                    }
                    break;
                }
            }
        }
        if(brackets.isEmpty())
            return true;
        else 
            return false;
    }   
    public BigInteger solve(String e){
        BigInteger ans=new BigInteger("0");
        
        return ans;
    }
    */
    
    
    public static void main(String args[])throws IOException,ScriptException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo =br.readLine();
        try{
            System.out.println(engine.eval(foo));
        } catch (ScriptException se) {
            System.out.print("Wrong expression");
        }
   
    }
}
