import java.util.*;

public class MainClass 
{
	Scanner scan = new Scanner(System.in);
	char[] valid = new char[10];
	int[][]arr = new int[100][100];
	int[][]px = new int[100][100];
	int[][]py = new int[100][100];
	int[] size = new int[100];
	int[]possible = new int[100];
	char[][][]temp = new char[100][100][100];
	int win = 0;
	int black = 0;
	int white = 0;
	int bx = 0;
	int by = 0;
	int jp = 0;
	
	public void cls()
	{
		for(int i = 0; i < 30; i++)
			System.out.println("");
	}
	
	public void menu()
	{
		System.out.println("      _  _  _  _   _  _  _  _    _  _  _  _     _                           _  _     _  _");
		System.out.println("    _(_)(_)(_)(_)_(_)(_)(_)(_) _(_)(_)(_)(_)   (_)                         (_)(_)   (_)(_)");
		System.out.println("   (_)          (_)(_)        (_)(_)      (_)_ (_) _  _  _     _  _  _  _     (_)      (_)      _  _  _");
		System.out.println("   (_)          (_)(_) _  _  _(_)(_)        (_)(_)(_)(_)(_)_  (_)(_)(_)(_)_   (_)      (_)   _ (_)(_)(_) _");
		System.out.println("   (_)          (_)(_)(_)(_)(_)_ (_)        (_)(_)        (_)(_) _  _  _ (_)  (_)      (_)  (_)         (_)");
		System.out.println("   (_)          (_)(_)        (_)(_)       _(_)(_)        (_)(_)(_)(_)(_)(_)  (_)      (_)  (_)         (_)");
		System.out.println("   (_)_  _  _  _(_)(_)_  _  _ (_)(_)_  _  (_)  (_)        (_)(_)_  _  _  _  _ (_) _  _ (_) _(_) _  _  _ (_)");
		System.out.println("     (_)(_)(_)(_) (_)(_)(_)(_)  (_)(_)(_)(_)   (_)        (_)  (_)(_)(_)(_)(_)(_)(_)(_)(_)(_)  (_)(_)(_)");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. Play");
		System.out.println("2. View Scoreboard");
		System.out.println("3. About");
		System.out.println("4. Exit");
		System.out.print(">> ");
	}
	
	public void about()
	{
		System.out.println("1.      The board size is 8x8");
		System.out.println("2.      At the start of the game, the board will have 2 white discs and 2 black discs");
		System.out.println("        -       White discs will take coordinate:");
		System.out.println("                #       x       =       4");
		System.out.println("                        y       =       4");
		System.out.println("");
		System.out.println("                #       x       =       5");
		System.out.println("                        y       =       5");
		System.out.println("        -       Black discs will take coordinate:");
		System.out.println("                #       x       =       4");
		System.out.println("                        y       =       5");
		System.out.println("");
		System.out.println("                #       x       =       5");
		System.out.println("                        y       =       4");
		System.out.println("3.      The player will take turn putting the discs");
		System.out.println("4.      The player is always white discs");
		System.out.println("5.      The game will be finished when the board is filled, or both sides do not have any turn to make");
		System.out.println("");
		String l = "Press enter to continue...";
		for(int i = 0; i < l.length(); i++)
		{
			System.out.print(l.charAt(i));
			try {
				Thread.sleep(50);
			}catch (Exception e) {}
		}
		scan.nextLine();
	}
	
