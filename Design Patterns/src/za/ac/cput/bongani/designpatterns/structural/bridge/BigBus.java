/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.structural.bridge;

/**
 *
 * @author Khulsum
 */
public class BigBus extends Vehicle {
public BigBus ( Engine engine ) {
this . weightInKilos = 3000;
this . engine = engine ;
}
@Override
public void drive ( ) {
System . out . println ("\nThe big bus i s driving") ;
int horsepower = engine . go () ;
reportOnSpeed ( horsepower ) ;
}
    
}
