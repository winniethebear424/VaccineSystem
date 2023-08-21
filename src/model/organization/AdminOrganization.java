package model.organization;


import java.util.ArrayList;
import model.Role.AdminRole;
import model.Role.Role;





public class AdminOrganization extends Organization {

    public AdminOrganization(){
        super(Type.Admin.getValue());
    }
  
    public ArrayList<Role> getOrgRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
