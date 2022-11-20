public class HeapUsingArray {
	int[] arr;
	int size;

	// create heap
	public void createHeap(int size) {
		arr = new int[size + 1];
		size = 0;
	} // end of method

	// size of heap
	public int size() {
		return size;
	}//end of method

	// check whether the heap is empty or not
	public boolean isEmpty() {
		if (size <= 0) {
			return true;
		} else {
			return false;
		}
	} // end of method

	// delete heap
	public void deleteHeap() {
		arr = null;
	} // end of method
	
	//Insert a new value in Heap
	public void insert(int value) {
		arr[size + 1] = value;
		size++;
		heapifyBotttomToTop(size);
	}//end of method

	// heapify the heap
	public void heapifyBotttomToTop(int index) {
		int parent = index / 2;
		// We are at root of the tree. Hence no more Heapifying is required.
		if (index <= 1) {
			return;
		}
		// If Current value is smaller than its parent, then we need to swap
		if (arr[index] < arr[parent]) {
			int tmp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = tmp;
		}
		heapifyBotttomToTop(parent);
	}//end of method

	// Peek the head
	public void peek() {
		if(size <= 0) {
			System.out.println("Heap is empty !");
		}else {
			System.out.println("Head of the Heap is: " + arr[1]);
		}
	}//end of method

	//Extract Head of Heap
	public int extractHeadOfHeap() {
		if(size == 0) {
			System.out.println("Heap is empty!");
			return -1;
		}else {
			int extractedValue = arr[1];
			arr[1] = arr[size];
			size--;
			HeapifyTopToBottom(1);
			return extractedValue;
		}
	}//end of method

	// heapify from top to bottom
	public void HeapifyTopToBottom(int index) {
		int left  = index * 2;
		int right = (index * 2) + 1;
		int smallestChild = 0;
		
		if (size < left) { //If there is no child of this node, then nothing to do. Just return.
			return; 
		}else if (size == left) { //If there is only left child of this node, then do a comparison and return.
			if(arr[index] > arr[left]) {
				int tmp = arr[index];
				arr[index] = arr[left];
				arr[left] = tmp;
			}
			return;
		}else { //If both children are there
			if(arr[left] < arr[right]) { //Find out the smallest child
				smallestChild = left;
			}else {
				smallestChild = right;
			}
			if(arr[index] > arr[smallestChild]) { //If Parent is greater than smallest child, then swap
				int tmp = arr[index];
				arr[index] = arr[smallestChild];
				arr[smallestChild] = tmp;
			}
		}
		HeapifyTopToBottom(smallestChild);
	}//end of method

	// level order traversal of heap
	public void levelOderTraversal() {
		// Printing from 1 because 0th cell is dummy
		for (int i = 1; i <= size; i++) {
			System.out.println(arr[i]);
		}
	}//end of method

	// main method
	public static void main(String[] args) {
		HeapUsingArray heap = new HeapUsingArray();
		heap.createHeap(7);
		heap.insert(1);
		heap.insert(2);
		heap.insert(3);
		heap.insert(4);
		heap.insert(5);
		heap.insert(6);
		heap.levelOderTraversal();
	}

}