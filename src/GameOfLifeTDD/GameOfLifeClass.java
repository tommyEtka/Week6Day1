package GameOfLifeTDD;

public class GameOfLifeClass {

	public static boolean aliveOrDead(boolean alive, int neighbors) {
		if (alive == true) {

			if (neighbors == 0 || neighbors == 1) {
				return false;
			}
			if (neighbors == 2 || neighbors == 3) {
				return true;
			}

			if (neighbors > 3) {
				return false;
			}
			
		}else {
			if(neighbors ==3)
				return true;
		}
		return false;
	}

}

// alive = false;
// neighbors = 1;
// return alive;