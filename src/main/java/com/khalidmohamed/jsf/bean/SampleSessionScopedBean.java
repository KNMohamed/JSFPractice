/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */

@Named("sampleSessionBean")
@SessionScoped
//Singleton Java Class, tied to HTTP Session, every user has single instance
//Based on browser HTTP session
//Created when referenced, destroyed when browser session is destroyed deliberately, or by session timeout
//Used for storing user specific data
public class SampleSessionScopedBean implements Serializable{
    
}
