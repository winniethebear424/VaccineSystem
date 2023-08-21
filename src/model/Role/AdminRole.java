/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.Business;
import model.UserAccount.UserAccount;
import model.organization.Organization;
import ui.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author wenwen
 */
public class AdminRole extends Role{

    public AdminRole(){
        this.type = RoleType.Admin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account, Organization organization, Business business ){
        return new AdminWorkAreaJPanel(userProcessContainer, business.theInstance());
    }
}
