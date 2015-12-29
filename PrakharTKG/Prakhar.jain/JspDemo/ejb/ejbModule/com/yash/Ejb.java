package com.yash;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Ejb
 */
@Stateless
@LocalBean
public class Ejb implements EjbRemote, EjbLocal {

    /**
     * Default constructor. 
     */
    public Ejb() {
        // TODO Auto-generated constructor stub
    }

}
