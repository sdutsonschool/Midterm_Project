/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;
import Business.UserAccounts.UserAccount.AccountTypes;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {
    
    private String position;
    private int salary;
    private int yearsInService;


    public EmployeeProfile(Person p) {

        super(p); 

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }
    
    
    @Override
    public String getRole(){
        return  "Admin";
    }
    
    @Override
    public AccountTypes getAccountType() {
        return AccountTypes.Admin;
    }

}