package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = new String[5];
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "I am number 3!";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < 5; i ++) {
		System.out.println(arr[i]);
		}
		//6. make an array of 50 integers
		int[] arr1 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < 50; i ++) {
			Random ran = new Random();
			arr1[i] = ran.nextInt(100000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smol = 0;
		int biggyCheese = 0;
		for(int i = 0; i < arr1.length; i ++) {
			for(int j = 0; j < arr1.length - 1; j++){
				if(arr1[j] < arr1[j+1]) {
					smol = arr1[j];
					
				}else if(arr1[j] > arr1[j + 1]) {
					biggyCheese = arr1[j];
				}
			}
		}
		System.out.println(smol);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < arr1.length; i ++) {
			System.out.println(arr1[i]);
		}
		//10. print the largest number in the array.
		System.out.println(biggyCheese);
	}
}
