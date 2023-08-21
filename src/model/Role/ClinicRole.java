/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import model.organization.ClinicOrganization;
import model.organization.Organization;
import ui.ClinicRole.ClinicWorkAreaJPanel;

/**
 *
 * @author wenwen
 */
public class ClinicRole extends Role {
    
    public ClinicRole(){
        this.type = RoleType.Clinic;

    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new ClinicWorkAreaJPanel(userProcessContainer,account,(ClinicOrganization)organization, business);
    }
    
}
