package ds.binary_search;

public class BinarySearch
{
	public static void main( String[] args )
	{
		int arr[] = new int[] {-2, 4, 5, 6, 8, 10};
		//look in the above array, for all numbers between -5 and 9 (inclusive) and if they exist, print their index.
		for( int toFind = -5; toFind <10; toFind++) {
			int p = binarySearch(0, arr.length-1, arr, toFind);
			System.out.println(toFind +": " +  ((p != -1) ? (" exists at index " + p) : " does not exist in the array"));
		}
			
		
	}
	
	static int binarySearch(int low, int high, int[] arr, int toFind) {
		// if the left loop iterator moved ahead of the right pointer, it means we are checking outside the fragment of the array we need to
		// so we terminate the iteration
		if(low > high )
			return -1;
		
		int middle = low + (high - low)/2 ;
		
		if(arr[middle] == toFind)
			return middle;
		
		// if the number to find is smaller than the number in the middle, we apply binary search to the left half of the array
		if(toFind < arr[middle]) {
			return binarySearch(low, middle - 1, arr, toFind);
		}
		// else we apply binary search to the right half of the array
		return binarySearch(middle+ 1, high, arr, toFind);
	}
}