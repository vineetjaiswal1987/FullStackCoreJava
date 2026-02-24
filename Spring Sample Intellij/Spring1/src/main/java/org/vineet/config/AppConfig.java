package org.vineet.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.vineet.Alien;
import org.vineet.Computer;
import org.vineet.Desktop;
import org.vineet.Laptop;

import javax.naming.Name;

@Configuration
@ComponentScan("org.vineet")
public class AppConfig
{
//    @Bean
//    public Alien alien(Computer com)
//    {
//        Alien obj=new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//    //    @Bean(name = {"Beast","desktop","com1"})
//    @Bean
//
////    @Scope("prototype")
//    public Desktop desktop1(){
//        return new Desktop();
//    }
//    @Bean
//    @Primary
////    @Scope("prototype")
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
