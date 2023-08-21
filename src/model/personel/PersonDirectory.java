/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.personel;

import java.util.ArrayList;

/**
 *
 * @author wenwen
 */
public class PersonDirectory {
    private ArrayList<Personel> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<>();
    }
    
    public ArrayList<Personel> getPersonList(){
        return personList;
    }
    
    public Personel createNewPersonel(String name){
        Personel newPerson = new Personel( name);
        newPerson.setName(name);
        personList.add(newPerson);
        return newPerson;
    }
    
}
