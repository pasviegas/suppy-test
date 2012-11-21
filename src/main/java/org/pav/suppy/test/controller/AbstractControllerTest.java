package org.pav.suppy.test.controller;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.web.server.MockMvc;

public abstract class AbstractControllerTest {

	private TestContextManager testContextManager;

	@Autowired
	protected MockMvc mockMvc;
	
	@Before
	public void setUpContext() throws Exception {
		this.testContextManager = new TestContextManager(getClass());
		this.testContextManager.prepareTestInstance(this);
	}

}
