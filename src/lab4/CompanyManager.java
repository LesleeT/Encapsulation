/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author ltrinastic
 */
public class CompanyManager {
    private HrManager hrHire;

    public CompanyManager(HrManager hrHire) {
        hrHire = new HrManager();
    }

   public void hireEmployee(String firstName, String lastName, String ssn){
        hrHire.hireEmployee(firstName, lastName, ssn);
    }
    
    public HrManager getHrHire() {
        return hrHire;
    }

    public void setHrHire(HrManager hrHire) {
        this.hrHire = hrHire;
    }  
}
