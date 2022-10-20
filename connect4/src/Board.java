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

<<<<<<< HEAD
	boolean isEmpty (Coordinate coordinate){
		return this.getColor(coordinate) == Color.NULL;
=======
	void putToken(Coordinate coordinate, Color color){
		assert !(coordinate == null);

		this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
	}
	boolean isOcuppied (Coordinate coordinate, Color color){
		return this.getColor(coordinate) == color;
	}

	boolean isEmpty (Coordinate coordinate){
		return this.isOcuppied(coordinate, Color.NULL);
	}

	boolean checkPos(Color color){
		
		while()
>>>>>>> 892a3f15232c839b640b97c3cc0770853c992f57
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
