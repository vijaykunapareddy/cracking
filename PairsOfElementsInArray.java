import java.util.Arrays;

public class PairsOfElementsInArray
{
    static void findThePairs(int inputArray[], int inputNumber)
    {
 
        Arrays.sort(inputArray);
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
        for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
        System.out.println();
        int i = 0;
        int j = inputArray.length-1;
        System.out.println(inputArray[0]);
        while (i < j)
        {
            if(inputArray[i]+inputArray[j] == inputNumber)
            {
                System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                i++;
                j--;
            }
            else if (inputArray[i]+inputArray[j] < inputNumber)
            {
                i++;
            }
            else if (inputArray[i]+inputArray[j] > inputNumber)
            {
                j--;
            }
        }
    }
 
    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
    }
}