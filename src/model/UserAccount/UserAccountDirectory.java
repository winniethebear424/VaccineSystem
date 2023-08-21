/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;
import model.UserAccount.UserAccount;
import model.organization.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.personel.Personel;

/**
 *
 * @author wenwen
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
    }
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    //crucial step to pick out authenticated users.
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount newUserAccount(String userName, String password, Role role, Personel fullName){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(userName);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setPerson(fullName);
        userAccountList.add(userAccount);
        return userAccount;
    }
}
