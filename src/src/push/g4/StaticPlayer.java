package push.g4;

import push.sim.Move;
import push.sim.Player.Direction;

public class StaticPlayer {
	public static double alpha=0.5; //current gain weight
	
	public static int[][] validRows = {{4,6,8,10,12},
									{3,5,7,9,11,13}, 
									{2,4,6,8,10,12,14},
									{1,3,5,7,9,11,13,15},
									{0,2,4,8,10,12,14,16},
									{1,3,5,7,9,11,13,15},
									{2,4,6,8,10,12,14},
									{3,5,7,9,11,13},
									{4,6,8,10,12}};

	public static int[][] score0 = 
		//	 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
		{	{0,0,0,0,0,0,0,0,0,0,2,0,4,0,0,0,0},	//0
			{0,0,0,0,0,0,0,0,0,1,0,3,0,2,0,0,0},	//1
			{0,0,0,0,0,0,0,0,0,0,2,0,1,0,0,0,0},	//2
			{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},	//3
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//4
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//5
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//6
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//7
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};	//8
	public static int[][] score1 = 
		//	 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
		{	{0,0,0,0,4,0,2,0,0,0,0,0,0,0,0,0,0},	//0
			{0,0,0,2,0,3,0,1,0,0,0,0,0,0,0,0,0},	//1
			{0,0,0,0,1,0,2,0,0,0,0,0,0,0,0,0,0},	//2
			{0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},	//3
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//4
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//5
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//6
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//7
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};	//8
	
	public static int[][] score2 = 
		//	 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
		{	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//0
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//1
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//2
			{0,2,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},	//3
			{4,0,3,0,2,0,1,0,0,0,0,0,0,0,0,0,0},	//4
			{0,2,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},	//5
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//6
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//7
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};	//8
	
	public static int[][] score3 = 
		//	 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
		{	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//0
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//1
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//2
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//3
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//4
			{0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},	//5
			{0,0,0,0,1,0,2,0,0,0,0,0,0,0,0,0,0},	//6
			{0,0,0,2,0,3,0,1,0,0,0,0,0,0,0,0,0},	//7
			{0,0,0,0,4,0,2,0,0,0,0,0,0,0,0,0,0}};	//8
	public static int[][] score4 = 
		//	 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
		{	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//0
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//1
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//2
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//3
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//4
			{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},	//5
			{0,0,0,0,0,0,0,0,0,0,2,0,1,0,0,0,0},	//6
			{0,0,0,0,0,0,0,0,0,1,0,3,0,2,0,0,0},	//7
			{0,0,0,0,0,0,0,0,0,0,2,0,4,0,0,0,0}};	//8
	public static int[][] score5 = 
		//	 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
		{	{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//0
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//1
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//2
			{0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,2,0},	//3
			{0,0,0,0,0,0,0,0,0,0,1,0,2,0,3,0,4},	//4
			{0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,2,0},	//5
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//6
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	//7
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};	//8
		

	
	
	
	public static int getScore(Direction player, int row, int col){
		//TODO FIX IDS, they don't correspond to the same numbers in the board (e.g., id 0 should be in (4,0))
		//player id 0
		if(player.getHome().x == 12 && player.getHome().y ==0)
			return score0[row][col];
		//player id 1
		if(player.getHome().x == 4 && player.getHome().y ==0)
			return score1[row][col];
		//player id 2
		if(player.getHome().x == 0 && player.getHome().y ==4)
			return score2[row][col];
		//player id 3
		if(player.getHome().x == 4 && player.getHome().y ==8)
			return score3[row][col];
		//player id 4
		if(player.getHome().x == 12 && player.getHome().y ==8)
			return score4[row][col];
		//player id 5
		if(player.getHome().x == 16 && player.getHome().y ==4)
			return score5[row][col];

		throw new RuntimeException("Invalid Player");
	}
	
	public static int getGain(Move move, Direction direction, int [][] oldBoard)
	{
		int srcColumn=move.getX();
		int srcRow=move.getY();
		int dstColumn=move.getNewX();
		int dstRow=move.getNewY();
		
		int srcScore=StaticPlayer.getScore(direction, srcRow, srcColumn);
		int dstScore=StaticPlayer.getScore(direction, dstRow, dstColumn);
		
		return (dstScore-srcScore)*oldBoard[srcRow][srcColumn];
	}
}
