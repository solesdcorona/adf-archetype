package model;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless(name = "HelloWorldSessionBean", mappedName = "AdfejbsampleApp-Model-HelloWorldSessionBean")
public class HelloWorldSessionBeanBean implements HelloWorldSessionBean, HelloWorldSessionBeanLocal {
    @Resource
    SessionContext sessionContext;

    public HelloWorldSessionBeanBean() {
    }
    
    public String getMessage() {
        return "Hello World" ;
    }
}
