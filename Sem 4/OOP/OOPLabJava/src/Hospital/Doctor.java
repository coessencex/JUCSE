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
public class Doctor extends Person{
    static int noOfDoc=1;
    int id;
    ArrayList<Patient> patientList=new ArrayList(); 
    
    Doctor(String name,String address,String phone){
        super(name,address,phone);
        this.id=noOfDoc++;
    }
    public boolean assignPatient(Patient P){
        patientList.add(P);
        return true;
    } 
}
