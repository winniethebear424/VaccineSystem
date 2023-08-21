/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author wenwen
 */
public class MsgsDirectory {
    
    private ArrayList<RequirementMsgs> msgsRequestList;
    
    public MsgsDirectory(){
        msgsRequestList = new ArrayList<>();
    }

    public ArrayList<RequirementMsgs> getMsgsRequestList() {
        return msgsRequestList;
    }
    
    public RequirementMsgs createMsgsRequest (String vaccine, int amount, String message, String status){
        RequirementMsgs rm = new RequirementMsgs();
        rm.setVaccine(vaccine);
        rm.setAmount(amount);
        rm.setMessage(message);
        rm.setStatus(status);
        
        msgsRequestList.add(rm);
        return rm;
    }
}
