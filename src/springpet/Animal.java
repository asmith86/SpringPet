/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpet;

/**
 *
 * @author asmith86
 */
public interface Animal {

    int getAge();

    String getName();

    void setAge(int age);

    void setName(String name);

    void speak();
    
    
    
}
