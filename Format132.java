package com.stacks;

import java.util.Arrays;

public class Format132 {


	public static void main(String[] args) {
		
		int[] array = {1,20, 3,40,5,6,9,7};
		if (array.length>3) {
			for (int i = 0; i < array.length; i++) {
				if (i<array.length-2) {
					int j = i+1;
					int k = i+2;
					if((array[i]<array[j])&&(array[k]<array[j])&&(array[k]>array[i])){
						System.out.println(array[i]+" : "+array[j]+" : "+array[k]);
					}
				}
			}
		}
	}

}
