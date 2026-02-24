package org.vineet;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object Created");
    }
    @Override
    public void compile()
    {
        System.out.println("compiling using Laptop");
    }
}
