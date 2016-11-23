import java.util.Scanner;


public class MatrixMAkeZeroRowColumn {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int array[][];
		int index1 = 0;
		int index2 = 0;
		System.out.println("Enter number of rows");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns");
		int columns = scan.nextInt();
		array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				//System.out.print(array[i][j]+"  ");
				if (array[i][j] == 0) {
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println(index1);
		System.out.println(index2);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				//System.out.print(array[i][j]+"  ");
				if (array[i][j] == 0) {
					index1 = i;
					index2 = j;
				}
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if ((index1 == i)||(index2 == j)) {
					System.out.print(0+"  ");
				} else {
					System.out.print(array[i][j]+"  ");
				}
				
			}
			System.out.println();
		}
		
	}
}
