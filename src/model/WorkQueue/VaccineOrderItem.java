/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.vaccinemgnt.Vaccine;

/**
 *
 * @author wenwen
 */
public class VaccineOrderItem {
 

    Vaccine Vproduct;
    float salesPrice;
    int quantity;
    
    public VaccineOrderItem(Vaccine Vproduct, float salesPrice, int quantity){
        this.Vproduct = Vproduct;
        this.quantity = quantity;
        this.salesPrice = salesPrice;
    }

    public Vaccine getProduct() {
        return Vproduct;
    }

    public void setProduct(Vaccine product) {
        this.Vproduct = product;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return this.Vproduct.toString();
    }
    
}
