
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

			break;
		case 2:
			
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
			
			if (option < 1 ||  option > 6) {
				System.out.println("\nWrong input! Try again!");
				
				showMenu(sc);
			}
		}
	}

	public static int[] eliminateDuplicates(int[] list) {

	return null;
	}
	
	public static boolean isSorted(int[] list) {
		
		return true;
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
