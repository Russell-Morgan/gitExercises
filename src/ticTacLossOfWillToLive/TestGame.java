package ticTacLossOfWillToLive;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestGame {
	
	@Test
	public void testInput() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream newStream = new PrintStream(outContent);
		final PrintStream old = System.out;
		System.setOut(newStream);
		String outOfBounds ="invalid input. Please try again\n";
		String spotTaken = "That spot's taken! Choose an empty square";
		
		Game.input(1, 3, 'x');
		
		// check that when x is out of bounds, error is displayed
		assertEquals(outOfBounds, outContent.toString());
		System.out.flush();
		System.setOut(old);
		
	}

}
