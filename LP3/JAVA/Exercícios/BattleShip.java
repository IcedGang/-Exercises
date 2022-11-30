import java.util.Scanner;

class Battleship {

    public static int size = 5;
    
    public static void main(String[] args) {
        
        char[][] player1board = new char[size][size];
        char[][] player1locationboard = new char[size][size];

        char[][] player2board = new char[size][size];
        char[][] player2locationboard = new char[size][size];

        Initialazing(player1board, player2board, player1locationboard, player2locationboard);

        int turnplayer = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Battleship!!!");
        System.out.println();

        PlaceShip(input, player1board, turnplayer);
        turnplayer = 2;
        
        PlaceShip(input, player2board, turnplayer);
        turnplayer = 1;

        //Control Player 1's turn
        while(turnplayer == 1){
            player1locationboard = GetAttackCoordinates(input,player2board, player1locationboard, turnplayer, turnplayer + 1);
            ShowBoard(player1locationboard);
            
            if(WinnerVerification(player1locationboard, turnplayer) == 1){
                EndScreen(player1locationboard, player2locationboard);
                return;
            }
            turnplayer = 2;

            //Control Player 2's turn
            while(turnplayer == 2){
                player2locationboard = GetAttackCoordinates(input, player1board, player2locationboard, turnplayer, turnplayer - 1);
                ShowBoard(player2locationboard);

                if(WinnerVerification(player2locationboard, turnplayer) == 1){
                    EndScreen(player1locationboard, player2locationboard);
                    return;
                }
                turnplayer = 1;

            }

        }

        System.out.println("Thanks for playing!!");
        input.close();
    }

    public static void PlaceShip(Scanner input, char[][] board, int player){
        board = GetShipCoordinates(input, board, player);
        ShowBoard(board);
    }

    public static void Initialazing(char[][] board1, char[][] board2, char[][] board3, char[][] board4){
        FillBoard(board1);
        FillBoard(board2);
        FillBoard(board3);
        FillBoard(board4);
    }

    public static void ShowBoard(char[][] board){
        System.out.println();
        System.out.print("  ");
        for(int count = 0; count < board.length; count++){
            System.out.print(" " + count);
        }
        System.out.println();

        for(int i = 0; i < board.length; i++){
            System.out.print(i + "  ");
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

    }

    public static void FillBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '-';

            }
        }

    }

    public static char[][] GetShipCoordinates(Scanner input, char[][] board, int player){
        int row, column;
        System.out.println("Player " + player + ", Enter your ships' coordinates.");
        for(int count = 1; count <= board.length; count++){
            System.out.printf("Enter ship %d location:", count);
            System.out.println();
            row = input.nextInt();
            column = input.nextInt();

            if(CheckBoardPosition(board, row, column) == 1){
                System.out.println("Invalid coordinates. Choose different coordinates.");
                count -= 1;
                continue;
            }


            if(CheckBoardPosition(board, row, column) == 2){
                System.out.println("You already have a ship there. Choose different coordinates.");
                count -= 1;
                continue;
            }

            board[row][column] = '@';

        }

        return board;

    }

    public static char[][] GetAttackCoordinates(Scanner input, char[][] board, char[][] locateboard, int attackingplayer, int defenderplayer){
        int row, column;
        
        for(int count = 0; count < 1; count++){
            System.out.printf("Player %d, enter hit row/column:", attackingplayer);
            System.out.println();
            row = input.nextInt();
            column = input.nextInt();

            boolean bool = CheckBoardPosition(locateboard, row, column) == 3 || CheckBoardPosition(locateboard, row, column) == 5;

            if(CheckBoardPosition(locateboard, row, column) == 1){
                System.out.println("Invalid coordinates. Choose different coordinates.");
                count -= 1;
                continue;
            }

            if(bool){
                System.out.println("You already fired on this spot. Choose different coordinates.");
                count -= 1;
                continue;
            }

            locateboard = HitMarker(board, locateboard, row, column, attackingplayer, defenderplayer);

        }

        return locateboard;

    }

    public static int CheckBoardPosition(char[][] board, int row, int column){
        boolean bool1 = row >= board.length || row < 0;
        boolean bool2 = column >= board.length || row < 0;
        
        if(bool1 || bool2)
            return 1;
        
        if(board[row][column] == '@')
            return 2;
        
        if(board[row][column] == 'X')
            return 3;

        if(board[row][column] == '-')
            return 4;
            
        if(board[row][column] == 'O')
            return 5;

        return 0;
    }

    public static char[][] HitMarker(char[][] board, char[][] locateboard, int row, int column, int attackingplayer, int defenderplayer){
        
        if(CheckBoardPosition(board, row, column) == 2){
            locateboard[row][column] = 'X';
            System.out.printf("Player %d hit Player %d's Ship!!!", attackingplayer, defenderplayer);
            return locateboard;
        }
        
        if(CheckBoardPosition(board, row, column) == 4){
            locateboard[row][column] = 'O';
            System.out.printf("Player %d MISSED!", attackingplayer);
            return locateboard;
        }
        
        return locateboard;

    }

    public static int WinnerVerification(char[][] board, int player){
        int count = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){

                if(CheckBoardPosition(board, i, j) == 3)
                    count++;

            }
        }

        if(count == board.length){
            System.out.println("Player " + player + "WINS! You sunk all of your opponent's ships!");
            return 1;
        }
        return 0;

    }

    public static void EndScreen(char[][] locationboard1, char[][]locationboard2){
        ShowBoard(locationboard2);
        ShowBoard(locationboard1);
    }

}