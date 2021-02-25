import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TounamentSearchTest {

	@Test
	void searchForSecondLargestTest() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {10, 4, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11};
		int expectedOutcome = 11;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void test2() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {21, 20, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11};
		int expectedOutcome = 20;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void testEmpty() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {};
		int expectedOutcome = -1;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void test1Number() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {21};
		int expectedOutcome = 21;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void test2Numbers() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {21, 20};
		int expectedOutcome = 20;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void testDuplicates() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {5, 5, 5, 5, 5, 5, 5, 5};
		int expectedOutcome = 5;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}

}