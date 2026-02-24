package org.vineet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);  // Explicitly set port
        tomcat.setBaseDir("temp"); // Required base dir

        Context context = tomcat.addContext("", new java.io.File(".").getAbsolutePath());

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}


//package org.vineet;
//
//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
//
///**
// * Hello world!
// *
// */
//public class App
//{
//    public static void main( String[] args ) throws LifecycleException {
//        System.out.println( "Hello World!" );
//        Tomcat tomcat=new Tomcat();
//
//        Context context= tomcat.addContext("",null);
//        Tomcat.addServlet(context,"HelloServlet", new HelloServlet());
////                (context,"HelloServlet" , new HelloServlet());
//        context.addServletMappingDecoded("/hello","HelloServlet");
//        tomcat.start();
//        System.out.println(tomcat.getServer());
//        tomcat.getServer().await();
//    }
//}
