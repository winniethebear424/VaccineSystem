/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import model.WorkQueue.WorkRequestDirectory;
import model.organization.OrganizationDirectory;
import model.vaccinemgnt.VaccineDirectory;

/**
 *
 * @author wenwen
 */
public class Business {

    private static Business business;
    private OrganizationDirectory od;
    private VaccineDirectory vd;
    private WorkRequestDirectory workQueue;

    private Business(){
        od = new OrganizationDirectory();
        vd = new VaccineDirectory();
        workQueue = new WorkRequestDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory(){
        return od;
    }
    
    public VaccineDirectory getVaccineDirectory(){
        return vd;
    }
    public static Business theInstance(){           //using design pattern of singleton to guarantee the class has only one instance
        if (business == null){ 
            business = new Business();
        }
        return business;
    }   
    
    public WorkRequestDirectory getWorkQueue() {
        return workQueue;
    }


}
