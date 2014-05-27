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
class AmericanSeller {
    Mediator mediator ;
float priceInDollars ;
public AmericanSeller ( Mediator mediator , float priceInDollars ) {
this . mediator = mediator ;
this . priceInDollars = priceInDollars ;
this . mediator . registerAmericanSeller ( this ) ;
}
public boolean isBidAccepted ( float bidInDollars ) {
if ( bidInDollars >= priceInDollars ) {
System.out.println (" Seller accepts the bid o f " + bidInDollars + " dollars \n") ;
return true ;
} else {
System.out.println (" Seller rejects the bid o f " + bidInDollars + " dollars \n") ;
return false ;
}
}
    
}
