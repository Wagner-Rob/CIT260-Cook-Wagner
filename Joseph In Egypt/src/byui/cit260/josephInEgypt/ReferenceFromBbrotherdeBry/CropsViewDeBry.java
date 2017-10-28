// CropsView class: part of the view layer that holds methods
// related to user interface for planting and harvesting crops
// Author: Roger deBry
// Date last modified: October 18, 2017
//--------------------------------------------------
package byui.cit260.josephInEgypt.ReferenceFromBbrotherdeBry;

// this import is required to create a Scanner object for keyboard input
import java.util.Scanner;

public class CropsView {

    // default constructor
    public CropsView() {}
    
    // displayBuyLandView method - a static method
    // Purpose: Provides the user interface for buying land
    // Parameters: The Crops object -to access landOwned and wheatInStore
    // Returns: none
    public static void displayBuyLandView(byui.cit260.josephInEgypt.view.CropsView theCrops)
    {
        // create a scanner object for getting user input
        Scanner keyboard = new Scanner(System.in);
        
        // declare a variable to hold the user's input for amount of land to buy
        int landToBuy;
        
        // the price of land is a random value, but the code to generate
        // the land proice has not been written yet.
        // use a value of 10 bushels of wheat to buy one acre
        // of land so we can test this method       
        System.out.println("Land costs 10 bushels of wheat per acre.");
        System.out.println("How much land do you want to buy?");
        
        // get the user's input and save it in the local variable toSell
        int toBuy = keyboard.nextInt();
        
        // call cropsControl method to do the calculations
        // it returns -1 if there is not enough wheat to buy the land
        int returnValue = CropsControl.buyLand(theCrops, toBuy, 10);
        
        if(returnValue == -1)
            System.out.println("Error ... you do not have enough wheat to make this purchase.");
        else
            System.out.format("Purchase complete. Land owned = %d acres.", returnValue);
    }
}
