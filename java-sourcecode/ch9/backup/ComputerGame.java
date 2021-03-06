public abstract class ComputerGame {   
    protected int nPlayers;
    protected int addedPlayers = 0;
    protected int whoseTurn;
    protected IPlayer player[];  // An array of players

    public ComputerGame() {
        nPlayers = 1;       // Default: 1 player game
        player = new IPlayer[1];
    }
    public ComputerGame(int n) {
        nPlayers = n;
        player = new IPlayer[n];
    }
    public void setPlayer(int starter)
    {   whoseTurn = starter;
    }
    public int getPlayer() {   
        return whoseTurn;
    }
    public void addPlayer(IPlayer p) {
        player[addedPlayers] = p;
        ++addedPlayers;
    }
    public void changePlayer() {
        whoseTurn = (whoseTurn + 1) % nPlayers;
    }
    public String getRules() {
        return "The rules of this game are: ";
    }
    public abstract boolean gameOver();
    public abstract String getWinner();
} //ComputerGame
