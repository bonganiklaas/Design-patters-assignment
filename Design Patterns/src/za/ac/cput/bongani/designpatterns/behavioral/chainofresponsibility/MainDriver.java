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
public class MainDriver {
    
    public static void main ( String [ ] args ) {
PlanetHandler chain = setUpChain () ;
//Submit Requests
chain . handleRequest ( PlanetEnum . VENUS ) ;
chain . handleRequest ( PlanetEnum . MERCURY ) ;
chain . handleRequest ( PlanetEnum . EARTH ) ;
chain . handleRequest ( PlanetEnum . JUPITER ) ;
}
public static PlanetHandler setUpChain ( ) {
PlanetHandler mercuryHandler = new MercuryHandler () ;
PlanetHandler venusHandler = new VenusHandler () ;
PlanetHandler earthHandler = new EarthHandler () ;
mercuryHandler . setSuccessor ( venusHandler ) ;
venusHandler . setSuccessor ( earthHandler ) ;
return mercuryHandler ;
}
    
}
