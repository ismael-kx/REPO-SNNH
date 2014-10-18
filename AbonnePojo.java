/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kx.insta.pojo;

import java.io.Serializable;

/**
 *
 * @author KX
 */
public class AbonnePojo implements Serializable {
    private String _login;
    private String _password;

    public AbonnePojo() {
        
    }

    public String getLogin() {
        return _login;
    }

    public void setLogin(String _login) {
        this._login = _login;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }
    
    
    
    
    
}
