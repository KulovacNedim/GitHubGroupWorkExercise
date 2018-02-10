
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

			System.out.print("Enter some string: ");
			String s_1 = sc.next();

			String s_2 = sort(s_1);
			System.out.println("Sorted string is: " + s_2);

			break;
		case 4:

			System.out.println("Enter 4×4 matrix: ");

			double[][] m = new double[4][4];

			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = sc.nextDouble();
				}
			}

			System.out.println("Major diagonal sum is: " + sumMajorDiagonal(m));

			break;
		case 5:

			System.out.println("Enter 4×4 matrix: ");

			double[][] matrix = new double[4][4];

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = sc.nextDouble();
				}
			}

			System.out.print("\nEnter column index to sum elements on it: ");
			int col = sc.nextInt();

			System.out.println("Sum of index " + col + " column elements is: " + sumColumn(matrix, col));

			break;
		case 6:

			System.out.println("\nRandom genarated  4×4 matrix:");

			int[][] matrixRandom = new int[4][4];

			for (int i = 0; i < matrixRandom.length; i++) {
				for (int j = 0; j < matrixRandom[i].length; j++) {

					matrixRandom[i][j] = (int) (Math.random() * 10);
					System.out.print(matrixRandom[i][j] + " ");
				}
				System.out.println();
			}

			sort(matrixRandom);

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

		String[] sCopy = new String[s.length()];

		for (int i = 0; i < s.length(); i++) {
			sCopy[i] = "" + s.charAt(i);
		}

		for (int i = 0; i < sCopy.length - 1; i++) {

			for (int j = i + 1; j < sCopy.length; j++) {

				if (sCopy[i].compareToIgnoreCase(sCopy[j]) > 0) {
					String t = sCopy[i];
					sCopy[i] = sCopy[j];
					sCopy[j] = t;
				}
			}
		}

		String s2 = "";

		for (int i = 0; i < sCopy.length; i++) {
			s2 = s2 + sCopy[i];
		}
		return s2;
	}

	public static double sumMajorDiagonal(double[][] m) {

		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum = sum + m[i][i];
		}
		return sum;
	}

	public static double sumColumn(double[][] m, int columnIndex) {

		double returnValue = 0;

		for (int i = 0; i < m[1].length; i++) {

			returnValue = returnValue + m[i][columnIndex];
		}
		return returnValue;
	}

	public static void sort(int m[][]) {

		for (int i = 0; i < m.length - 1; i++) {
			int currentIndex = i;
			int[] current = m[i];
			for (int j = i + 1; j < m.length; j++) {
				if (current[0] > m[j][0] || current[0] == m[j][0] && current[1] > m[j][1]) {
					current = m[j];
					currentIndex = j;
				}
			}
			if (currentIndex != i) {
				m[currentIndex] = m[i];
				m[i] = current;
			}
		}

		System.out.println("\nSorted matrix is: ");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
