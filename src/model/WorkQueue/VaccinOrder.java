/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;
import model.vaccinemgnt.Vaccine;

/**
 *
 * @author wenwen
 */
public class VaccinOrder extends WorkRequest {
    
    ArrayList<VaccineOrderItem> VaccineItemList;
    int VacAmount;
    private String testResult;
    private String submittedDate;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
    
    public VaccinOrder(){
        this.VaccineItemList = new ArrayList<>();
    }
    
    public ArrayList<VaccineOrderItem> getVaccineItemList(){
        return VaccineItemList;
    }
    
    public void setOrderItemList(ArrayList<VaccineOrderItem> VaccineItemList){
        this.VaccineItemList = VaccineItemList;
    }
    
    public void addNewOrderItem(Vaccine product, float salesPrice, int quantity){
        VaccineOrderItem orderItem = new VaccineOrderItem(product,salesPrice,quantity);
        VaccineItemList.add(orderItem);
    }

    public int getVacAmount() {
        return VacAmount;
    }

    public void setVacAmount(int VacAmount) {
        this.VacAmount = VacAmount;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }
    
    public VaccineOrderItem findProduct(Vaccine vaccine){
        for (VaccineOrderItem voi :this.getVaccineItemList()){
            if(voi.getProduct().equals(vaccine)){
                return voi;
            }
        }
        return null;
    }
    public void deleteItem(Vaccine item){
        this.VaccineItemList.remove(item);
    }
    

}
