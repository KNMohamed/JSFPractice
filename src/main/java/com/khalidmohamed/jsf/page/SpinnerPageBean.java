/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */
@RequestScoped
@Named("spinnerBean")
public class SpinnerPageBean {
    public void processing(){
        synchronized(this){
            try{
                wait(3000);
            }catch(InterruptedException e1){
                //waiting interrupted
            }
            
        }
    }
}
