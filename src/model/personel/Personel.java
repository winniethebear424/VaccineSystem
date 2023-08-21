/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.personel;

/**
 *
 * @author wenwen
 */
public class Personel {

    private String name;
//    private int id;

    public Personel(String name) {
        this.name=name;
    }

//    public int getPersonId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
    
}
