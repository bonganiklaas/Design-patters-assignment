/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.behavioral.observer;
import java.util.HashSet ;
import java.util.Iterator ;
import java.util.Set ;

/**
 *
 * @author Khulsum
 */
public class WeatherStation implements WeatherSubject {
Set<WeatherObserver > weatherObservers ;
int temperature ;
public WeatherStation ( int temperature ) {
weatherObservers = new HashSet<WeatherObserver >() ;
this . temperature = temperature ;
}
@Override
public void addObserver ( WeatherObserver weatherObserver ) {
weatherObservers . add ( weatherObserver ) ;
}
@Override
public void removeObserver ( WeatherObserver weatherObserver ) {
weatherObservers . remove ( weatherObserver ) ;
}
@Override
public void doNotify ( ) {
Iterator<WeatherObserver > it= weatherObservers . iterator () ;
while ( it . hasNext () ) {
WeatherObserver weatherObserver = it. next () ;
weatherObserver . doUpdate ( temperature ) ;
}
}
public void setTemperature ( int newTemperature ) {
System.out.println ("\nWeather station setting temperature t o " + newTemperature ) ;
temperature = newTemperature ;
doNotify () ;
}
    
}
