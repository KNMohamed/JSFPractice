/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.bean;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */
@Named("ajaxBean")
@ViewScoped
public class FocusedAjaxBean implements Serializable{
    private String theInputValue; 

    public String getTheInputValue() {
        return theInputValue;
    }

    public void setTheInputValue(String theInputValue) {
        this.theInputValue = theInputValue;
    }
}
