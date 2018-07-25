# binary-search-recursive

```
  // high should be array length - 1
  static int binarySearch(int low, int high, int[] arr, int toFind) {
		// if the left loop iterator moved ahead of the right pointer, it means we are checking outside the fragment of the array we need to
		// so we terminate the iteration
		/* not required in recursive approach
		if(low > high )
			return -1;
		*/
		
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
  
```
