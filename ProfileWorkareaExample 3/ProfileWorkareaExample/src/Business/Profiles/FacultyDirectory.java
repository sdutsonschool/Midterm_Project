/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author samueldutson
 */
public class FacultyDirectory {
    Business business;
    ArrayList<FacultyProfile> facultylist;
    
    public FacultyDirectory(Business d) {
        business = d;
        facultylist = new ArrayList();
    }
    
    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile profile = new FacultyProfile(p);
        facultylist.add(profile);
        return profile;
    }
    
    public void addProfile(FacultyProfile fc) {
        facultylist.add(fc);
    }
    
    public FacultyProfile findProfile(String id) {
        for (FacultyProfile fc : facultylist) {
            if(fc.isMatch(id)) {
                return fc;
            }
        }
        return null; // No matching profile was found.
    }
    
    public void deleteFacultyMember(Profile ep) {
        facultylist.remove(ep);
    }
}