public class Connect4 {
    private Board board;
    private Turn turn;

    Connect4(){
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        Message.TITLE.writeln();
        this.board.write();
        do {
            this.turn.play();
            this.board.write();
        } while (!this.board.boardFull());
        this.turn.writeWinner();
    }


    private boolean isResumedGame() {
        boolean ok=false;
        Console console=new Console();
        String confirmation=new String();
        do {
            Message.RESUME.writeln();
            confirmation= console.readString();
            if (confirmation=="YES"||confirmation=="NO"){
                ok=true;
                return ok;
            }
        }while(!ok);
        if (confirmation=="YES"){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        new Connect4().play();
    }

}
