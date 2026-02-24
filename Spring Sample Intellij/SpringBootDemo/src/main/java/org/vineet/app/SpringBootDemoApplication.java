package org.vineet.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.vineet.app.model.Alien;
import org.vineet.app.model.Laptop;
import org.vineet.app.service.LaptopService;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {


        ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
        LaptopService service=context.getBean(LaptopService.class);
        Laptop laptop=context.getBean(Laptop.class);
        service.addLaptop(laptop);
//        Alien obj=context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();
    }

}
