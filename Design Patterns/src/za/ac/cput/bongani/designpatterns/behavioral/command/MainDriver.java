/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.bongani.designpatterns.behavioral.command;

/**
 *
 * @author Khulsum
 */
public class MainDriver {
public static void main ( String [ ] args ) {
Lunch lunch = new Lunch () ; // receiver
Command lunchCommand = new LunchCommand ( lunch ) ; // concrete command
Dinner dinner = new Dinner () ; // receiver
Command dinnerCommand = new DinnerCommand ( dinner ) ; // concrete command
MealInvoker mealInvoker = new MealInvoker ( lunchCommand ) ; // invoker
mealInvoker . invoke () ;
mealInvoker . setCommand ( dinnerCommand ) ;
mealInvoker . invoke () ;
}
}