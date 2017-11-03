/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author rbtwa
 */
import java.util.Random;
import byui.cit260.josephInEgypt.model.Crops;

    public class CropsControl {
    
    //Random number generator
    private static Random random = new Random();
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 9;
    
    //Calc Land cost via random number between 17-26 (bushels).
    public static int calcLandCost(){
        int landPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
        return landPrice;
    }
    
    public static int buyLand(Crops theCrops, int landToBuy, int landPrice){
        //If response is less than "0", return -1
        if(landToBuy<0)
            return -1;
    
        //If response is greater than wheatInStore, return -1
        int wheat = theCrops.getWheatInStore();
        if(wheat<landToBuy*landPrice)
            return -1;

        //acresOwned = acresOwned+landToBuy.
        int acresOwned = theCrops.getAcresOwned();
        acresOwned += landToBuy; //acresOwned = acresOwned+landToBuy.
        theCrops.setAcresOwned(acresOwned);
        
        //wheatInStore = wheatInStore - (landToBuy * landPrice).
        wheat -= (landToBuy*landPrice);
        theCrops.setWheatInStore(wheat);
        //return wheatInStore
        return wheat;
    }
    
    //sellLandMethod

    public class sellLandControl {
        //The sellLand method.
        //Purpose: To sell land.
        //Parameters: acresOwned, landToBuy, landToSell, landPrice, wheatInStore 
        //Returns: Amount of wheat gained from sell as well as acres lost/sold.
        //Pre-conditions: Acres to sell must be 0 or greater, and land owned must
        //be greater than land to sell.

    public int sellLand(Crops theCrops, int landToSell, int landPrice)
    {

        //If landToSell < 0, return -1.
        if(landToSell<0)
            return -1;
        
        int acresOwned = theCrops.getAcresOwned();
        if (landToSell>acresOwned)
            return -1;
        else 
            acresOwned -= landToSell;
        theCrops.setAcresOwned(acresOwned);

        //wheat = wheat + (landToSell * landPrice.
        int wheat = theCrops.getWheatInStore();
        wheat += landToSell*landPrice;
        theCrops.setWheatInStore(wheat);
        
        //return wheatInStore
        return wheat;
    }
    } 
    /*Feed the people
        Purpose: Feed the people from wheatInStore variable, so that they don't
        starve, and you don't lose your head.
        */
        public int feedPeople(Crops theCrops, int wheatInStore, int fed){
            int wheat = theCrops.getWheatInStore();
            
            if(fed < 0 || fed>wheatInStore)
                return -1;
            wheat -= fed;
        theCrops.setWheatInStore(wheat);
        return wheat;
        }
        
        /*Planting Acres
        
        Purpose: Set aside acres to plant for next year's harvest
        Parameters: wheatInStore, acresToPlant
        Returns: wheatInStore
        Pre-Conditions: 
            Can't plant negative amount of acres
            wheatInStore > wheatToPlant
        
        */
        
        public int acresToPlant(Crops theCrops, int acresToPlant, int wheatInStore, int acresOwned){
            
            int wheat = theCrops.getWheatInStore();
            int acres = theCrops.getAcresOwned();
            
            if(acresToPlant<0 || acresToPlant>acres || wheat<acresToPlant)
                return -1;
            
            int wheatToPlant = acresToPlant/2;
            wheat -= wheatToPlant;
            theCrops.setWheatInStore(wheat);
            theCrops.setAcresToPlant(acresToPlant);
            return wheat;
        }
        //Print data to test results 
        public CropsControl(Crops theCrops, int acresOwned, int wheatFromSell,
                int wheatInStore)
        {
        
        System.out.println(acresOwned);
        System.out.println(wheatFromSell);
        System.out.println(wheatInStore);
    }   
    }
    
//End sellLandMethod
