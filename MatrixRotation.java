import java.util.ArrayList;
import java.util.Scanner;


public class MatrixRotation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> k = new ArrayList<Integer>();
		System.out.println("Enter number of rows : ");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns : ");
		int columns = scan.nextInt();
		int[][] array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for (int j = 0; j<columns; j++) {
			for (int i = rows-1; i >= 0; i--) {
				//System.out.print(array[i][j]+" ");
				Integer n = array[i][j];
				k.add(n);
			}
		}
		System.out.println("===============================");
		int count = 0;
		for (int i = 0; i < k.size(); i++) {
			System.out.print(k.get(i)+" ");
			count++;
			if (count == 3) {
				count = 0;
				System.out.println();
			}
			
		}
		
	}

}
