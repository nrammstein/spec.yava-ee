package ru.killing.ee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MySingleton
 */
@Stateless(mappedName = "singleton")
@LocalBean
public class MySingleton implements IMySingleton {

    /**
     * Default constructor. 
     */
    public MySingleton() {
        // TODO Auto-generated constructor stub
    }

}
