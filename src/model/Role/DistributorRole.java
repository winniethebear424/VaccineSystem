/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import model.organization.DistributionOrganization;
import model.organization.Organization;
import ui.DistributorRole.DistributorWorkAreaJPanel;

/**
 *
 * @author wenwen
 */

//A single national distributor responsible for shipping to registered clinics and hospitals. Satellite clinics receive their supply from
//their affiliated hospitals. The distributor interacts with vaccine manufactures and ship through their distribution centers which are located
//in different regions of the country. Distributor bills providers.

public class DistributorRole extends Role {

    public DistributorRole(){
        this.type= RoleType.Distributor;

    }
    


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new DistributorWorkAreaJPanel(userProcessContainer,account,(DistributionOrganization)organization, business);
    }
    
        
}
