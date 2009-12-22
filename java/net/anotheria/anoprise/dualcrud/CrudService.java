package net.anotheria.anoprise.dualcrud;

public interface CrudService<T extends CrudSaveable> {
	/**
	 * Creates a new saved instance of T. Disallows overwriting.
	 * @param t
	 * @throws CrudServiceException
	 */
	void create(T t) throws CrudServiceException;
	/**
	 * Returns a saved instance of T.
	 * @param ownerId
	 * @return
	 * @throws CrudServiceException
	 * @throws ItemNotFoundException
	 */
	T read(String ownerId) throws CrudServiceException, ItemNotFoundException;
	/**
	 * Updates an existing instance of T. Fails if there is no previously saved instance. 
	 * @param t
	 * @throws CrudServiceException
	 */
	void update(T t) throws CrudServiceException;
	/**
	 * Deletes a saved instance of T. Should ignore non existing files.
	 * @param t
	 * @throws CrudServiceException
	 */
	void delete(T t) throws CrudServiceException;
	/**
	 * Saves an instance of T, regardless, whether its an update or new creation.
	 * @param t
	 * @throws CrudServiceException
	 */
	void save(T t) throws CrudServiceException;
	
	/**
	 * Returns true if the corresponding instance exists.
	 * @param t the instance to check.
	 * @return
	 * @throws CrudServiceException
	 */
	boolean exists(T t) throws CrudServiceException;
	
}
