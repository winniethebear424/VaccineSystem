/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccinemgnt;

import java.util.Date;

/**
 *
 * @author wenwen
 */
public class Vaccine {
       String name;
       String Manufacture;
       int num;
       float price;
       String producedDate;
       int batch;   
       int amount;
        
    public Vaccine(){
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public int getStockNum() {
        return num;
    }

    public void setStockNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(String producedDate) {
        this.producedDate = producedDate;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
        
    
    @Override
    public String toString(){
        return name;
    }
}
