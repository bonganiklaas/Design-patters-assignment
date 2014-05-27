/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.behavioral.templatemethod;

/**
 *
 * @author Khulsum
 */
public class HamburgerMeal extends Meal {
       @Override
public void prepareIngredients ( ) {
System.out.println ("Getting burgers , buns , and french fries ") ;
}
@Override
public void cook ( ) {
System.out.println ("Cooking burgers on grill and fries i n oven") ;
}
@Override
public void cleanUp ( ) {
System.out.println ("Throwing away paper plates ") ;
}
}
