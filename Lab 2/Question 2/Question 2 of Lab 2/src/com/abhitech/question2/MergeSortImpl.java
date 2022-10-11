package com.abhitech.question2;

public class MergeSortImpl {

	public void sortArray(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sortArray(arr, left, mid);
			sortArray(arr, mid + 1, right);
			conquerArray(arr, left, mid, right);
		}
	}

	public void conquerArray(int[] arr, int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;
		int[] leftArray = new int[len1];
		int[] rightArray = new int[len2];
		for (int i = 0; i < len1; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < len2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0, k = left;
		while (i < len1 && j < len2) {
			if (leftArray[i] > rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < len1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < len2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
