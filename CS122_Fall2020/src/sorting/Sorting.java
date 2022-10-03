package sorting;

import java.util.Arrays;

import heap.Heap;

public class Sorting 
{
	
	private static void swap(int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static int getIndexOfSmallest(int[] arr, int first, int last)
	{
		int smallest = first;
		for(int n = first; n < last; n++)
			if(arr[n] < arr[smallest])
				smallest = n;
		return smallest;
	}
	
	private static void insertInOrder(int value, int[] arr, int end)
	{
		int i = end;
		while(i >= 0 && value < arr[i])
		{
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = value;
	}
	
	private static int partitionIndex(int[] arr, int left, int right)
	{
		int pivotValue = right/2;
		int low = left + 1;
		int high = right; 
		return -1;
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = arr.length; i > 0; i--)
			for(int j = 0; j < arr.length - 1; j++)
				if(arr[j] < arr[j+1])
					swap(arr, j, j + 1);
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			int indexOfSmallest = getIndexOfSmallest(arr, i, arr.length);
			if(indexOfSmallest != i)
				swap(arr, i, indexOfSmallest);
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int next = arr[i];
			insertInOrder(next, arr, i-1);
		}
	}
	
	public static void heapSort(int[] arr)
	{
		Heap<Integer> h = new Heap<Integer>();
	}
	
	public static void quickSort(int[] arr, int first, int last)
	{
		if(last - first > 15) //first < last)
		{
			int pivot = partitionIndex(arr, first, last);
			quickSort(arr, first, pivot - 1);
			quickSort(arr, pivot + 1, last);
		}
		else
			insertionSort(arr);
	}
	

	public static void main(String[] args)
	{
		int[] arr = {15, 2, 87, 100, 54, 77, 9, 11, 52, 1, 60, 99, 12, 28, 33};
		
		/*bubbleSort(arr);
		System.out.println("Bubble Sort: " + Arrays.toString(arr));
		System.out.println();
		
		selectionSort(arr);
		System.out.println("Selection Sort: " + Arrays.toString(arr));
		System.out.println();*/
		
		insertionSort(arr);
		System.out.println("Insertion Sort: " + Arrays.toString(arr));
		System.out.println();

	}

}
