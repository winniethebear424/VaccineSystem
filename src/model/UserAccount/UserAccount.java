/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;
import model.WorkQueue.WorkRequestDirectory;
import model.Role.Role;
import model.personel.Personel;
import model.WorkQueue.WorkRequestDirectory;

/**
 *
 * @author wenwen
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Personel person;
    private Role role;
    private WorkRequestDirectory workQueue;

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Personel getPerson() {
        return person;
    }

    public void setPerson(Personel person) {
        this.person = person;
    }

    public WorkRequestDirectory getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkRequestDirectory workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
