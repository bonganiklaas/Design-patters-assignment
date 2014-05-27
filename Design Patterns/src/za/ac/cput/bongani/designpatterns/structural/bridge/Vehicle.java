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
public abstract class Vehicle {
    
    Engine engine ;
int weightInKilos ;
public abstract void drive () ;
public void setEngine ( Engine engine ) {
this . engine = engine ;
}
public void reportOnSpeed ( int horsepower ) {
int ratio = weightInKilos / horsepower ;
if ( ratio < 3 ) {
System . out . println ("The vehicle i s going a t a fast speed . ") ;
} else if ( ( ratio >= 3 ) && ( ratio < 8) ) {
System . out . println ("The vehicle i s going an average speed . ") ;
} else {
System . out . println ("The vehicle i s going a t a slow speed . ") ;
}
}
    
}
