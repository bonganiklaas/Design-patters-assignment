/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.creational.prototype;

/**
 *
 * @author Abdul
 */
public class MainDriver {
    
    public static void main(String []args){
        
        Person person1 = new Person("Fred");
        System.out.println("person 1:" + person1);
        Person person2 = (Person)person1.doClone();
        System.out.println("person 2:" + person2);
        
        Dog dog1 = new Dog("wooof!");
        System.out.println("dog 1:"+ dog1);
        Dog dog2 = (Dog)dog1.doClone();
        System.out.println("dog 2:" + dog2);
    }
    
}
