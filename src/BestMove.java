public class BestMove {

    public Boolean isMovesLeft(char board[][])
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '_')
                    return true;
        return false;
    }

    public  int evaluate(char b[][])
    {



        for (int row = 0; row < 3; row++)
        {
            if (b[row][0] == b[row][1] &&
                    b[row][1] == b[row][2])
            {
                if (b[row][0] == 'o')
                    return +10;
                else if (b[row][0] == 'x')
                    return -10;
            }
        }


        for (int col = 0; col < 3; col++)
        {
            if (b[0][col] == b[1][col] &&
                    b[1][col] == b[2][col])
            {
                if (b[0][col] == 'o')
                    return +10;

                else if (b[0][col] == 'x')
                    return -10;
            }
        }


        if (b[0][0] == b[1][1] && b[1][1] == b[2][2])
        {
            if (b[0][0] == 'o')
                return +10;
            else if (b[0][0] == 'x')
                return -10;
        }

        if (b[0][2] == b[1][1] && b[1][1] == b[2][0])
        {
            if (b[0][2] == 'o')
                return +10;
            else if (b[0][2] == 'x')
                return -10;
        }


        return 0;
    }

    public int minimax(char board[][], int depth, Boolean isMax)
    {
        int score = evaluate(board);


        if (score == 10)
            return score;


        if (score == -10)
            return score;


        if (isMovesLeft(board) == false)
            return 0;


        if (isMax)
        {
            int best = -1000;


            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {

                    if (board[i][j]=='_')
                    {

                        board[i][j] = 'o';


                        best = Math.max(best, minimax(board,
                                depth + 1, !isMax));

                        // Undo the move
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }


        else
        {
            int best = 1000;


            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {

                    if (board[i][j] == '_')
                    {

                        board[i][j] = 'x';


                        best = Math.min(best, minimax(board,
                                depth + 1, !isMax));

                        // Undo the move
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }
    }


    public Move findBestMove(char board[][])
    {
        int bestVal = -1000;
        Move bestMove = new Move();
        bestMove.setRow(-1);
        bestMove.setCol(-1);


        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                if (board[i][j] == '_')
                {

                    board[i][j] = 'o';


                    int moveVal = minimax(board, 0, false);


                    board[i][j] = '_';


                    if (moveVal > bestVal)
                    {
                        bestMove.setRow(i);
                        bestMove.setCol(j);
                        bestVal = moveVal;
                    }
                }
            }
        }


        return bestMove;
    }


}
