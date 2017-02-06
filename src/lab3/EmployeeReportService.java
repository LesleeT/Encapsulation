/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Leslee
 */
public class EmployeeReportService {
    private String report = " ";
    
    public void addEmployeeData (String data){
        report += data;
    }
    
    public void printEmployeeReport(){
        System.out.println(report);
    }
}
