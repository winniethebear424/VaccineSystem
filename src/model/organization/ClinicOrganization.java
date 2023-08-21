/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;

import model.Role.Role;
import model.Role.ClinicRole;
import model.WorkQueue.MsgsDirectory;


/**
 *
 * @author wenwen
 */
public class ClinicOrganization extends Organization {
    
    private MsgsDirectory md;
    
    public ClinicOrganization(){
        super(Type.Clinic.getValue());
        md = new MsgsDirectory();
    }
    
    public ArrayList<Role> getOrgRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicRole());
        return roles;
    }

    public MsgsDirectory getMsgsDirectory(){
        return md;
    }
}
