package ru.killing.rmi;

import javax.naming.*;

import ru.killing.ee.ejb.IEchoService;

public class InputClass {

	public static void main(String[] args) throws NamingException {
		Context ctx = new InitialContext();
		
		IEchoService echoB = (IEchoService)ctx.lookup("echoBean");
		echoB.echo("dick");
		echoB.getClass().getName();
		for (int i =0; i<10;i++){
		int res = echoB.incrementAndGet();
		System.out.println(res);
		}
	}

}
