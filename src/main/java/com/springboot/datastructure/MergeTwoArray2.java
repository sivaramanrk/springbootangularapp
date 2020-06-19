package com.springboot.datastructure;

import java.util.Arrays;

public class MergeTwoArray2 {
	private static int[] mergeArray(int[] arrayA, int[] arrayB)
    {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
         
        int i=0, j=0, k=0; 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
        for(int l=0;i<mergedArray.length;i++) {
        	System.out.print(l);
        }
             System.out.println(mergedArray);
        Arrays.sort(mergedArray);
         
        return mergedArray;
    }
     
    public static void main(String[] args) 
    {
        int[] arrayA = new int[] {12, -7, 18, 9, 37, -1, 21};
         
        int[] arrayB = new int[] {27, 8, 71, -9, 18};
         
        int[] mergedArray = mergeArray(arrayA, arrayB);
         
        System.out.println("Array A : "+Arrays.toString(arrayA));
         
        System.out.println("Array B : "+Arrays.toString(arrayB));
         
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
    }

}
