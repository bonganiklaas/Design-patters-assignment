/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.structural.facade;

/**
 *
 * @author Khulsum
 */
public class MainDriver {
    public static void main ( String [ ] args ) {
Facade facade = new Facade () ;
int x = 3;
System . out . println ("Cube o f " + x + " : " + facade . cubeX (3) ) ;
System . out . println ("Cube o f " + x + " times 2 : " + facade . cubeXTimes2 (3) ) ;
System . out . println ( x + " t o sixth power times 2 : " + facade . xToSixthPowerTimes2 (3) ) ;
}
}
