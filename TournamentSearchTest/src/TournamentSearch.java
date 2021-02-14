public class TournamentSearch {
	

	// Find the second largest number in the array given using the tournament sort method
	public int searchForSecondLargest(int[] numArray) {
		
		// Gets the length of the array 
		int arrayLength = numArray.length;
		System.out.println(arrayLength);
		
		for ( int i = 0; i < arrayLength; i++ ) {
			System.out.print(" " + numArray[i] +  " ");
		}
		System.out.println();
		
		// Checks for arrays of length 3
		if ( arrayLength == 3 ) {
			int out = middle( numArray );
			return out;
		}
		
		// Checks to see if array is 2 then gets the min of the two and returns it
		if (arrayLength == 2) {
			return Math.min(numArray[0], numArray[1]);
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
			
			// Trys to compare i and i+1 to each other to put the max in new array
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
	
	// Gets the number that isn't smallest nor largest
	public int middle(int[] numArray) {
		
		// Gets the largest of the numbers
		int largest = Math.max( Math.max(numArray[0], numArray[1]), Math.max(numArray[1], numArray[2]) );
		int tempLargest = Math.min(numArray[0], numArray[1]);
		
		for ( int i = 0; i < numArray.length; i++) {
			
			if ( numArray[i] != largest ) {
				if ( tempLargest < numArray[i] ) {
					tempLargest = numArray[i];
				}
			}
		}
		return tempLargest;
	}
	
}