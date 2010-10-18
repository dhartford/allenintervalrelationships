/**
 *  This class represents a Node (Temporal Interval)
 */
package org.allen.temporalintervalrelationships;

/**
 * @author Jörn Franke <jornfranke@gmail.com>
 *
 */
public class Node<E> {
	E identifier;
	int allenId;
	
	public Node(E identifier) {
		this.identifier=identifier;
	}
	
	public E getIdentifier() {
		return this.identifier;
	}
	
	public int getAllenId() {
		return this.allenId;
	}
	
	public void setAllenId(int allenId) {
		this.allenId=allenId;
	}

}
