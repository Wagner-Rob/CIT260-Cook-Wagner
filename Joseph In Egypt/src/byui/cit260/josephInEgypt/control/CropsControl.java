/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joseph_In_Egypt.Source_Packaages.byui.cit260.josephInEgypt.control;

/**
 *
 * @author rbtwa
 */
import java.util.Scanner;
import byui.cit260.josephInEgypt.model;

    public class CropsControl {
    
    //empty constructor
    public CropsControl() {}
        
    // the sellLand method
    // Purpose: Process data input by user to sell land
    // Parameters: Crops object, amount of land to Sell, and land price
    // Returns: none    
    public static int sellLand(Crops theCrops, int landToSell, int landPrice)    
    
    class toSell=int 10;
        if(toSell<0)
            return-1;
                
        int wheat = theCrops.getWheatInStore();
        if(wheat< toBuy*landCost)
            return -1;
        
        int acres = theCrops.getAcres();
        acres+=toBuy;
        theCrops.setAcres(acres);
        
        wheat-=(toBuy*landCost);
        TheCrops.setWheatInStore(wheat);
        return wheat;
        
        
      }
        
}













Test Class:

package josephInEgypt.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rbtwa
 */
public class CropsControlTest {
    
    public CropsControlTest() {
    }

    @Test
    public void testbuyLand() {
  
        Crops theCrops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);
        
        int toBuy = 10;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult= 2600;
        int result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
        
                
        
            }
    
}
