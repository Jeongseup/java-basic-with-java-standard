//import java.lang.reflect.Array;
import java.util.Arrays;


public class ex_01{
	public static void main(String[] args) {
		int[] score = new int[5];
	
		System.out.print("타입@주소 : ");
		System.out.println(score);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ",");
		}
		
		System.out.println();
		
		int[] firstArr = {100,95,80,70,60};
		
		for(int i =0; i < firstArr.length; i++) {
			System.out.print(firstArr[i] + ",");
		}
		
		System.out.println(Arrays.toString(firstArr));
		
		char[] chArr = {'a','b','c'};
		System.out.println(chArr);
	}
}
