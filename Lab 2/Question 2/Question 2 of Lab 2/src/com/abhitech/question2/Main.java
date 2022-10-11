package com.abhitech.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MergeSortImpl MergeSortImpl = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the size of the currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denomination value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		MergeSortImpl.sortArray(notes, 0, notes.length - 1);
		notesCount.notesCountImpl(notes, amount);
		sc.close();
		System.out.println("This Code is Prepared By - 'Er.Abhinav Raj'");
	}

}