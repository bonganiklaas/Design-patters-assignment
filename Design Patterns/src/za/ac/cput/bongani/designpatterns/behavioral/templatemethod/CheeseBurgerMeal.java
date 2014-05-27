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
public class CheeseBurgerMeal extends Meal {
@Override
public void prepareIngredients ( ) {
System.out.println ("Getting ground beef and Cheese") ;
}
@Override
public void cook ( ) {
System.out.println ("Cooking ground beef i n pan") ;
}
@Override
public void eat ( ) {
System.out.println ("The Cheese Burgers are tasty") ;
}
@Override
public void cleanUp ( ) {
System.out.println ("Doing the dishes ") ;
}
    
}
