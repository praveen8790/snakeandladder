package com.bridgelabz.snakeandladder;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main 
{
	private static final Logger LOG = LogManager.getLogger(Main.class);
    public static void main( String[] args )
    {
    	int i=0,count =0;
    	while(i<100 && i>=0) {
    		Random random = new Random(); //instance of random class
    	    int int_random = random.nextInt(6) + 1;
    	    int int_choice = random.nextInt(3) + 1;
    	    System.out.println(i);
    	    if(int_choice == 2)	
    	    	i = i + int_random;
    	    else if(int_choice == 3)
    	    	i = i - int_random;
    	    count = count+1;
    	    if(i<0)
    	    	i=i-i;
    	    if(i>100)
    	    	i=100;
    	}
    	System.out.println(i);
    	System.out.println("final"+count);
    }
}
