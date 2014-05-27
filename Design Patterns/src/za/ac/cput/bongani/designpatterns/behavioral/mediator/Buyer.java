/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.behavioral.mediator;

/**
 *
 * @author Khulsum
 */
class Buyer {
    
    Mediator mediator ;
String unitOfCurrency ;
public Buyer ( Mediator mediator , String unitOfCurrency ) {
this . mediator = mediator ;
this . unitOfCurrency = unitOfCurrency ;
}
public boolean attemptToPurchase ( float bid ) {
System.out.println ("Buyer attempting a bid o f " + bid + " " + unitOfCurrency ) ;
return mediator . placeBid ( bid , unitOfCurrency ) ;
}
    
}