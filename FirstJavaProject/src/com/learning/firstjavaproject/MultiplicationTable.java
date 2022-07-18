package com.learning.firstjavaproject;

public class MultiplicationTable {
	void print() {
		print(5);

		// for(int i=1;i<=10;i++) {
		// System.out.printf("%d * %d = %d",5,i,5*i).println();
		// }
	}

	void print(int table) {

		print(table, 1, 10);

		// for(int i=1;i<=10;i++) {
		// System.out.printf("%d * %d = %d",j,i,j*i).println();
		// }
}
void print(int j, int from, int to) {

	for(int i=from;i<=to;i++) {
		System.out.printf("%d * %d = %d",j,i,j*i).println();
	}
}
	}
