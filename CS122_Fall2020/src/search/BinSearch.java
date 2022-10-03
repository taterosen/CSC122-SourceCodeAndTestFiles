package search;

/**
 * Create a method that conducts a binary search.
 * @author taterosen
 * 10/14/2020
 */

public class BinSearch<Element> 
{
	public static void main(String[] args)
	{
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i + i;  //arr consists of even integers from 0 - 38 (inclusive)
		}
		
		int keyIndex = binSearch(arr, 0);
		if(keyIndex >= 0)
			System.out.println(keyIndex);
		else
			System.out.println("Not found");
		
		keyIndex = binSearch(arr, 1);
		if(keyIndex >= 0)
			System.out.println(keyIndex);
		else
			System.out.println("Not found");
		
	}

	/**
	 * Conducts a binary search for a given key integer.
	 * @param arr
	 * @param key
	 * @return the index of the key; -1 if not found
	 */
	public static int binSearch(int[] arr, int key)
	{
		//return binSearch(arr, key, 0, arr.length - 1);
		
		int index = -1;
		int left = 0;
		int right = arr.length - 1;
		int middle;
		while(index < 0 && left <= right)
		{
			middle = (left + right)/2;
			if(arr[middle] == key)
				index = middle;
			else if(key > arr[middle])
				left = middle + 1;
			else
				right = middle - 1;
		}

		return index;
	}

}
