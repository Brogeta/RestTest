package com.lifetouch2.Configeration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = "com.lifetouch2")
@EnableJpaRepositories(basePackages = "com.lifetouch2")
@EnableTransactionManagement
public class RepositoryConfiguration {
}
