/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

/**
 *
 * @author rbtwa
 */
public class StartProgramView {

    public static void displayStartProgramView() {
    
    boolean done = false; // set flag to not done
    do {
        //prompt for and get PlayersName
        String playersName = this.getPlayersName();
        
        if(playersName.toUpperCase().equals("Q")) //user wants to quit
            return; //exit the game
        
        //do requested action and display next view
        done = this.doAction(playersName);
    } while (!done);
    
    }
    
    private String getPlayersName() {
        System.out.println("n/*** getPlayersName() function called ***");
        return "Joe";
    }

    private boolean doAction(String playersName) {
        System.out.println("n/ *** doAction() function called ***");
        return true;
    }
    
    private String promptMessage;
    
    public void startProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
        //display the banner when view is created
    }
        //clicked on lightbult in number line as instructed,
        //and then the tip, which created function below.
    private void displayBanner() {
        //Although I read the alternative game intro view in the PPT slides,
        //I like haviing the "*-box" to introduce the game, but I also prefer 
        //the to-the-point message from your slides, so I commbined the two
        //below.
        System.out.println(
        "\n****************************************************************"
      + "\n*                                                              *"
      + "\n* Welcome to the game of Joseph in Egypt. In this game, you    *"
      + "\n* will assume the role of an overseer for your village. Tread  *"
      + "\n* carefully, if your people are not fed well, you may lose     *"
      + "\n* your head.                                                   *"
      + "\n                                                               *"
      + "\n****************************************************************"   
       );
    }
}

