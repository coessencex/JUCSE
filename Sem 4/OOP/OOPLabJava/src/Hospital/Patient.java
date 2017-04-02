/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author The Guardian
 */
public class Patient extends Person {
    static int noOfPatient=1;
    int id;
    Doctor doctor;
    ArrayList observationList=new ArrayList();
    
    Patient(String name,String address,String phone){
        super(name,address,phone);
        this.id=noOfPatient++;
    }
    
    
    
    void recordObservation(float bp,float temp){
        observationList.add(new Observation(bp,temp));
    }

}
