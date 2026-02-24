package org.vineet.app.model;

import org.springframework.stereotype.Component;

@Component
class Desktop implements  Computer{

    public void compile() {
        System.out.println("compiling in Desktop");
    }
}
