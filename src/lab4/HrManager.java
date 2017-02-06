/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.List;

/**
 *
 * @author ltrinastic
 */
public class HrManager {
    private Employee emp;
    
    public HrManager() {
       this.emp = emp;
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        emp = new Employee(firstName, lastName, ssn);
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setSsn(ssn);
      
    }
    
    public void performEmpOrientation(){
        emp.doFirstTimeOrientation("S123");
        emp.getOrientationDate();
        emp.getFirstName();
        emp.getLastName();
        emp.getSsn();
    }   
}
