import java.util.ArrayList;
import java.util.Scanner;

public class sortingRun
	{

		public static void main(String[] args)
			{
				insertionSort.insertionSort(null);
				mergeSort.merge(null, 0, 0, 0, null);
				quickSort.qsort(null);
				selectionSort.selectionSort(null);
				
				userChoice();
				System.out.println();
			}
		
		public static void userChoice()
			{
				Scanner numberOfRuns = new Scanner(System.in);
				System.out.println("How many times would you like the simulation to run?");
				int runs = numberOfRuns.nextInt();
				
				Scanner numberOfIntegers = new Scanner(System.in);
				System.out.println("How many times would you like the simulation to run?");
				int nums = numberOfIntegers.nextInt();
				
				
				for(int i = 0; i < nums; i++)
					{
						int randomNums = (int) (Math.random()*88) + 10;
						int line = randomNums;
				        int [] newArray = line.split(" "); // taking numbers and putting them into the array
				        
				        ArrayList<String> uniqueNums = new ArrayList<String>();
					}
			}

	}
