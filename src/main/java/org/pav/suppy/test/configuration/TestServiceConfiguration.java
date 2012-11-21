package org.pav.suppy.test.configuration;

import org.pav.suppy.configuration.PropertySourceConfig;
import org.pav.suppy.configuration.RepositoryConfig;
import org.pav.suppy.configuration.ServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ RepositoryConfig.class, ServiceConfig.class, DevelopmentMongoConfig.class, DevelopmentJdbcConfig.class, PropertySourceConfig.class })
public class TestServiceConfiguration {

}
