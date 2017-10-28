/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt;
/**
* 
* @author rbtwa
*/
import byui.cit260.josephInEgypt.model.Crops;
import byui.cit260.josephInEgypt.view.CropsView;
import byui.cit260.josephInEgypt.control.CropsControl;
import byui.cit260.josephInEgypt.view.StartProgramView;

public class JosephInEgypt
{

    private static final Crops theCrops = new Crops();
        
    public static void main(String[] args) {
        
        // Create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        StartProgramView.displayStartProgramView();
                      
        // set values for landOwned and wheatInStore to test
        // this code by calling setter methods in the model layer
        theCrops.setLandOwned(100);
        theCrops.setWheatInStore(1000);
        
        // Call the CropsView method, pass the Crops object as a parameter
        // Note from bro. deBry: 
        // The method is static, so we use className.methodName()
        CropsView.displayBuyLandView(theCrops);
        
        //Call the CropsView method for selling land
        CropsView.displaySellLandView(theCrops);
    }

    private static class theCrops extends Crops {

        public theCrops() {
        }
    }
    
}
