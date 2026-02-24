package org.vineet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {
   private  int age;

//   @Qualifier("com2")
   private Computer com;
    public Alien() {
        System.out.println("Alien Object Created");
    }


    public int getAge() {
        return age;
    }
    @Value("21")
    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired()
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("Coding");
        com.compile();
    }


}
