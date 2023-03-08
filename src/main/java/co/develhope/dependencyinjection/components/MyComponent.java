package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor ");
        this.myComponentName = "Pino Rossi";
    }

    public String getMyComponentName(){
        System.out.println("getMyComponentName()");
        return myComponentName;
    }

}
