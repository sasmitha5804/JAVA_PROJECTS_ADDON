package javaday2_project;
import java.util.*;
public class Wrapper_Class {

	public static void main(String[] args) {
		Integer myInt = Integer.valueOf(100);
		Double myDouble =Double.valueOf(12.34);
		Character myChar =Character .valueOf('A');
		Boolean myBool =Boolean.valueOf(true);
       
		//AutoBoxing:
		Integer intObj =50;
		
		//UnBoxing:
		int intValue = intObj;
		System.out.println(intValue);
	}

}
