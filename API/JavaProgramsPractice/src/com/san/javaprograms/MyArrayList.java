package com.san.javaprograms;

import java.util.Arrays;

/*
 * Write a program to implement your own ArrayList class. It should
contain add(), get(), remove(), size() methods. Use dynamic array logic.
It should increase its size when it reaches threshold.
 */
public class MyArrayList {

	private Object[] myStore;
	private int actSize = 0;

	MyArrayList() {
		myStore = new Object[10];
	}

	public void add(Object obj) {
		if (myStore.length - actSize <= 5) {
			increaseList(obj);
		} else {
			myStore[actSize++] = obj;
		}

	}

	public int size() {
		return actSize;
	}

	public Object remove(int index) {

		if (index < actSize) {
			Object obj = myStore[index];
			myStore[index] = null;
			int temp = index;
			while (temp < actSize) {
				myStore[temp] = myStore[temp + 1];
				myStore[temp + 1] = null;
				temp++;
			}
			actSize--;
			return obj;

		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	public Object get(int index) {
		if (index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void traverse(MyArrayList mal) {
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
	}

	private void increaseList(Object obj) {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		myStore[actSize++] = obj;
		System.out.println("ArraySize Incresed : " + myStore.length);
	}

	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
		mal.add(new Integer(10));
		mal.add(new Integer(5));
		mal.add(new Integer(14));
		mal.add(new Integer(6));
		mal.add(new Integer(21));
		System.out.println("Array Elements");
		mal.traverse(mal);
		System.out.println();
		mal.add(new Integer(35));
		mal.traverse(mal);
		System.out.println();
		System.out.println("Index Element In the List : " + mal.get(5));
		System.out.println("List Size : " + mal.size());
		System.out.println("Removing Element at index 3 : " + mal.remove(3));
		mal.traverse(mal);

	}

}
