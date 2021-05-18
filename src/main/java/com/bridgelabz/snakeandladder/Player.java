package com.bridgelabz.snakeandladder;

import java.util.Random;

public class Player {
	public int player(int position) {
		
		Random random = new Random(); //instance of random class
		int int_random = random.nextInt(6) + 1;
		int int_choice = random.nextInt(3) + 1;
		if(int_choice == 2)	{
			position = position + int_random;
			player(position);
		}
		else if(int_choice == 3)
			position = position - int_random;
		if(position<0)
			position=position-position;
		if(position>100)
			position=100;
		
		return position;
	}

}
