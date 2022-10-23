import java.util.ArrayList;
import java.util.List;

public class Board {
    private Color[][] colors;

    public Board(){
		this.colors = new Color[Coordinate.ROW][Coordinate.COLUMN];
    }

    public void reset() {
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

	public void putToken(Coordinate coordinate, Color color){
		assert !(coordinate == null);

		this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
	}
	boolean isOcuppied (Coordinate coordinate, Color color){
		return this.getColor(coordinate) == color;
	}

	boolean isEmpty (Coordinate coordinate){
		return this.isOcuppied(coordinate, Color.NULL);
	}
	

	private int checkPos(int column){
		int filaComprobacion=0;
		Coordinate coordinate= new Coordinate(filaComprobacion,column);

		while(!this.isEmpty(coordinate) || filaComprobacion != Coordinate.ROW){
			filaComprobacion++;
		}
		if (filaComprobacion == Coordinate.ROW){
			return -1;
		}else{
			return filaComprobacion
		}
	}

	public boolean boardFull(){
		int columnaComprobacion=0;
		while (this.checkColumn(columnaComprobacion)==-1){
			columnaComprobacion++;
		}
		return Coordinate.COLUMN==columnaComprobacion;
	}

    public void write() {
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
