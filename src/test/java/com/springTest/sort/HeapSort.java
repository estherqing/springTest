package com.springTest.sort;

public class HeapSort {
	public static int[] data;

	HeapSort(int[] data){
        this.data = data;
    }

	public void printdata() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		HeapSort t = new HeapSort(a);
		t.printdata();
		System.out.println("=========================");
		t.heapSort();
		System.out.println("=========================");
		t.printdata();
		System.out.println(HeapSort.class.isInstance(t));
	}

	public void swap(int i, int j) {
		if (i == j)
			return;
		this.data[i] = this.data[i] + this.data[j];
		this.data[j] = this.data[i] - this.data[j];
		this.data[i] = this.data[i] - this.data[j];
	}

	public void reconstructionHeap(int lastindex) {
		for (int i = (lastindex - 1) / 2; i >= 0; i--) {
			int j = i;
			// 保证当前结点的子节点存在
			while (2 * j + 1 <= lastindex) {
				int big = 2 * j + 1;
				if (big < lastindex) {
					// 保证右子节点存在
					if (data[big] < data[big + 1]) {
						big = big + 1;
					}
				}
				if (data[j] < data[big]) {
					swap(j, big);
					j = big;
				} else {
					break;
				}
			}
		}
	}

	public void heapSort() {
		for (int i = 0; i < this.data.length; i++) {
			int tmp = this.data.length - 1 - i;
			reconstructionHeap(tmp);
			swap(0, tmp);
			printdata();
		}
	}
}
