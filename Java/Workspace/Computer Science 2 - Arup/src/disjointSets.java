import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class disjointSets {
	public static int height = 0, prev = 0;
	public static void main(String[] args) {
		int lim = 10;
		int[] array = {5,5,7,5,5,7,7,2,0,0,0,0,0,0,0,0};
		System.out.println(getRoot(array, 8));
		

	}

	public static int getRoot(int[] set, int position){
	
		int num = set[position];
		while(num != position){
			position = num;
			num = set[position];
			
		}
		
		return num;
	}
	public static int Find(int numtofind, int[] list){
	
			for(int d = 0; d < list.length; d++){
				if(numtofind == list[d]){
					return getRoot(list, d);
				}
			}
		
		return -999;
	}
	public static int getHeight(int[] list, int num){
		int biggest = -999;
		for(int c = 0; c < list.length; c++){
			if(list[c] == num){
				height++;
				System.out.println(height);
				getHeight(list, c);
				
			}
			else{
				biggest = getBigger(prev, height);
				prev = height;
				height = 0;
				
			}
			
		
		}
		
		return biggest;
	}
	public static int getBigger(int one, int two){
		if(one > two){
			return one;
		}
		return two;
	}
	public static int[] Union(int[] all, int num1, int num2){
		// num2 is where you place the num2
		int h1 = 0, h2 = 0;
		h1 = getHeight(all, num1);
		h2 = getHeight(all, num2);
		int newh = 0;
		if(h1 == h2){
			newh = h1;
		}
		else{
			newh = getBigger(h1, h2);
			if(newh == h1){
				all[h2] = h1;
			}
			else{
				all[h1] = h2;
			}
		}

		
		
		return all;
	}
	public static void printLikeArray(int[] all){
		for(int count = 1; count < all.length; count++){
			System.out.print(count + " ");
			System.out.print(all[count]);
			System.out.println();
		}
	}
}
/*
1.  Create an array
2.  Add a set.  A set is a collection of numbers.  Therefore, use int array.
3.  Allow the first number in the set to be the marker.
4.  In the index of the array, connect the root to itself (or null).  For all other numbers, point to the marker in the set.
5.  Find() and Union() will be two key operations.
6.  Union should be easy.  All you have to do is take the marker of the set you want to union with and point it to the marker of the other one.
7.  Find will be harder.  You'll have to loop through each of the nodes in each of the sets to figure out the marker of the number, until you're at the root.



*/