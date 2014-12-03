package com.jags.explore.java.algortihms;

/**
 * Created by 36262Ja on 21/10/2014.
 */
public class BubbleSort {

  public void sort(int[] input) {

    for (int i = 0 ; i < input.length ; i++) {
      for (int j = i+1; j < input.length; j++) {
        if (input[i] > input[j]) {
          int temp = input[i];
          input[i] = input[j];
          input[j] = temp;
        }
      }
    }
  }

  public void print(int[] input) {
    for (int i: input) {
      System.out.print(i + " : ");
    }
    System.out.println();
  }

  public static void main (String args[] ) {
    BubbleSort bubbleSort = new BubbleSort();
    int[] unsorted = {5, 6, 7, 1, 4, 8};
    bubbleSort.print(unsorted);
    bubbleSort.sort(unsorted);
    bubbleSort.print(unsorted);
  }
}
