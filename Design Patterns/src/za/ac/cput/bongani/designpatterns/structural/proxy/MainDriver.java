/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.structural.proxy;

/**
 *
 * @author Khulsum
 */
public class MainDriver {
    
    public static void main ( String [ ] args ) {
Proxy proxy = new Proxy () ;
FastThing fastThing = new FastThing () ;
fastThing . sayHello () ;
proxy . sayHello () ;
}
    
}
