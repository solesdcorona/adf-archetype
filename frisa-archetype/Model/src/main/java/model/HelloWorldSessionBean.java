package model;

import javax.ejb.Remote;

@Remote
public interface HelloWorldSessionBean {
    public String getMessage();
}
