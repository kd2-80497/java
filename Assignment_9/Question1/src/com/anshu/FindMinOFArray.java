package com.anshu;

import java.util.Arrays;

public class FindMinOFArray {
	
		static <T extends Number> T findMin(T[] arr)
		
		{ T res=arr[0];
			for (T ele :arr) {
				if(res.doubleValue()>ele.doubleValue()) {
					res=ele;
				}
			}
		
			return res;
		}
	public static void main(String[] args) {
		Integer arr[]= {22,333,11,23,23};
		Integer min=findMin(arr);
		System.out.println(min);
		
		Double arr1[]= {2.2,33.3,123.1,23.33,23.3};
		Double min1=findMin(arr1);
		System.out.println(min1);
	}

}
