
package com.example.demo.dataSource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jca.support.LocalConnectionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.demo", transactionManagerRef = "transcationManager", entityManagerFactoryRef = "entityManager")
@EnableTransactionManagement
@DependsOn("dataSourceRouting")
public class DataSourceConfig {
	  private  DataSourceRouting dataSourceRouting;
	  
	  
	    public DataSourceConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	    
	    
		public DataSourceConfig(DataSourceRouting dataSourceRouting) {
			super();
			this.dataSourceRouting = dataSourceRouting;
		}



		@Bean
	    @Primary
	    public DataSource dataSource() {
	        return dataSourceRouting;
	    }

	    @Bean(name = "entityManager")
	    public LocalConnectionFactoryBean entityManagerFactoryBean(EntityManagerFactory builder) {
	        return builder.DataSource(dataSource()).packages("com.example.demo.user").build();
	    }

	    @Bean(name = "transcationManager")
	    public JpaTransactionManager transactionManager(
	            @Autowired @Qualifier("entityManager") LocalContainerEntityManagerFactoryBean entityManagerFactoryBean) {
	        return new JpaTransactionManager(entityManagerFactoryBean.getObject());
	    }
}
