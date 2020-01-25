/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import com.khalidmohamed.jsf.dto.Dessert;
/**
 *
 * @author Khalid
 */
@Named("dessertDao")
@ApplicationScoped
public class DessertLoaderDAO{
    private List<Dessert> desserts;

    @PostConstruct
    public void load(){
        Dessert iceCream = new Dessert("Ice Cream", 10001);
        Dessert fudgeSundae = new Dessert("Fudge Sundae", 10002);
        Dessert kheer = new Dessert("Kheer", 10003);
        Dessert applePie = new Dessert("Apple Pie", 10004);
        Dessert candiedApple = new Dessert("Candied Apple", 1005);
        
        desserts = new LinkedList<Dessert>();
        desserts.add(iceCream);
        desserts.add(fudgeSundae);
        desserts.add(kheer);
        desserts.add(applePie);
        desserts.add(candiedApple);
        
        System.out.println("Loaded desserts");
    }
    
    /**
     * @return the desserts
     */
    public List<Dessert> getDesserts() { return desserts; }

    /**
     * @param desserts the desserts to set
     */
    public void setDesserts(List<Dessert> desserts) { this.desserts = desserts; }
    
    public Dessert findDessertById(long dessertId){
        Dessert dessertToReturn = null;
        
        Iterator it = desserts.iterator();
        while(it.hasNext()){
            Dessert d = (Dessert)it.next();
            if(d.getDessertId() == dessertId){
                dessertToReturn = d;
            }
        }
        return dessertToReturn;
    }

    public Dessert findDessertByName(String dessertName){
        Dessert dessertToReturn = null;
        
        Iterator it = desserts.iterator();
        while(it.hasNext()){
            Dessert d = (Dessert)it.next();
            if(d.getDessertName().equals(dessertName)){
                dessertToReturn = d;
            }
        }
        return dessertToReturn;
    }
}
