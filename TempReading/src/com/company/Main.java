package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = {13, 14, 17, 12, 11, 8, 7, 6, 13, 13, 17, 17, 15, 13, 16, 17, 12, 13, 8, 7, 6, 13, 12, 17, 16, 15, 9, 8, 14, 12};
	    int[] arr2 = doInsertionSort(arr1);
	    firstNum = arr1(0);
	    lastNum = arr1.get[arr1.size()-1];
	    for(int i:arr2){
	        System.out.print(i);
	        System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input){

        int temp;
        for(int i = 1; i < input.length; i++){
            for(int j = i; j > 0; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}