	public void out()
	{
		cls();
		System.out.println("                       ###############: .------- :###############");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                     `###############- -::::::::-`-###############`");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                    `########. ```````-::######:-` `-.``` .########`");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                   .########` -::::::::/######-   -/:::::-``########.");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                   /####### `-:::########/-    `-######:::-` #######/");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                    :#####  -:::######-`   `-###########:::-` #####:");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                     -####. `-::####````-###############/:-` .####-");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                      .####: `-::#.`-#:.####-`` .######/:-` :####.");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}System.out.println("                       `####- .::/#####  #````#` /####/::. -####`");
		System.out.println("                        `###`.::#######/ `.:####--:.`.##::.`###`");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                          :`.:::##############:.````:###/::-`:");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                            -:::/#########:.`   .:######:::-");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                             .:::/#####-`   .:########/:::.");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                              .------`  `:######::-------.");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                               `::- ``.::######::- `::::`");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                                /####- .::::::::. .#####");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                                 -####: `......` :####/");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                                  .#####////////#####-");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                                   `################.");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                                     /#############`");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.println("                                      -###########");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.print("\n                	   	Thank you for playing Othello");
		try {
			Thread.sleep(150);
		}catch (Exception e) {}
		System.out.print("\n                		-Jeff-Octa-Garvin-Saverio-");
		try {
			Thread.sleep(1000);
		}catch (Exception e) {}	
	}
	
	public void changeBoard(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(valid[1] != 0)
			changeUp(x-1,y-1,isWhite,board,isChange);
		if(valid[2] != 0)
			changeDown(x-1,y-1,isWhite,board,isChange);
		if(valid[3] != 0)
			changeLeft(x-1,y-1,isWhite,board,isChange);	
		if(valid[4] != 0)
			changeRight(x-1,y-1,isWhite,board,isChange);
		if(valid[5] != 0)
			changeUR(x-1,y-1,isWhite,board,isChange);
		if(valid[6] != 0)
			changeUL(x-1,y-1,isWhite,board,isChange);	
		if(valid[7] != 0)
			changeDR(x-1,y-1,isWhite,board,isChange);	
		if(valid[8] != 0)
			changeDL(x-1,y-1,isWhite,board,isChange);
	}

	public void changeUp(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				y--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && y > 0);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				y--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && y > 0);
		}
		valid[1] = 0;
	}
	
	public void changeDown(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				y++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && y < 8);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				y++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && y < 8);
		}
		valid[2] = 0;
	}
	
	public void changeLeft(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				x--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && x > 0);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				x--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && x > 0);
		}
		valid[3] = 0;
	}
	
	public void changeRight(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				x++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && x < 8);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				x++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && x < 8);
		}
		valid[4] = 0;
	}
	
	public void changeUR(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				x++;y--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && y > 0 && x < 8);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				x++;y--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && y > 0 && x < 8);
		}
		valid[5] = 0;
	}
	
	public void changeUL(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				x--;y--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && y > 0 && x > 0);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				x--;y--;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && x > 0 && y > 0);
		}
		valid[6] = 0;
	}
	
	public void changeDR(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				x++;y++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && x < 8 && y < 8);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				x++;y++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B' && x < 8 && y < 8);
		}
		valid[7] = 0;
	}
	
	public void changeDL(int x, int y, boolean isWhite, char[][]board, boolean isChange)
	{
		if(isWhite)
		{
			do
			{
				board[y][x] = 'W';
				x--;y++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'W' && x > 0 && y < 8);
		}
		else if(!isWhite)
		{
			do
			{
				board[y][x] = 'B';
				x--;y++;
				if(isChange)
				{
					cls();
					viewBoard(board);
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}while(board[y][x] != 'B'&& x > 0 && y < 8);
		}
		valid[8] = 0;
	}
	
	public boolean checkUp(int x, int y, boolean isWhite, char[][]board)
	{
		if(y == 0)
			return false;
		if(isWhite)
		{
			if(board[y-1][x] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y-1][x] == 'W')
					{
						valid[1]++;
						return true;
					}
					y--;
				}while(board[y][x] != ' ' && y >= 1);
			}
			return false;
		}
		else
		{
			if(board[y-1][x] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y-1][x] == 'B')
					{
						valid[1]++;
						return true;
					}
					y--;
				}while(board[y][x] != ' ' && y >= 1);
			}
			return false;
		}
	}
	
	public boolean checkDown(int x, int y, boolean isWhite, char[][]board)
	{
		if(y == 7)
			return false;
		if(isWhite)
		{
			if(board[y+1][x] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y+1][x] == 'W')
					{
						valid[2]++;
						return true;
					}
					y++;
				}while(board[y][x] != ' ' && y <= 6);
			}
			return false;
		}
		else
		{
			if(board[y+1][x] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y+1][x] == 'B')
					{
						valid[2]++;
						return true;
					}
					y++;
				}while(board[y][x] != ' ' && y <= 6);
			}
			return false;
		}
	}
	
	public boolean checkLeft(int x, int y, boolean isWhite, char[][]board)
	{
		if(x == 0)
			return false;
		if(isWhite)
		{
			if(board[y][x-1] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y][x-1] == 'W')
					{
						valid[3]++;
						return true;
					}
					x--;
				}while(board[y][x] != ' ' && x >= 1);
			}
			return false;
		}
		else
		{
			if(board[y][x-1] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y][x-1] == 'B')
					{
						valid[3]++;
						return true;
					}
					x--;
				}while(board[y][x] != ' ' && x >= 1);
			}
			return false;
		}
	}
	
	public boolean checkRight(int x, int y, boolean isWhite, char[][]board)
	{
		if(x == 7)
			return false;
		if(isWhite)
		{
			if(board[y][x+1] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y][x+1] == 'W')
					{
						valid[4]++;
						return true;
					}
					x++;
				}while(board[y][x] != ' ' && x <= 6);
			}
			return false;
		}
		else
		{
			if(board[y][x+1] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y][x+1] == 'B')
					{
						valid[4]++;
						return true;
					}
					x++;
				}while(board[y][x] != ' ' && x <= 6);
			}
			return false;
		}
	}
	
	public boolean checkUL(int x, int y, boolean isWhite, char[][]board)
	{
		if(x == 0 || y == 0)
			return false;
		if(isWhite)
		{
			if(board[y-1][x-1] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y-1][x-1] == 'W')
					{
						valid[6]++;
						return true;
					}
					x--;y--;
				}while(board[y][x] != ' ' && x >= 1 && y >= 1);
			}
			return false;
		}
		else
		{
			if(board[y-1][x-1] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y-1][x-1] == 'B')
					{
						valid[6]++;
						return true;
					}
					x--;y--;
				}while(board[y][x] != ' ' && x >= 1 && y >= 1);
			}
			return false;
		}
	}
	
	public boolean checkUR(int x, int y, boolean isWhite, char[][]board)
	{
		if(x == 7 || y == 0)
			return false;
		if(isWhite)
		{
			if(board[y-1][x+1] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y-1][x+1] == 'W')
					{
						valid[5]++;
						return true;
					}
					x++;y--;
				}while(board[y][x] != ' ' && x <= 6 && y >= 1);
			}
			return false;
		}
		else
		{
			if(board[y-1][x+1] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y-1][x+1] == 'B')
					{
						valid[5]++;
						return true;
					}
					x++;y--;
				}while(board[y][x] != ' ' && x <= 6 && y >= 1);
			}
			return false;
		}
	}
	
	public boolean checkDR(int x, int y, boolean isWhite, char[][]board)
	{
		if(x == 7 || y == 7)
			return false;
		if(isWhite)
		{
			if(board[y+1][x+1] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y+1][x+1] == 'W')
					{
						valid[7]++;
						return true;
					}
					x++;y++;
				}while(board[y][x] != ' ' && x <= 6 && y <= 6);
			}
			return false;
		}
		else
		{
			if(board[y+1][x+1] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y+1][x+1] == 'B')
					{
						valid[7]++;
						return true;
					}
					x++;y++;
				}while(board[y][x] != ' ' && x <= 6 && y <= 6);
			}
			return false;
		}
	}
	
	public boolean checkDL(int x, int y, boolean isWhite, char[][]board)
	{
		if(x == 0 || y == 7)
			return false;
		if(isWhite)
		{
			if(board[y+1][x-1] != 'B')
				return false;
			else
			{
				do
				{
					if(board[y+1][x-1] == 'W')
					{
						valid[8]++;
						return true;
					}
					x--;y++;
				}while(board[y][x] != ' ' && x >= 1 && y <= 6);
			}
			return false;
		}
		else
		{
			if(board[y+1][x-1] != 'W')
				return false;
			else
			{
				do
				{
					if(board[y+1][x-1] == 'B')
					{
						valid[8]++;
						return true;
					}
					x--;y++;
				}while(board[y][x] != ' ' && x >= 1 && y <= 6);
			}
			return false;
		}
	}
	
	public void generateBoard(char[][]board)
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				board[i][j] = ' ';
			}
		}
		board[3][3] = 'W';
		board[3][4] = 'B';
		board[4][3] = 'B';
		board[4][4] = 'W';
	}
	
	public void viewBoard(char[][]board)
	{
		System.out.println("  1 2 3 4 5 6 7 8");
		for(int i = 0; i < 8; i++)
		{
			System.out.print((i+1));
			for(int j = 0; j < 8; j++)
			{
				System.out.print("|" + board[i][j]);
				if(j == 7)
					System.out.print("|");
			}
			System.out.println("");
		}
	}
	
	public void countBoard(char[][]board)
	{
		black = white = 0;
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(board[i][j] == 'W')
					white++;
				else if(board[i][j] == 'B')
					black++;	
			}
		}
	}
	
	public boolean checkBound(int x, int y)
	{
		if(x < 1 || x > 8 || y < 1 || y > 8)
			return false;
		return true;
	}
	
	public boolean checkValid(int x, int y, boolean isWhite, char[][]board)
	{
		boolean cek1 = checkUp(x-1,y-1,isWhite,board);
		boolean cek2 = checkDown(x-1,y-1,isWhite,board);
		boolean cek3 = checkLeft(x-1,y-1,isWhite,board);
		boolean cek4 = checkRight(x-1,y-1,isWhite,board);
		boolean cek5 = checkUR(x-1,y-1,isWhite,board);
		boolean cek6 = checkUL(x-1,y-1,isWhite,board);
		boolean cek7 = checkDR(x-1,y-1,isWhite,board);
		boolean cek8 = checkDL(x-1,y-1,isWhite,board);
		boolean cek9 = checkSpot(x-1,y-1,board);
		
		return (cek1 || cek2 || cek3  || cek4 || cek5 || cek6|| cek7 || cek8) && cek9;
	}
	
	public boolean checkSpot(int x, int y, char[][]board)
	{
		if(board[y][x] != ' ')
			return false;
		else
			return true;
	}
	
	public void place(int x, int y, boolean isWhite, char[][]board)
	{
		if(isWhite)
			board[y-1][x-1] = 'W';
		else if(!isWhite)
			board[y-1][x-1] = 'B';
	}
	
	public boolean movesLeft(boolean isWhite, char[][]board)
	{
		if(isWhite)
		{
			for(int i = 1; i <= 8; i++)
			{
				for(int j = 1; j <= 8; j++)
				{
					if(checkValid(j,i,true,board))
						return true;
				}
			}
		}
		else
		{
			for(int i = 1; i <= 8; i++)
			{
				for(int j = 1; j <= 8; j++)
				{
					if(checkValid(j,i,false,board))
						return true;
				}
			}
		}
		return false;
	}
	
	public void allPossibleMoves(boolean isWhite, int depth, char[][]board)
	{
		size[depth] = 0;
		if(isWhite)
		{
			for(int i = 1; i <= 8; i++)
			{
				for(int j = 1; j <= 8; j++)
				{
					if(checkValid(j,i,true,board))
					{
						px[depth][size[depth]] = i;
						py[depth][size[depth]] = j;
						size[depth]++;
					}
				}
			}
		}
		else
		{
			for(int i = 1; i <= 8; i++)
			{
				for(int j = 1; j <= 8; j++)
				{
					if(checkValid(j,i,false,board))
					{
						px[depth][size[depth]] = i;
						py[depth][size[depth]] = j;
						size[depth]++;
					}
				}
			}
		}
		for(int i = 1; i < 9; i++)
			valid[i] = 0;
	}
	
	public void clone(char[][]board, char[][]board2)
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				board2[i][j] = board[i][j];
			}
		}
	}
	
	public void cloneT(char[][]board, char[][][]board2, int depth)
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				board2[depth][i][j] = board[i][j];
			}
		}
	}
	
	public void changeBack(char[][]board, char[][][]board2, int depth)
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				board[i][j] = board2[depth][i][j];
			}
		}
	}
	
	public int max(int a, int b)
	{
		return a > b ? a : b;
	}
	
	public int min(int a, int b)
	{
		return a < b ? a : b;
	}
	
	public int heuristicVal(char[][]board)
	{
		int count1 = 0;
		int count2 = 0;
		int value = 0;
		
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(board[i][j] == 'W')
					count1++;
				else if(board[i][j] == 'B')
					count2++;	
			}
		}
		value = count2 - count1;
		return value;
	}
	
	public int bestMove(int alpha, int beta, int depth, boolean isWhite, char[][]board)
	{
		int bestVal = 0;
		
		if(depth == 3)
		{
			int a = heuristicVal(board);
			changeBack(board,temp,depth-1);
			return a;
		}
		
		if(isWhite) //minimizer
		{
			bestVal = Integer.MAX_VALUE;
			cloneT(board,temp,depth);
			allPossibleMoves(true,depth,board);
			
			for(int i = 0; i < size[depth]; i++)
			{
				place(py[depth][i],px[depth][i],true,board);
				checkValid(py[depth][i],px[depth][i],true,board);
				changeBoard(py[depth][i],px[depth][i],true,board,false);
				int val = bestMove(alpha,beta,(depth+1),false,board);

				bestVal = min(bestVal, val);
				beta = min(bestVal,alpha);
				if(alpha >= beta)	
					break;		
			}
			if(depth == 1)
			{
				possible[jp] = bestVal;
				jp++;
			}
			int dsa = bestVal;
			if(depth != 0)
			{
				changeBack(board,temp,depth-1);
				return dsa;
			}
		}
		else if(!isWhite) //maximizer
		{
			bestVal = Integer.MIN_VALUE;
			cloneT(board,temp,depth);
			allPossibleMoves(false,depth,board);
			
			for(int i = 0; i < size[depth]; i++)
			{
				place(py[depth][i],px[depth][i],false,board);
				checkValid(py[depth][i],px[depth][i],false,board);
				changeBoard(py[depth][i],px[depth][i],false,board,false);
				int val = bestMove(alpha,beta,(depth+1),true,board);
				bestVal = max(bestVal, val);
				alpha = max(bestVal,alpha);
				if(alpha >= beta)
					break;
			}
			int dsa = bestVal;
			if(depth != 0)
			{
				changeBack(board,temp,depth-1);
				return dsa;
			}
		}
		return bestVal;
	}
	
	public boolean boardIsFull(char[][] board)
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(board[j][i] == ' ')
					return false;
			}
		}
		return true;
	}
	
	public void enemyTurn(boolean isWhite, char[][]board, char[][]board2)
	{
		boolean move = movesLeft(false,board);
		int xd = Integer.MIN_VALUE;
		for(int i = 1; i < 9; i++)
			valid[i] = 0;
		if(move)
		{
			int findmax = Integer.MIN_VALUE;
			clone(board,board2);
			bestMove(Integer.MIN_VALUE,Integer.MAX_VALUE,0,false,board2);
			for(int i = 0; i < jp; i++)
			{
				System.out.printf("X : %d Y : %d\n", py[0][i], px[0][i]);
			}
			System.out.println(jp);
			for(int i = 0; i < jp; i++)
			{
				if(xd < possible[i])
				{
					xd = possible[i];
					findmax = i;
				}
			}
			jp = 0;
			System.out.println(findmax);
			place(py[0][findmax],px[0][findmax],false,board);
			checkValid(py[0][findmax],px[0][findmax],false,board);
			changeBoard(py[0][findmax],px[0][findmax],false,board,true);
			win = 0;
		}
		else if(!move)
		{
			System.out.println("Enemy cannot move this turn");
			win++;
		}
	}
	
	public void play(char[][] board, char[][]board2)
	{
		int x = 0;
		int y = 0;
		int win = 0;
		boolean checkB = false;
		boolean checkV = false;
		boolean move = false;
		boolean isFull = false;
		do
		{
			do
			{
				cls();
				viewBoard(board);
				countBoard(board);
				System.out.println("White : " + white);
				System.out.println("Black : " + black);
				System.out.println("White's turn");
				
				move = movesLeft(true,board);
				for(int i = 1; i < 9; i++)
					valid[i] = 0;
				if(move)
				{
					System.out.print("Input[x y]: ");
					x = scan.nextInt();
					y = scan.nextInt();
					scan.nextLine();
					
					checkB = checkBound(x,y);
					if(!checkB)
					{
						System.out.println("You cannot pass the map");
						System.out.print("Press enter to continue...");
						scan.nextLine();
						continue;
					}
					checkV = checkValid(x,y,true,board);

					if(!checkV)
					{
						System.out.println("Your move is invalid");
						System.out.print("Press enter to continue...");
						scan.nextLine();
					}
					win = 0;
				}
				else if(!move)
				{
					System.out.println("You cannot move this turn...");
					win++;
					break;
				}
			}while(checkB == false || checkV == false);
			
			place(x,y,true,board);
			changeBoard(x,y,true,board,true);
	
			System.out.println("Black's turn");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
			enemyTurn(false,board,board2);
			
			isFull = boardIsFull(board);			
			if(isFull || win == 2)
				break;
		}while(win != 2);
		
		countBoard(board);
		if(white > black)
			System.out.println("White wins the game");
		else if(black > white)
			System.out.println("Black wins the game");
		else if(black == white)
			System.out.println("DRAW");
	}
	

	public MainClass()
	{
		int choice = 0;
		char[][] board = new char[10][10];
		char[][] board2 = new char[10][10];
		generateBoard(board);
		do
		{
			do
			{
				cls();
				menu();
				choice = scan.nextInt();
				scan.nextLine();
			}while(choice < 1 | choice > 4);
			
			switch(choice)
			{
				case 1:
					play(board,board2);
					win = 2;
					break;
				case 2:
					break;
				case 3:
					cls();
					about();
					break;
				case 4:
					out();
					break;
			}
		}while(win != 2 && choice != 4);
	}

	public static void main(String[] args)
	{
		new MainClass();
	}
}
