// CropsControl class: part of the control layer that has
// methods related to planting and harvesting crops
// Author: Roger deBry
// Date last modified: October 19, 2017
//--------------------------------------------------
package byui.cit260.josephInEgypt.ReferenceFromBbrotherdeBry;

public class CropsControl
{
    // empty (default) constructor
    public CropsControl() {}
    
    // the buyLand method
    // Purpose: Process data input by user to buy land
    // Parameters: Crops object, amount of land to Purchase, and land price
    // Returns: none
    public static int buyLand(Crops theCrops, int landToBuy, int landPrice)
    {
        // see if we have enough wheat
        if(landToBuy * landPrice > theCrops.getWheatInStore())
        {
            // error, not enough wheat
            return -1;
        }
        
        // subtract wheat we spent from wheat in store
        int wheatInStore = theCrops.getWheatInStore();
        wheatInStore = wheatInStore - (landToBuy * landPrice);
        
        // add land to land owned
        int landOwned = theCrops.getLandOwned();
        landOwned = landOwned + landToBuy;
        
        // save the updated values of the data back in the model layer
        theCrops.setWheatInStore(wheatInStore);
        theCrops.setLandOwned(landOwned);
        
        return landOwned; // return landOwned so we can unit test this method
        
    }
    
}
