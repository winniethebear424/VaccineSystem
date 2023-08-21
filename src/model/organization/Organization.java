/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;


import java.util.ArrayList;
import model.Role.Role;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.MsgsDirectory;
import model.WorkQueue.WorkRequestDirectory;
import model.personel.PersonDirectory;

/**
 *
 * @author wenwen
 */
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
//    private WorkRequestDirectory workQueue;
    private PersonDirectory personDirectory;
    private MsgsDirectory msgsDirectory;

    public enum Type {
        Admin("Admin Organization"){},
        CDC("CDC Organization"){},
        Clinic("Clinic Organization"){},
        Distributor("Distributor Organization"){},
        HealthDept("Health Dept Ornization"){},
        Provider("Provider Ornization"){};
      
        private String value;

        private Type(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }
    }
    
    public Organization(String name){
        
        this.name=name;
//        workQueue = new WorkRequestDirectory();
        msgsDirectory= new MsgsDirectory();
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
    }
    
    public abstract ArrayList<Role> getOrgRole ();
    
    public UserAccountDirectory getUserAccountDirectory(){
        return userAccountDirectory;
    }
    
//    public WorkRequestDirectory getWorkQueue() {
//        return workQueue;
//    }
    public MsgsDirectory getMsgsDirectory(){
        return msgsDirectory;
    }
    public PersonDirectory getPersonDirectory (){
        return personDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}