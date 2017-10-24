package model;

import javax.ejb.Local;

@Local
public interface HelloWorldSessionBeanLocal {
    public String getMessage();
}
