package ticTacLossOfWillToLive;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestGame {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}
	@Test
	public void testInput() {
		String outOfBounds ="invalid input. Please try again";
		String spotTaken = "That spot's taken! Choose an empty square";
		
		Game.input(1, 3, 'x');
		
		// check that when x is out of bounds, error is displayed
		assertEquals(outOfBounds, outContent.toString());
		
	}

}
