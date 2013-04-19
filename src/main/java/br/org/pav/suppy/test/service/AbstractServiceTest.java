package br.org.pav.suppy.test.service;

import org.junit.Before;
import org.springframework.test.context.TestContextManager;

public abstract class AbstractServiceTest {

    @Before
    public void setUpContext() throws Exception {
        TestContextManager testContextManager = new TestContextManager(getClass());
        testContextManager.prepareTestInstance(this);
    }

}
