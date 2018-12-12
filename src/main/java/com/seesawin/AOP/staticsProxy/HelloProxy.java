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
        // 日誌服務
        log("hello method starts....");      

        // 執行商務邏輯
        helloObject.hello(name);
        
        // 日誌服務
        log("hello method ends...."); 
    } 
    
    private void log(String msg) {
        logger.log(Level.INFO, msg);
    }
}
