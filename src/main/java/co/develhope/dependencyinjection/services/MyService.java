package co.develhope.dependencyinjection.services;

import co.develhope.dependencyinjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    MyComponent myComponent;

    // constructor based injection
    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService constructor ");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("MyService.getName()");
        return myComponent.getMyComponentName();
    }

}
