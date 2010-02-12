package net.anotheria.anoprise.fs;

import java.io.Serializable;

public interface FSSaveable extends Serializable {

	/**
	 * Returns the id of the owner of the FSSaveable object.
	 * 
	 * @return - {@link String}
	 */
	String getOwnerId();

}