/**
 * This class represents a constraint between two temporal interval relations
 * 
 */
package org.allen.temporalintervalrelationships;

/**
 * @author Jörn Franke <jornfranke@gmail.com>
 *
 */
public class Constraint<E> {
	private Node<E> sourceNode;
	private Node<E> destinationNode;
	private short constraints;
	
	public Constraint(Node<E> sourceNode, Node<E> destinationNode, short constraints) {
		this.sourceNode=sourceNode;
		this.destinationNode=destinationNode;
		this.constraints=constraints;
	}
	
	public Node<E> getSourceNode() {
		return this.sourceNode;
	}
	
	public Node<E> getDestinationNode() {
		return this.destinationNode;
	}
	
	public short getConstraints() {
		return this.constraints;
	}
}
