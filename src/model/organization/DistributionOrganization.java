/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;

import model.Business;
import model.Role.DistributorRole;
import model.Role.Role;

/**
 *
 * @author wenwen
 */
public class DistributionOrganization extends Organization {
    Business business;
    ArrayList<DistributorRole> DistributorRoles;
    
    public DistributionOrganization(){
        super(Type.Distributor.getValue());
    }
    
    
    public ArrayList<Role> getOrgRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorRole());
        return roles;
    }
}
