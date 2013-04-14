package br.org.pav.suppy.test.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.org.pav.suppy.configuration.ControllerConfig;
import br.org.pav.suppy.configuration.MvcConfig;
import br.org.pav.suppy.configuration.ServiceConfig;

@Configuration
@Import({ ControllerConfig.class, MvcConfig.class, InMemoryRepositoryConfig.class, ServiceConfig.class, MockConfig.class })
public class TestWebConfiguration {

	@Autowired
	private WebApplicationContext wac;

	@Bean
	public MockMvc mockMvc() {
		return (MockMvcBuilders.webAppContextSetup(this.wac).build());
	}
}
