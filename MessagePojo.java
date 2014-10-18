/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kx.insta.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author KX
 */
public class MessagePojo implements Serializable{
    private String _expediteur;
    private String _corpsDuMessage;
    private Date _dateDeReception;

    public String getExpediteur() {
        return _expediteur;
    }

    public String getCorpsDuMessage() {
        return _corpsDuMessage;
    }

    public Date getDateDeReception() {
        return _dateDeReception;
    }

    public void setExpediteur(String _expediteur) {
        this._expediteur = _expediteur;
    }

    public void setCorpsDuMessage(String _corpsDuMessage) {
        this._corpsDuMessage = _corpsDuMessage;
    }

    public void setDateDeReception(Date _dateDeReception) {
        this._dateDeReception = _dateDeReception;
    }

    @Override
    public String toString() {
        return "MessagePojo{" + "_expediteur=" + _expediteur + ", _corpsDuMessage=" + _corpsDuMessage + ", _dateDeReception=" + _dateDeReception + '}';
    }
    
    
    
    
}
