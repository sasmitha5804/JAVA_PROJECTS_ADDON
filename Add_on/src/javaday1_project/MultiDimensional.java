package javaday1_project;
import java.util.*;
import java.util.Arrays;
public class MultiDimensional {
  public static void main(String[]args) {
	  int[][] matrix = new int[2][3];
	  
	  matrix[0][0]=1; matrix[0][1]=2;matrix[0][2]=3;
	  matrix[1][0]=4; matrix[1][1]=5;matrix[1][2]=6;
	  
	  for(int i=0;i< matrix.length;i++) {
		  for( int j=0;j< matrix[i].length;j++) {
			   System.out.println(matrix[i][j]+" ");
		  }
		  System.out.println();
  }
	  
	  int[] source = {1,2,3,4,5};
	  int[] destination =new int[5];
	  //copy array
	  System.arraycopy(source, 0, destination, 0, source.length);
	  
	  for (int num:destination) {
		  System.out.println(num+" ");
	  }
	  
	  //Sort an array
	  
	  int[] numbers = {40, 10, 30, 20, 50};
      
      Arrays.sort(numbers); 
      System.out.println("Sorted Array: " + Arrays.toString(numbers));
      
      //for each 
      for(int num:numbers)
      {
		System.out.println(num);
      }
}
}
