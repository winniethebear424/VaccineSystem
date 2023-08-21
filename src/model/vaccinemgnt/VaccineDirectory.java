/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccinemgnt;

import java.util.ArrayList;
import java.util.Date;
import model.WorkQueue.VaccinOrder;

/**
 *
 * @author wenwen
 */
public class VaccineDirectory {
    ArrayList<Vaccine>vaccineList;
    ArrayList<VaccinOrder>vaccineOrder;
    
    public VaccineDirectory(){
        vaccineList = new ArrayList<>();
        
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    public Vaccine newVaccine(String name, String Manufacture, int num, float price, String producedDate, int batch){
        Vaccine newVaccine = new Vaccine();
        
        newVaccine.setName(name);
        newVaccine.setManufacture(Manufacture);
        newVaccine.setStockNum(num);
        newVaccine.setPrice(price);
        newVaccine.setProducedDate(producedDate); // Assuming producedDate is a string
        newVaccine.setBatch(batch);
        
        vaccineList.add(newVaccine);
        return newVaccine;
    }
    
    public ArrayList<VaccinOrder> getVaccineOrder(){
        return vaccineOrder;
    }
}
