/**
 * 
 */
package com.tus.farmservice.exception;

/**
 * @author User
 *
 */
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8784944898121847803L;

	/**
	 * 
	 */
	public ResourceNotFoundException(String message) {
        super(message);
	}

}
