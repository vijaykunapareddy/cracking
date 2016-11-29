import java.util.LinkedList;

public class LongesgSubArray {
	
	public static void main(String[] args) {

		String value = "abc123adc12";
		char[] array = value.toCharArray();
		int charachterCount = 0, numberCount = 0;
		if (array.length>0) {
			for (int i = 0; i < array.length; i++) {
				if (Character.isAlphabetic(array[i])) {
					charachterCount++;
				}else {
					numberCount++;
				}
			}
			
			int k = charachterCount>=numberCount?numberCount:charachterCount;
			System.out.println("logest sub array:"+k*2);
			charachterCount =0;
			numberCount = 0;
			for (int i = 0; i <array.length ; i++) {
				if (Character.isAlphabetic(array[i])) {
					if ((k*2<=array.length)&&(charachterCount<k)) {
						System.out.print(array[i]);
						charachterCount++;
					} 
				}else {
					if((k*2<=array.length)&&(numberCount<k)){
						System.out.print(array[i]);
						numberCount++;
					}
				}
			}
		}
		
	}
}
