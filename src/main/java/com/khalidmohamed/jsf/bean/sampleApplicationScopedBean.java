/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */

/*Singleton Bean, not tied to an HTTP request, every user
of this application will be accessing  the same instance of this bean*/
@Named("sampleAppScopedBean")
@ApplicationScoped
public class sampleApplicationScopedBean {
    
}
