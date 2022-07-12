package com.concepts.core.java.test.hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
The median of a dataset of integers is the midpoint value of the dataset for which an equal number of integers
are less than and greater than the value. To find the median, you must first sort your dataset of integers in
non-decreasing order, then:

If your dataset contains an odd number of elements, the median is the middle element of the sorted sample.
In the sorted dataset {1,2,3}, 2 is the median.
If your dataset contains an even number of elements, the median is the average of the two middle elements of
the sorted sample. In the sorted dataset {1,2,3,4}, (2 + 3)/2 = 2.5 is the median.
Given an input stream of n integers, you must perform the following task for each ith integer:

Add the ith integer to a running list of integers.
Find the median of the updated list (i.e., for the first element through the ith element).
Print the list's updated median on a new line.
The printed value must be a double-precision number scaled to decimal place (e.g., 1.2 format).

Input Format
The first line contains a single integer,n, denoting the number of integers in the data stream.
Each line t of the n subsequent lines contains an integer,ai, to be added to your list.

Constraints

* 1 <= n <= 10^5
* 0 <= ai <= 10^5

Output Format

After each new integer is added to the list, print the list's updated median on a new line as a single
double-precision number scaled to decimal place (e.g., 1.2 format).
*/

public class HeapsFindTheRunningMedian {

  // The idea is that we create two heaps - a minimum and a maximum heap.
  // Our median is therefore going to be either the head of the minimum heap
  // or (minimum.first() + maximum.first())/2.0;

  // Comparators to create our min/max heaps

  private static Comparator<Integer> minComparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer first, Integer second) {
      return first.compareTo(second);
    }
  };

  private static Comparator<Integer> maxComparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer first, Integer second) {
      return second.compareTo(first);
    }
  };

  private static PriorityQueue<Integer> minSortedQueue = new PriorityQueue<Integer>(100,minComparator);
  private static PriorityQueue<Integer> maxSortedQueue = new PriorityQueue<Integer>(100,maxComparator);

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> foundValues;
    int n = in.nextInt();

    for(int currentIndex=1; currentIndex <= n; currentIndex++){
      Integer value = Integer.valueOf(in.nextInt());
      double median = -1;

      // alternate insert to keep tree balanced
      if (currentIndex % 2 == 0) {
        maxSortedQueue.add(value);
      } else {
        minSortedQueue.add(value);
      }

      // swap end elements if out of order
      // This makes it so we only need to do one operation after the sorted
      // insert instead of traversing the list.
      if (minSortedQueue.size() > 0 && maxSortedQueue.size() > 0) {
        if (minSortedQueue.peek() < maxSortedQueue.peek()) {
          Integer maxSortedValue = maxSortedQueue.poll();
          Integer minSortedValue = minSortedQueue.poll();
          minSortedQueue.add(maxSortedValue);
          maxSortedQueue.add(minSortedValue);
        }
      }

      // get median using the definition in the problem set
      if (currentIndex == 1) {
        median = value;
      } else if (currentIndex % 2 != 0) {
        median = minSortedQueue.peek();
      } else {
        double sum = (minSortedQueue.peek() + maxSortedQueue.peek());
        median = sum/2.0;
      }

      System.out.printf("%.1f\n", median);
    }
  }
}

