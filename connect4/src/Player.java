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
    void putToken() {
         Coordinate coordinate;
         Error error;
         do {
             coordinate = this.getCoordinate(Message.ENTER_COORDINATE_TO_PUT);
             error = this.getPutTokenError(coordinate);
         } while (!error.isNull());
         this.board.putToken(coordinate, this.color);
         this.putTokens++;
     }
     private Error getPutTokenError(Coordinate coordinate) {
         assert coordinate != null;

         Error error = Error.NULL;
         if (!this.board.isEmpty(coordinate)) {
             error = Error.NOT_EMPTY;
         }
         error.writeln();
         return error;
     }
     Coordinate getCoordinate(Message message){
         assert message != null;

         Coordinate coordinate;
         coordinate.read(message.toString());
         return coordinate;
    }
     void writeWinner() {
         Message.PLAYER_WIN.writeln(this.color.name());
     }



}


// CAMBIO DE PRUEBA

// SEGUNDA PRUEBA