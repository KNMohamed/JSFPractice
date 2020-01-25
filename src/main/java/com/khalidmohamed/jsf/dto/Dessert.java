/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.dto;

import java.io.Serializable;

/**
 *
 * @author Khalid
 */
public class Dessert implements Serializable{
    private String dessertName;
    private long dessertId;

    public Dessert(String dessertName, long dessertId) {
        this.dessertName = dessertName;
        this.dessertId = dessertId;
    }

    /**
     * @return the dessertName
     */
    public String getDessertName() {
        return dessertName;
    }

    /**
     * @param dessertName the dessertName to set
     */
    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    /**
     * @return the dessertId
     */
    public long getDessertId() {
        return dessertId;
    }

    /**
     * @param dessertId the dessertId to set
     */
    public void setDessertId(long dessertId) {
        this.dessertId = dessertId;
    }
}
