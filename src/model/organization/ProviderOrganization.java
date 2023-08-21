/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;

import model.Business;
import model.Role.ProviderRole;
import model.Role.Role;

/**
 *
 * @author wenwen
 */
public class ProviderOrganization extends Organization{
    
    Business business;
    ArrayList<ProviderRole> ProviderRoles;
    
    public ProviderOrganization(){
        super(Type.Provider.getValue());
    }    
    
    public ArrayList<Role> getOrgRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
    }
}
