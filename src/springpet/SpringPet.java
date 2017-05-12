/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author asmith86
 */
public class SpringPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext(
                        new String[] {"applicationContext.xml"});
       Person person = (Person)ctx.getBean("person");
        
//        Animal pet = new Cat("fluffy", 2);
//        Person person = new Person("John Doe", pet);
       
        
    }
    
}
