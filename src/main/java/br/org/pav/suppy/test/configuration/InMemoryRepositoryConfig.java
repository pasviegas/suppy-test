package br.org.pav.suppy.test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("br.org.pav.suppy.test.repository")
public class InMemoryRepositoryConfig {

}
