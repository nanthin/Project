package com.niit.project1_backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.Dbconfiguration;
import com.niit.dao.CartItemDaoImpl;
import com.niit.dao.CustomerDaoImpl;
import com.niit.dao.productdaoimplementation;
import com.niit.services.CartItemServiceImp;
import com.niit.services.CustomerServiceImpl;
import com.niit.services.ProductServicesimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(Dbconfiguration.class,productdaoimplementation.class,ProductServicesimple.class,CustomerDaoImpl.class,CustomerServiceImpl.class,CartItemDaoImpl.class,CartItemServiceImp.class);
    }
}
