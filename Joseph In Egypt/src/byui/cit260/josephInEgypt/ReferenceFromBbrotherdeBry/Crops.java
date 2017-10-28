// Crop class: part of the model layer that holds
// data related to planting and harvesting crops
// Author: Roger deBry
// Date last modified: October 18, 2017
//--------------------------------------------------
package byui.cit260.josephInEgypt.ReferenceFromBbrotherdeBry;

public class Crops
{
    // data members
    int landOwned;
    
    int wheatInStore;
    
    // empty (default) constructor
    Crops() {}
    
    // getters and setters
    int getLandOwned( )
    {
        return landOwned;
    }
    
    void setLandOwned(int _landOwned)
    {
        landOwned = _landOwned;
    }
    
    int getWheatInStore( )
    {
        return wheatInStore;
    }
    
    void setWheatInStore(int _wheatInStore)
    {
        wheatInStore = _wheatInStore;
    }

}
