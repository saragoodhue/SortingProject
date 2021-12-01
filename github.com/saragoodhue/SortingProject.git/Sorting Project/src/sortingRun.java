import java.util.ArrayList;
import java.util.Scanner;

public class sortingRun
	{

		public static void main(String[] args)
			{
				userChoice();
				
			}
		
		public static void userChoice()
			{
				Scanner numberOfRuns = new Scanner(System.in);
				System.out.println("How many times would you like the simulation to run?");
				int runs = numberOfRuns.nextInt();
				
				Scanner numberOfIntegers = new Scanner(System.in);
				System.out.println("How many numbers do you want to be sorted?");
				int nums = numberOfIntegers.nextInt();
				
				int [] elements = new int [nums];
				
				for(int i = 0; i < nums; i++)
					{
						elements[i] = (int) (Math.random()*88) + 10;
					}
				
				
				double startTimeB = System.currentTimeMillis();
				for(int i = 0; i < runs; i++)
					{
						BubbleSort.bubbleSort(elements);
					}
				double endTimeB = System.currentTimeMillis();
				
				double startTimeI = System.currentTimeMillis();
				for(int i = 0; i < runs; i++)
					{
						InsertionSort.insertionSort(elements);
					}
				double endTimeI = System.currentTimeMillis();
				
				double startTimeM = System.currentTimeMillis();
				for(int i = 0; i < runs; i++)
					{
						//MergeSort.merge(elements, 0, nums/2, nums + 1, elements);
					}
				double endTimeM = System.currentTimeMillis();
				
				double startTimeQ = System.currentTimeMillis();
				for(int i = 0; i < runs; i++)
					{
						QuickSort.qsort(elements);
					}
				double endTimeQ = System.currentTimeMillis();
				
				double startTimeS = System.currentTimeMillis();
				for(int i = 0; i < runs; i++)
					{
						SelectionSort.selectionSort(elements);
					}
				double endTimeS = System.currentTimeMillis();
				
				
				System.out.println((endTimeB - startTimeB) / runs);
			}

	}
