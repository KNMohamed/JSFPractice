/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.converter;

import com.khalidmohamed.jsf.dao.DessertLoaderDAO;
import com.khalidmohamed.jsf.dto.Dessert;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */
@FacesConverter(forClass=Dessert.class)
@Named("dessertConverter")
@RequestScoped
public class DessertConverter implements Converter{

    @Inject DessertLoaderDAO dessertDao;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value != null){
            try{
                return dessertDao.findDessertByName(value);
            }catch(Exception ex){
                throw new ConverterException(new FacesMessage(ex.getMessage()));
            }
        }
            return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
          if(value != null && value instanceof Dessert){
              return ((Dessert)value).getDessertName();
          }else{
              return null;
          }  
    }

}
