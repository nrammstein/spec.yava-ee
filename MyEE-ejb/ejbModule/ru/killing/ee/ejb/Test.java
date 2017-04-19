package ru.killing.ee.ejb;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Stateless
public class Test {
	
public void echotest(){
	System.out.println("hello");
}

@Produces
@Named
public double getRnd(){
	return Math.random();
}

@Produces
@Named
public double getRnd100(){
	return Math.random()*100;
}

}
