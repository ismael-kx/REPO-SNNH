/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kx.insta.pojo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author KX
 */
public class FacebookPojo implements Serializable {
    
    private AbonnePojo _titulaire;
    private List<MessagePojo> _read ;
    private List<MessagePojo> _unRead;
    private List<LikePojo> likes;

    public FacebookPojo() {
    }

    public List<MessagePojo> getRead() {
        return _read;
    }

    public List<MessagePojo> getUnRead() {
        return _unRead;
    }

    public List<LikePojo> getLikes() {
        return likes;
    }

    public void setRead(List<MessagePojo> _read) {
        this._read = _read;
    }

    public void setUnRead(List<MessagePojo> _unRead) {
        this._unRead = _unRead;
    }

    public void setLikes(List<LikePojo> likes) {
        this.likes = likes;
    }
    @Override
    public String toString() {
        return "FacebookPojo{" + "_read=" + _read + ", _unRead=" + _unRead + ", likes=" + likes + '}';
    }
    
    

}
