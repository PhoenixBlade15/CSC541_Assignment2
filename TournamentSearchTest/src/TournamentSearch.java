public class TournamentSearch {
	
	public int searchForSecondLargestHelper(int[] numArray) {
		int largest = searchForSecondLargest(numArray);
		
		// Gets the length of the array 
		int arrayLength = numArray.length;
				
		// Checks if array is a single number returns itself
		if ( arrayLength == 1) {
			return numArray[0];
		}
		
		// Checks if the array is 0 or less and then returns -1
		if ( arrayLength <= 0 ) {
			return -1;
		}
		
		int[] newNumArray = new int[ numArray.length-1 ];
		
		int index = 0;
		int newIndex = 0;
		while ( index < numArray.length) {
			
			if ( numArray[index] != largest ) {
				newNumArray[newIndex] = numArray[index];
				newIndex++;
			} else {
				largest = largest + 1;
			}
			index++;
		}
		
		return searchForSecondLargest(newNumArray);
	}
	
	// Find the second largest number in the array given using the tournament sort method
	public int searchForSecondLargest(int[] numArray) {
		
		// Gets the length of the array 
		int arrayLength = numArray.length;
		
		// Checks to see if array is 2 then gets the min of the two and returns it
		if (arrayLength == 2) {
			return Math.max(numArray[0], numArray[1]);
		}
		
		// Checks if array is a single number returns itself
		if ( arrayLength == 1) {
			return numArray[0];
		}
		
		// Checks if the array is 0 or less and then returns -1
		if ( arrayLength <= 0 ) {
			return -1;
		}
		
		// Creates a new array half the size of the old one
		int[] newArray = new int[  (int) (Math.ceil( (double) (arrayLength)/2)) ];
		int arrayPosition = 0;
		
		// Runs through the array comparing every 2 numbers and putting the max into the new array
		for	( int i = 0; i < arrayLength; i = i + 2 ) {
			
			// Try to compare i and i+1 to each other to put the max in new array
			try {
				newArray[arrayPosition] = Math.max(numArray[i], numArray[i+1]);
				arrayPosition++;	
				
				// If i+1 is null then put i into the new array and break out of the loop
			} catch (Exception e) {
				newArray[arrayPosition] = numArray[arrayLength-1];
				break;
			}
		}
		
		// Recursively calls itself until the checks at the top of method returns
		return searchForSecondLargest(newArray);
	}
	
}