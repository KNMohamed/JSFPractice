/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalidmohamed.jsf.page;

import com.khalidmohamed.jsf.dto.Dessert;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlInputSecret;
import javax.inject.Named;

/**
 *
 * @author Khalid
 */
@RequestScoped
@Named("componentListing")
public class InputComponentPageBean {
    
    private HtmlInputSecret passwordField;
    
    private String password1;
    
    private long selectOneRadioSelection; 

    private long selectOneMenuSelection; 

    private long selectListBoxSelection; 
    
    private long selectOneMenu; 
    
    private Dessert radioButtonDessert;

    private Dessert lsitBoxDessert;

    private List<Dessert> selectManyDesserts; 

    private List<Long> selectManyCheckboxSelections = new LinkedList<>(); 
    
    private String inputTextArea;
    
    private BigDecimal moneyInput;
    
    private Dessert selectedDessert;

    @PostConstruct
    public void init(){
        passwordField = new HtmlInputSecret();
        passwordField.setDisabled(true);
    }
    
    public void acceptAString(String s){
        Logger.getAnonymousLogger().info("We recieved" + s);
    }
    
    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public long getSelectOneRadioSelection() {
        return selectOneRadioSelection;
    }

    public void setSelectOneRadioSelection(long selectOneRadioSelection) {
        this.selectOneRadioSelection = selectOneRadioSelection;
    }

    public long getSelectOneMenuSelection() {
        return selectOneMenuSelection;
    }

    public void setSelectOneMenuSelection(long selectOneMenuSelection) {
        this.selectOneMenuSelection = selectOneMenuSelection;
    }

    public long getSelectListBoxSelection() {
        return selectListBoxSelection;
    }

    public void setSelectListBoxSelection(long selectListBoxSelection) {
        this.selectListBoxSelection = selectListBoxSelection;
    }

    public long getSelectOneMenu() {
        return selectOneMenu;
    }

    public void setSelectOneMenu(long selectOneMenu) {
        this.selectOneMenu = selectOneMenu;
    }

    public Dessert getRadioButtonDessert() {
        return radioButtonDessert;
    }

    public void setRadioButtonDessert(Dessert radioButtonDessert) {
        this.radioButtonDessert = radioButtonDessert;
    }

    public Dessert getLsitBoxDessert() {
        return lsitBoxDessert;
    }

    public void setLsitBoxDessert(Dessert lsitBoxDessert) {
        this.lsitBoxDessert = lsitBoxDessert;
    }

    public List<Dessert> getSelectManyDesserts() {
        return selectManyDesserts;
    }

    public void setSelectManyDesserts(List<Dessert> selectManyDesserts) {
        this.selectManyDesserts = selectManyDesserts;
    }

    public List<Long> getSelectManyCheckboxSelections() {
        return selectManyCheckboxSelections;
    }

    public void setSelectManyCheckboxSelections(List<Long> selectManyCheckboxSelections) {
        this.selectManyCheckboxSelections = selectManyCheckboxSelections;
    }

    public String getInputTextArea() {
        return inputTextArea;
    }

    public void setInputTextArea(String inputTextArea) {
        this.inputTextArea = inputTextArea;
    }

    public BigDecimal getMoneyInput() {
        return moneyInput;
    }

    public void setMoneyInput(BigDecimal moneyInput) {
        this.moneyInput = moneyInput;
    }

    public Dessert getSelectedDessert() {
        return selectedDessert;
    }

    public void setSelectedDessert(Dessert selectedDessert) {
        this.selectedDessert = selectedDessert;
    }

    public HtmlInputSecret getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(HtmlInputSecret passwordField) {
        this.passwordField = passwordField;
    }
    
    
}
