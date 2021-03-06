package net.anotheria.anoprise.metafactory;

/**
 * Interface for an resolver used by MetaFactory.
 * @author lrosenberg
 *
 */
public interface AliasResolver {
	
	/**
	 * Resolves an alias. If the alias can't be resolved, returns null. Otherwise the resolved alias, which can be an alias himself, is returned.
	 * @param alias
	 * @return
	 */
	String resolveAlias(String alias);
	
	/**
	 * Returns the priority of this resolver. The 
	 * @return
	 */
	int getPriority();
}
 