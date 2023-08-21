/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import java.util.ArrayList;
import javax.swing.JPanel;

import model.Business;
import model.UserAccount.UserAccount;
import model.organization.Organization;
import model.organization.ProviderOrganization;
import ui.ProviderRole.ProviderWorkAreaJPanel;

/**
 *
 * @author wenwen
 */
public class ProviderRole extends Role  {

    
    public ProviderRole(){
        this.type = RoleType.Provider;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new ProviderWorkAreaJPanel (userProcessContainer,account,(ProviderOrganization)organization, business);
    }
          
}