public class Turn {
    private Board board;
    static final int NUMBER_PLAYERS = 2;
    private Player[] players;
    private int activePlayer;

    Turn(Board board) {
        assert board != null;
        this.board = board;
        this.players = new Player[Turn.NUMBER_PLAYERS];
        this.reset();
    }

    void reset() {
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            this.players[i] = new Player(Color.get(i), this.board);
        }
        this.activePlayer = 0;
    }
    void play(){
        this.players[this.activePlayer].putToken();
        if (!this.board.boardFull()){
            this.activePlayer = (this.activePlayer+1) % Turn.NUMBER_PLAYERS;
        }
    }
    void writeWinner(){
        this.players[this.activePlayer].writeWinner();
    }
}
