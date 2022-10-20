import java.util.ArrayList;
import java.util.List;

 
 public class Player {

    private Color color;
    private Board board;
    private int putTokens;

    Player(Color color, Board board){
        assert !color.isNull();
        assert board != null;

        this.color = color;
        this.board = board;
        this.putTokens = 0;
    }



}
