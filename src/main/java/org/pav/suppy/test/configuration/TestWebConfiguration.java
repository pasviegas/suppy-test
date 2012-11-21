package org.pav.suppy.test.configuration;

import org.pav.suppy.configuration.ControllerConfig;
import org.pav.suppy.configuration.MvcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@Configuration
@Import({ ControllerConfig.class, MvcConfig.class, TestServiceConfiguration.class })
public class TestWebConfiguration {

	@Autowired
	private WebApplicationContext wac;

	@Bean
	public MockMvc mockMvc() {
		return (MockMvcBuilders.webApplicationContextSetup(this.wac).build());
	}
}
