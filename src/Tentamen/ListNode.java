package Tentamen;

/**
 * Detta är en klass som kommer att skapa en noder som läger sig eftervarandra
 * 
 * @author Jonatan Fridsten
 *
 * @param <E>
 */
public class ListNode<E> {
	private E data;
	private ListNode<E> next;

	/**
	 * Konstruktorn kommer att skapa en nod med data i och hänvisa till en annan
	 * nod i kön
	 * 
	 * @param data
	 *            vad som finns i noden
	 * @param next
	 *            nästa nod i listan
	 */
	public ListNode(E data, ListNode<E> next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * Metoden retunerar vad som finns i datan på noden
	 * 
	 * @return datan i noden
	 */
	public E getData() {
		return this.data;
	}

	/**
	 * Metoden sätter datan i noden
	 * 
	 * @param datan
	 *            som sätts i noden
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**
	 * Metoden kommer att hämta in nästa nod
	 * 
	 * @return noden som kommer efter
	 */
	public ListNode<E> getNext() {
		return this.next;
	}

	/**
	 * Metoden kommer att sätta en ny nod som den nuvarande noden kommer att ha
	 * som sin nästa
	 * 
	 * @param next
	 *            den nya noden
	 */
	public void setNext(ListNode<E> next) {
		this.next = next;
	}

	/**
	 * Metoden kommer att retunerar en string men alla noder som finns i en
	 * lista
	 * 
	 * @return string med alla värden
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[ ");
		str.append(data.toString());
		ListNode<E> node = next;
		while (node != null) {
			str.append("; ");
			str.append(node.getData().toString());
			node = node.getNext();
		}
		str.append(" ]");
		return str.toString();
	}
}