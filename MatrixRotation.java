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
		int flag1 = 0;
		int flag2 = 0;
		for (int j = 0; j<columns; j++) {
			
			for (int i = rows-1; i >= 0; i--) {
				
				//System.out.print(array[i][j]+" ");
				if ((j<3)&&i>1) {
					
				}
				array[flag1][flag2] = array[i][j];
				//k.add(n);
				flag2++;
			}
			flag2 = 0;
			flag1++;
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
		System.out.println("999999999999999999999999999999999999");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
