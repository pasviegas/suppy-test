package br.org.pav.suppy.test.web.controller;

import br.org.pav.suppy.test.configuration.TestWebConfiguration;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestWebConfiguration.class})
@WebAppConfiguration
public abstract class AbstractControllerTest {

    @Autowired
    protected MockMvc mockMvc;

}
