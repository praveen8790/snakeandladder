package com.bridgelabz.snakeandladder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main 
{
	private static final Logger LOG = LogManager.getLogger(Main.class);
    public static void main( String[] args )
    {
    	int i=0,count =0;
    	String winner = "";
    	int positionof1=0,positionof2=0;
    	Player player1 = new Player();
    	Player player2 = new Player();
    	while(i<100 && i>=0) {
    		positionof1 = player1.player(positionof1);
    		positionof2 = player2.player(positionof2);
    		count = count+1;
    		i = Math.max(positionof1, positionof2);
    		if(positionof1>=100) {
    			winner = "winner is player 1";
    			break;
    		}
    		else if(positionof2>=100)
    			winner = "winner is player 2";
    		}
    	LOG.debug(winner);
    }
}
