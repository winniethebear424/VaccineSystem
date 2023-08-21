/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import static javax.management.Query.value;
import javax.swing.JPanel;

import model.Business;
import model.UserAccount.UserAccount;
import model.organization.Organization;



/**
 *
 * @author wenwen
 */
public abstract class Role {    //abstract can not be instantiated directly.
    
    public enum RoleType{
        Admin("Admin"),
        CDC("CDC"),
        Clinic("Clinic"),
        DeptOfHealth("DeptofHealth"),
        Distributor("Distributor"),
        Provider("Provider");
        
        private String value;
        
        private RoleType(String value) {
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
    }
    
    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business);


    @Override
    public String toString(){
        return (type!=null)? this.type.getValue():this.getClass().getName();
    }
}
