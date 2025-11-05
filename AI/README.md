# Tic Tac Toe

## Tic Tac Toe is a simple 2-player game that is played on a 3x3 grid. Players take turns placing their mark ("X" or "O") in an empty spot on the grid. The goal is to get three of your marks in a row—either horizontally, vertically, or diagonally—before your opponent does. If the board fills up and no player has won, the game ends in a draw.

### Algorithm for Tic Tac Toe:

1. **Initialize Board**:
   * Create a 3x3 grid and fill it with empty spaces.
2. **Set Players**:
   * Player X starts first, followed by Player O.
3. **Game Loop** (Repeat until game ends):
   * Display the current board.
   * Prompt the current player to input a valid move (row, column).
     * Check if the move is valid (within bounds and not occupied).
   * Place the player's symbol ('X' or 'O') on the board.
   * Check for a win condition:
     * If a player has 3 marks in a row (horizontally, vertically, or diagonally), declare the player as the winner.
   * If no winner and all 9 moves are made, declare a draw.
   * Switch to the other player.
4. **End Game**:
   * If a player wins, announce the winner.
   * If no winner and the board is full, announce a draw.

