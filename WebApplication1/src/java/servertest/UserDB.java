package servertest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */

import javax.persistence.*;


public class UserDB {
    
    
    public static String getName(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistanceUnit");
        EntityManager em = emf.createEntityManager(); 
        
        //User user = (User) em.find(User.class, 1);
        //return user.getName();
        return "hej";
    }
    
    
}
