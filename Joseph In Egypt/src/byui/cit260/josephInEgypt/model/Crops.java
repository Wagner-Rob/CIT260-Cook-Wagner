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
    private int acresToPlant;
    private int sellLand;
    private int landToBuy;
    private int cropYield;
    private int wheatInStore;
    private int wheatFromSell;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int pharoahsShare;
    private int fed;
    private int planted;
    private int landPrice;


    //empty (default) constructor
    public void Crops() {}

    //declare getters and setters for the above

    public int getYear() {
        return year;
        }
    public void setYear(int _year) {
        year = _year;
        }

    public int getPopulation() {
        return population;
        }
    public void setPopulation(int _population) {
        population = _population;
        }
    
    public int getAcresOwned() {
        return acresOwned;
        }
    public void setAcresOwned(int _acresOwned) {
        acresOwned = _acresOwned;
        }

    public int getAcresToPlant() {
        return acresToPlant;
    }
    public void setAcresToPlant(int _acresToPlant) {
        acresToPlant = _acresToPlant;
    }
    
    public int getSellLand() {
        return sellLand;
    }
    public void setSellLand(int _sellLand) {
        sellLand = _sellLand;
    }
    public int getLandToBuy() {
        return landToBuy;
    }
    public void setLandToBuy(int _landToBuy) {
        landToBuy = _landToBuy;
    }
    
    public int getCropYield() {
        return cropYield;
        }
    public void setCropYield(int _cropYield) {
        cropYield = _cropYield;
        }
    
    public int getWheatInStore() {
        return wheatInStore;
        }
    public void setWheatInStore(int _wheatInStore) {
        wheatInStore = _wheatInStore;
        }
    
    public int getNumberWhoDied() {
        return numberWhoDied;
        }
    public void setNumberWhoDied(int _numberWhoDied) {
        numberWhoDied = _numberWhoDied;
        }
    
    public int getNewPeople() {
        return newPeople;
        }
    public void setNewPeople(int _newPeople) {
        newPeople = _newPeople;
        }
    
    public int getHarvest() {
        return harvest;
        }
    public void setHarvest(int _harvest) {
        harvest = _harvest;
        }
    
    public int getPharoahsShare() {
        return pharoahsShare;
        }
    public void setPharoahsShare(int _pharoahsShare) {
        pharoahsShare = _pharoahsShare;
        }
    
    public int getFed() {
        return fed;
        }
    public void setFed(int _fed) {
        fed = _fed;
        }
    
    public int getPlanted() {
    return planted;
        }
    public void setPlanted(int _planted) {
        planted = _planted;
        }

}