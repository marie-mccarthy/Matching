import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game
	{
		public static ArrayList <cards> board = new ArrayList <cards>();
		
		public static void createCards() throws FileNotFoundException
		{
			System.out.println("what kind of matching would you like to play?");
			
			Scanner file;
			Scanner userInput4 = new Scanner(System.in);
			String whichKind = userInput4.next();
			if(whichKind.equals("fruit"));
				{
					file = new Scanner( new File( "fruit" ) );
				}
				if(whichKind.equals("animal"))
				{
					file = new Scanner( new File( "Animals" ) );

				}
			int numberOfLines = file.nextInt();
			file.nextLine();
			  for( int zz = 0; zz < numberOfLines; zz++ )
				    {
				    	String word = file.nextLine();
				    	String card1 = word;
				    	String card2 = word;
				    	board.add(new cards(card1));
				    	System.out.println(card1);
				    	board.add(new cards(card2));
				    	System.out.println(card2);
				    	
				    }
			  
//			  Collections.shuffle(board);
//			  String [][] MyMatrix = {{board.get(1).getName(),board.get(2).getName()},
//						  			{board.get(3).getName(), board.get(4).getName()},
//				  					{board.get(5).getName(), board.get(6).getName()},
//				  					{board.get(7).getName(), board.get(8).getName()}};
//			  System.out.println(MyMatrix[1][2]);

			  
			  
			  
			  
			  
			  
			  
			  
			  



//				for(int i = 0; i < MyMatrix.length+1; i++)
//					{
//						for(int j = 0; j<MyMatrix.length+1; j++)
//							{
//								
//								System.out.println(MyMatrix [i][j]);
//							}
//					}
//			//	MyMatrix [1][2] = "hello";
//				for(int a = 0; a < board.size(); a++)
//					{
//						for(int b = 0; b<board.size(); b++)
//							{
//								System.out.println(MyMatrix[a][b]);
//							}
//					}

		}

	}
