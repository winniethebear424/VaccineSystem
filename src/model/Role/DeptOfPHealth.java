/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import model.organization.HealthDeptOrganization;
import model.organization.Organization;
import ui.HealthDeptRole.HealthDeptWorkAreaJPanel;

/**
 *
 * @author wenwen
 */

//Department of Public Health: Receives orders from registered sites. It is responsible for reviewing and approving site requests for vaccine.
//Approved requests are forwarded to the CDC for approval and shipping.
//The state keeps track of registered sites. Only registered site can order
//vaccine.

public class DeptOfPHealth extends Role  {

    public static UserAccount RoleTyp;
    
    public DeptOfPHealth(){

        this.type = RoleType.DeptOfHealth;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new HealthDeptWorkAreaJPanel(userProcessContainer,account,(HealthDeptOrganization)organization, business);
    }
          
}
