/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;


import model.Role.DeptOfPHealth;
import model.Role.Role;

/**
 *
 * @author wenwen
 */
public class HealthDeptOrganization extends Organization{
 

    
    public HealthDeptOrganization(){
        super(Type.HealthDept.getValue());
    }
    
    public ArrayList<Role> getOrgRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeptOfPHealth());
        return roles;
    }
}
