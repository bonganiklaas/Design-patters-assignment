/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.behavioral.state;

/**
 *
 * @author Khulsum
 */
public class MainDriver {
public static void main ( String [ ] args ) {
Person person = new Person (new HappyState () ) ;
System.out.println ("Hello i n happy state : " + person . sayHello () ) ;
System.out.println ("Goodbye i n happy state : " + person . sayGoodbye () ) ;
person . setEmotionalState (new SadState () ) ;
System.out.println ("Hello i n sad state : " + person . sayHello () ) ;
System.out.println ("Goodbye i n sad state : " + person . sayGoodbye () ) ;
}
}
