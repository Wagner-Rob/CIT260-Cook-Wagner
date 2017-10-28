/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

/**
 *
 * @author rbtwa
 */

//declare Crops' class


public class Crops {
    
    //data members
    private int year;
    private int population;
    private int acresOwned;
    private int sellLand;
    private int landToBuy;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int pharoahsShare;
    private int fed;
    private int planted;


    //empty (default) constructor
    public void Crops() {}

    //declare getters and setters for the above

    private int getYear() {
        return year;
        }
    private void setYear(int _year) {
        year = _year;
        }

    private int getPopulation() {
        return population;
        }
    private void setPopulation(int _population) {
        population = _population;
        }
    
    private int getAcresOwned() {
        return acresOwned;
        }
    private void setAcres(int _acresOwned) {
        acresOwned = _acresOwned;
        }

    private int getSellLand() {
        return sellLand;
    }
    private void setSellLand(int _sellLand) {
        sellLand = _sellLand;
    }
    private int getLandToBuy() {
        return landToBuy;
    }
    private void setLandToBuy(int _landToBuy) {
        landToBuy = _landToBuy;
    }
    
    private int getCropYield() {
        return cropYield;
        }
    private void setCropYield(int _cropYield) {
        cropYield = _cropYield;
        }
    
    private int getWheatInStore() {
        return wheatInStore;
        }
    private void setWheatInStore(int _wheatInStore) {
        wheatInStore = _wheatInStore;
        }
    
    private int getNumberWhoDied() {
        return numberWhoDied;
        }
    private void setNumberWhoDied(int _numberWhoDied) {
        numberWhoDied = _numberWhoDied;
        }
    
    private int getNewPeople() {
        return newPeople;
        }
    private void setNewPeople(int _newPeople) {
        newPeople = _newPeople;
        }
    
    private int getHarvest() {
        return harvest;
        }
    private void setHarvest(int _harvest) {
        harvest = _harvest;
        }
    
    private int getPharoahsShare() {
        return pharoahsShare;
        }
    private void setPharoahsShare(int _pharoahsShare) {
        pharoahsShare = _pharoahsShare;
        }
    
    private int getFed() {
        return fed;
        }
    private void setFed(int _fed) {
        fed = _fed;
        }
    
        private int getPlanted() {
        return planted;
        }
    private void setPlanted(int _planted) {
        planted = _planted;
        }

}