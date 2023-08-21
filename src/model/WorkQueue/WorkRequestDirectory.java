package model.WorkQueue;
import java.util.ArrayList;
import model.WorkQueue.WorkRequest;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author wenwen
 */
public class WorkRequestDirectory {
    
    private ArrayList<VaccinOrder> vaccRequestList;
    
    public WorkRequestDirectory(){
        vaccRequestList = new ArrayList<>();
    }

    public ArrayList<VaccinOrder> getVaccRequestList() {
        return vaccRequestList;
    }
    
    public void createVaccRequest (VaccinOrder vo){
        vo = new VaccinOrder();
        this.vaccRequestList.add(vo);
    }
}
