package GameOfLifeTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeClassTest {

	@Test
	public void aliveOrDead() {
		//assertEquals(true, GameOfLifeClass.aliveOrDead(true, 1));
		//first make the test fail
		assertEquals(false, GameOfLifeClass.aliveOrDead(true, 0));
		//if a live cell with 0 or 1 live will die
	}
	
	@Test
	public void aliveOrDead2() {
		assertEquals(false, GameOfLifeClass.aliveOrDead(true, 1));
	}
	
	//If you have 2 or 3 neighbors then you stay alive
	@Test
	public void aliveOrDead3() {
		assertEquals(true, GameOfLifeClass.aliveOrDead(true, 2));
	}
	@Test
	public void aliveOrDead4() {
		assertEquals(true, GameOfLifeClass.aliveOrDead(true, 3));
	}
	
	// Greater than 3 neighbors then you will die
	@Test
	public void aliveOrDead5() {
		assertEquals(false, GameOfLifeClass.aliveOrDead(true, 4));
	}
	
	//if dead and has exactly 3 neighbors than you become alive
	
	@Test
	public void aliveOrDead6() {
		assertEquals(true, GameOfLifeClass.aliveOrDead(true, 3));
	}
	
	@Test
	public void aliveOrDead7() {
		assertEquals(false, GameOfLifeClass.aliveOrDead(true, 4));
	}
	
}
