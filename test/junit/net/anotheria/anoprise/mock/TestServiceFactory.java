package net.anotheria.anoprise.mock;

import net.anotheria.anoprise.metafactory.ServiceFactory;

/**
 * Guitar Model Object.
 * <p/>
 * <P>Various attributes of guitars, and related behaviour.
 * <p/>
 * <P>Note that {@link BigDecimal} is used to model the price - not double or float.
 * See {@link #Guitar(String, BigDecimal, Integer)} for more information.
 *
 * @author vitaliy
 * @version 1.0
 *          Date: Feb 3, 2010
 *          Time: 10:45:52 PM
 */
public class TestServiceFactory implements ServiceFactory<TestService>{
	@Override
	public TestService create() {
		return new TestService();
	}
}
