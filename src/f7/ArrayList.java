package f7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
	private E[] elements;
	private int size;
	
	private void grow() {
		E[] temp = (E[])new Object[size * 2];
		for (int i = 0; i < size; i++) {
			temp[i] = elements[i];
		}
		elements = temp;
	}
	
	public ArrayList() {
		this(20);
	}
	
	public ArrayList(int initialCapacity) {
		initialCapacity = Math.max(1, initialCapacity);
		elements = (E[])new Object[initialCapacity];
	}

	public void add(int index, E element) {
		if(index<0 || index>size)
			throw new IndexOutOfBoundsException();
		if(size==elements.length)
			grow();
		for(int i=size; i>index; i--) {
			elements[i]=elements[i-1];
		}
		elements[index] = element;
		size++;
	}

	public void add(E element) {
		add(size,element);
	}

	public void addFirst(E element) {
		add(0,element);
	}

	public void addLast(E element) {
		add(size,element);
	}

	public E remove(int index) {
		if(index >= size || index < 0){
			throw new IndexOutOfBoundsException();
		}
		E element;
		element = elements[index];
		size--;
		for (int i = size; i > 0; i--) {
			elements[i] = elements[i +1];
		}
		return element;
	}

	public E removeFirst() {
		return remove(0);
	}

	public E removeLast() {
		return remove(size);
	}

	public void clear() {
		for (int i = size; i > 0 ; i--) {
			removeLast();
		}
	}

	public E get(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return elements[index];
	}

	public E set(int index, E element) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		E prevElement = elements[index];
		elements[index] = element;
		return prevElement;
	}

	public int indexOf(E element) {
		return indexOf(0,element);
	}

	public int indexOf(int startIndex, E element) {
		if (startIndex > 0 || startIndex < size) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = startIndex; i <size ; i++) {
			if (elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder("[ ");
		for(int i=0; i<size; i++) {
			res.append(elements[i]);
			if(i<size-1)
				res.append("; ");
		}
		res.append(" ]");
		return res.toString();
	}

	public Iterator<E> iterator() {
		return new Iter();
//		return new Iterator<E>() {
//			private int index=0;
//			
//			public boolean hasNext() {
//				return index<size;
//			}
//			
//			public E next() {
//				if(index==size)
//					throw new NoSuchElementException();
//				return elements[index++];
//			}
//			
//			public void remove() {
//				throw new UnsupportedOperationException();
//			}
//		};
	}
	
	private class Iter implements Iterator<E> {
		private int index=0;
		
		public boolean hasNext() {
			return index<size;
		}
		
		public E next() {
			if(index==size)
				throw new NoSuchElementException();
			return elements[index++];
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		for(int i=10; i<100; i+=10) {
			list.add(i);
		}
		System.out.println(list);
		Iterator<Integer> numbers = list.iterator();
		while(numbers.hasNext())
			System.out.print(numbers.next()+ " ");
	}
}
