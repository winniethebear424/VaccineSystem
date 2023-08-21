/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;
import java.util.ArrayList;

import model.Business;
import model.Role.Role;
import model.Role.CDCRole;

/**
 *
 * @author wenwen
 */
public class CDCOrganization extends Organization {
    Business business;
    ArrayList<CDCRole> cdcRoles;
    
    public CDCOrganization(){
        super(Type.CDC.getValue());
    }
    
    public ArrayList<Role> getOrgRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCRole());
        return roles;
    }
    
}
