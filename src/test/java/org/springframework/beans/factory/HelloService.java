package org.springframework.beans.factory;

public class HelloService {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
