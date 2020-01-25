/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Khalid
 */

@Named("sampleViewBean")
@ViewScoped
//Intermediate Bean lifecycle between SessionScope and RequestScope
//Bean used for JSF page that engages the user in a conversational way, especially with AJAX
public class SampleViewScopedBean implements Serializable{
    private List<String> dogs;

    @PostConstruct
    public void initDogs(){
        dogs = new ArrayList<String>();
        dogs.add("corgi");
        dogs.add("retriever");
    }
    
    @PreDestroy
    public void cleanup(){
        dogs = null;
    }
    
    /*Used to logout or do a page timeout*/
    public void destroySession(){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
    }
    /**
     * @return the dogs
     */
    public List<String> getDogs() {
        return dogs;
    }

    /**
     * @param dogs the dogs to set
     */
    public void setDogs(List<String> dogs) {
        this.dogs = dogs;
    }
}
