/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;
import java.util.Date;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;
    String username;
    String password;
    Date lastUpdated;
    Date lastAccessed;
    
    public enum AccountTypes {
        Admin,
        Student,
        Faculty,
    }
    
    public UserAccount (Profile profile, String un, String pw){
        username = un;
         password = pw;
         this.profile = profile;
         this.lastUpdated = new Date(); // Init to current date.
         this.lastAccessed = new Date();
    }

    public Date getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
        public boolean IsValidUser(String un, String pw){
        
            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        
        }
        public String getRole(){
            return profile.getRole();
        }
        
        public AccountTypes getAccountType() {
            return profile.getAccountType();
        }
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }
        
}
