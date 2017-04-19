package ru.killing.ee.ejb;

import javax.annotation.PostConstruct;
//import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Session Bean implementation class EchoService
 */
@Stateless(mappedName = "echoBean")
@LocalBean
public class EchoService implements IEchoService {
	
	//@EJB
	@Inject
	Test test;
	
	@Inject
	@Named
	double rnd;
	
	int count;
	
	
	
	
    @PostConstruct
    public void init(){
    	
    }
    
    @Override
    public int incrementAndGet(){
    	System.out.println("--->>>"+Thread.currentThread());
    	return ++count;
    }
  
    
    
    @Override
	public String echo(String msg){
    	test.echotest();
    	System.out.println(rnd);
    	return "re:"+msg;
    }
    
}
