/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.structural.adapter;

/**
 *
 * @author Khulsum
 */
public class DriverMain {
    
    public static void main ( String [ ] args ) {
// class adapter
System.out.println("class adapter test");
TemperatureInfo tempInfo = new TemperatureClassReporter () ;
testTempInfo ( tempInfo ) ;
// object adapter
System.out.println("\nobject adapter test");
tempInfo = new TemperatureObjectReporter ();
testTempInfo ( tempInfo ) ;
}
public static void testTempInfo ( TemperatureInfo tempInfo ) {
tempInfo . setTemperatureInC (0) ;
System.out.println("temp i n C:" + tempInfo . getTemperatureInC () ) ;
System.out.println("temp i n F:" + tempInfo . getTemperatureInF () ) ;
tempInfo.setTemperatureInF (85) ;
System.out.println("temp i n C:" + tempInfo . getTemperatureInC () ) ;
System.out.println("temp i n F:" + tempInfo . getTemperatureInF () ) ;
}
    
}
