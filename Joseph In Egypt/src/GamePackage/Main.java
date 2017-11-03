/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePackage;
/**
* 
* @author rbtwa
*/
//Import Items
import byui.cit260.josephInEgypt.model.Crops;
import byui.cit260.josephInEgypt.model.Game;
//Not using the below yet.
//import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Player;
//Map class still needs to be created
//import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.InventoryItem;
import byui.cit260.josephInEgypt.view.StartProgramView;

public class Main
{

    private static Game currentGame = null;
    private static Player Player = null;
    
    private static final Crops theCrops = new Crops();
        
    public static void main(String[] args) 
    {
        
        // Create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        //Comment below line out for now, not sure how to fix it yet.
        //StartProgramView.displayStartProgramView();
    
    }
        
        public static Game getCurrentGame() {
            return currentGame;
        }
        
        public static void setCurrentGame(Game currentGame){
            Main.currentGame = currentGame;
        }
        
        public static Player getPlayer(){
            return Player;
        }
        
        public static void setPlayer(Player Player){
            Main.Player = Player;
        }
}