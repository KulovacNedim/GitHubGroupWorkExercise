
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	public void showMenu(Scanner sc) {

		System.out.println("\nChoose which task you want to demonstrate: \n");
		System.out.println("1) Write a method that returns a new array by eliminating \n"
				+ "the duplicate values in the array using the following method \n"
				+ "header: public static int[] eliminateDuplicates(int[] list)\n");
		System.out.println("2) Write the following method that returns true if the list is \n"
				+ "already sorted in increasing order. p\n" + "ublic static boolean isSorted(int[] list)\n");
		System.out.println("" + "3) Write a method that returns a sorted string using the following \n"
				+ "header: public static String sort(String s) \n" + "For example, sort(\"acb\") returns abc. \n");
		System.out.println("" + "4) Write a method that sums all the numbers in the major diagonal in \n"
				+ "an n * n matrix of double values using the following header: \n"
				+ "public static double sumMajorDiagonal(double[][] m) Write a test \n"
				+ "program that reads a 4-by-4 matrix and displays the sum of all its elements \n"
				+ "on the major diagonal. \n");
		System.out.println("5) Write a method that returns the sum of all the elements in a specified column \n"
				+ "in a matrix using the following header: \n"
				+ "public static double sumColumn(double[][] m, int columnIndex)\n");
		System.out.println("6) Write a method to sort a two-dimensional array using the following header: \n"
				+ "public static void sort(int m[][]) The method performs a primary sort on rows \n"
				+ "and a secondary sort on columns. \n");

		System.out.print("Enter your choice: ");
		int option = sc.nextInt();

		switch (option) {
		case 1:

			int[] list = new int[10];

			System.out.println("Enter 10 integers (separete them with space or enter key): ");
			
			for (int i = 0; i < list.length; i++) {
				list[i] = sc.nextInt();
			}

			System.out.print("Array with no duplicates is: ");

			int[] array = eliminateDuplicates(list);

			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0) {
					System.out.print(array[i] + " ");
				}
			}

			break;
		case 2:
			
			int[] newList = new int[10];

			System.out.println("Enter 10 integers (separete them with space or enter key): ");

			for (int i = 0; i < newList.length; i++) {
				newList[i] = sc.nextInt();
			}
			
			System.out.println("List you entered " + (isSorted(newList) ? "is" : "is not") + " already sorted.");
						
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		default:

			if (option < 1 || option > 6) {
				System.out.println("\nWrong input! Try again!");

				showMenu(sc);
			}
		}
	}

	public static int[] eliminateDuplicates(int[] list) {

		int[] newArray = new int[10];
		int counter = 0;

		for (int i = 0; i < list.length; i++) {

			for (int j = i; j < list.length; j++) {

				if (list[i] == list[j]) {
					counter++;
				}

			}

			if (counter < 2) {
				newArray[i] = list[i];
			}
			counter = 0;
		}
		
		Arrays.sort(newArray);
		return newArray;
	}

	public static boolean isSorted(int[] list) {

		int[] sortedList = Arrays.copyOf(list, list.length);
		Arrays.sort(sortedList);
		boolean flag = true;
		
		for (int i = 0; i < list.length; i++) {
			
			if (list[i] != sortedList[i]) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}

	public static String sort(String s) {

		return null;
	}

	public static double sumMajorDiagonal(double[][] m) {

		return 0.00;
	}

	public static double sumColumn(double[][] m, int columnIndex) {

		return 0.00;
	}

	public static void sort(int m[][]) {

	}
}
