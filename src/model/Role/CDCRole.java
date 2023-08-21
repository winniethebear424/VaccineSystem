/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import model.organization.CDCOrganization;
import model.organization.Organization;
import ui.CDCRole.CDCWorkAreaJPanel;


/**
 *
 * @author wenwen
 */

//Receive vaccine orders from individual state Public Health Department (PHD) for vaccine. 
//Orders are approved by CDC according to state allocation and passed on to national distributor for
//shipping directly to hospitals, pharmacies, clinics, etc (referred to as sites). 
//The CDC keeps track of available inventory on a daily basis and uses a
//formula to determine how to allocate vaccines supply to sites. The formula
//is based on the population size of each state. A site can only order from the
//allocated quantity for that state. If the limit is reached for that state then
//the order is delayed or rejected.


public class CDCRole extends Role {

    
    public CDCRole(){
        this.type = RoleType.CDC;

    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new CDCWorkAreaJPanel(userProcessContainer,account,(CDCOrganization)organization, business);
    }
    
}
