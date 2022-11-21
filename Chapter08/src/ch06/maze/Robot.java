package ch06.maze;

import java.util.Stack;


public class Robot{

	public static int NUMDIRECTIONS =  4;
	public static int WIDTH = 8;
	public static int HEIGHT = 8;
	
	Stack<Move> stack = new Stack<Move>();
	Move Move;
	Maze maze = new Maze();
	
	public int[][] DIRECTION_OFFSETS = 
	{
		{0, -1}, // 위쪽으로 이동
		{1, 0}, // 오른쪽으로 이동
		{0, 1}, // 아래쪽으로 이동
		{-1, 0} // 왼쪽으로 이동
	};

	public static int NOTVISIT = 0;
	public static int WALL = 1;
	public static int VISIT = 2;
	int[][] markArray = new int[8][8];
}