package com.seesawin.AOP.staticsProxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements IHello {
	private Logger logger = 
            Logger.getLogger(this.getClass().getName());
    
    private IHello helloObject; 

    public HelloProxy(IHello helloObject) { 
        this.helloObject = helloObject; 
    } 

    public void hello(String name) { 
        // ��x�A��
        log("hello method starts....");      

        // ����Ӱ��޿�
        helloObject.hello(name);
        
        // ��x�A��
        log("hello method ends...."); 
    } 
    
    private void log(String msg) {
        logger.log(Level.INFO, msg);
    }
}
