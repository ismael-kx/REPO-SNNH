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
public class LikePojo implements Serializable{
    private String _liker;
    private String _likeTopic;
    private Date _likeDate;

    public LikePojo() {
    }

    public String getLiker() {
        return _liker;
    }

    public String getLikeTopic() {
        return _likeTopic;
    }

    public Date getLikeDate() {
        return _likeDate;
    }

    public void setLiker(String _liker) {
        this._liker = _liker;
    }

    public void setLikeTopic(String _likeTopic) {
        this._likeTopic = _likeTopic;
    }

    public void setLikeDate(Date _likeDate) {
        this._likeDate = _likeDate;
    }

    @Override
    public String toString() {
        return "LikePojo{" + "_liker=" + _liker + ", _likeTopic=" + _likeTopic + ", _likeDate=" + _likeDate + '}';
    }
    
    
    
}
