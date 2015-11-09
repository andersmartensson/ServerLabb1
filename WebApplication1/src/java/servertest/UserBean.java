package servertest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anders
 */
@ManagedBean
@SessionScoped
public class UserBean {
    
    private String name;

    /**
     * Creates a new instance of NameBean
     */
    public UserBean() {
        name = UserDB.getName();
    }
    
    public String getName(){
        return name;
    }
    
}
