import java.util.ArrayList;
import java.util.List;

public class Board {
    private Color[][] colors;

    Board(){
        this.colors = new Color[Coordinate.ROW][Coordinate.COLUMN];
    }

    void reset() {
        for(int i= 0; i < Coordinate.ROW; i++){
            for(int j = 0; j < Coordinate.COLUMN; j++){
                this.colors[i][j] = Color.NULL;
            }
        }
    }

    private Color getColor(Coordinate coordinate) {
		assert this.colors[coordinate.getRow()][coordinate.getColumn()] != Color.NULL;
		return this.colors[coordinate.getRow()][coordinate.getColumn()];
	}

	boolean isEmpty (Coordinate coordinate){
		return this.getColor(coordinate) == Color.NULL;
	}


    void write() {
		Message.HORIZONTAL_LINE.writeln();
		for (int i = 0; i < Coordinate.ROW; i++) {
			Message.VERTICAL_LINE.write();
			for (int j = 0; j < Coordinate.COLUMN; j++) {
				this.getColor(new Coordinate(i, j)).write();
				Message.VERTICAL_LINE.write();
			}
			Console.getInstance().writeln();
		}
		Message.HORIZONTAL_LINE.writeln();
	}
}
