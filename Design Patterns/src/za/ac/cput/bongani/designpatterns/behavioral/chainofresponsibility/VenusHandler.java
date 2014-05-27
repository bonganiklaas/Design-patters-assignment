/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.behavioral.chainofresponsibility;

/**
 *
 * @author Bongani
 */
public class VenusHandler extends PlanetHandler {
public void handleRequest ( PlanetEnum request ) {
if ( request == PlanetEnum . VENUS ) {
    System.out.println ("VenusHandler handles " + request ) ;
System.out.println ("Venus i s poisonous .\n") ;
} else {
System.out.println ("VenusHandler doesn t handle " + request ) ;
if ( successor != null ) {
successor . handleRequest ( request ) ;
}
}
}
}
