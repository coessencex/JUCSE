/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.util.*;
/**
 *
 * @author The Guardian
 */
public class Person {
    String name;
    String address;
    String phone;
    
    Person(){
        this.name="";
        this.address="";
        this.phone="";
    }
    Person(String name,String address,String phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }
}
