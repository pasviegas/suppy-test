package org.pav.suppy.test.service;

import org.junit.Before;
import org.springframework.test.context.TestContextManager;

public abstract class AbstractServiceTest {

	private TestContextManager testContextManager;
	
	@Before
	public void setUpContext() throws Exception {
		this.testContextManager = new TestContextManager(getClass());
		this.testContextManager.prepareTestInstance(this);
	}

}
