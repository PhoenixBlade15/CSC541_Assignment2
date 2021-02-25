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
		
		int[] inputArray = {21, 20, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11};
		int expectedOutcome = 20;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void searchForSecondLargestTest2() {
		TournamentSearch ts = new TournamentSearch();
		
		int[] inputArray = {21, 20, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11};
		int expectedOutcome = 20;
		
		int outcome = ts.searchForSecondLargestHelper( inputArray );
		assertEquals(expectedOutcome, outcome);
	}

}
