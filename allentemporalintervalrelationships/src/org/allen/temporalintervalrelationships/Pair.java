/**
 * This class is just a simple class for generating a pair of objects (e.g. Activity and ActivityState)
 * 
 * Author:
 * Jörn Franke <joern.franke@sap.com>
 * 
 * Baseline: init
 * 
 * 
 */
package org.allen.temporalintervalrelationships;

/**
 * @author Jörn Franke <jornfranke@gmail.com>
 * 
 */
public class Pair<P1,P2> {
	private P1 p1;
	private P2 p2;
	
	public Pair(P1 p1, P2 p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	public P1 getP1() {
		return this.p1;
	}
	
	public P2 getP2() {
		return this.p2;
	}
}
