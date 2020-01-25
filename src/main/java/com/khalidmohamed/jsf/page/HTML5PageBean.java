/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.page;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */

@Named("html5Bean")
@RequestScoped
public class HTML5PageBean {
    private String dateIn;
    private Date dateObjectIn;
    private String dateOut;
    
    public void transformDates(){
        setDateOut(getDateIn());
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateObjectIn() {
        return dateObjectIn;
    }

    public void setDateObjectIn(Date dateObjectIn) {
        this.dateObjectIn = dateObjectIn;
    }
    
}
