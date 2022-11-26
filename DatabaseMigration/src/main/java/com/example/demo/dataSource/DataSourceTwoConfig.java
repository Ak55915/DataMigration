package com.example.demo.dataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.second.datasource")
public class DataSourceTwoConfig {

	private String url;
	private String password;
	private String username;
	public DataSourceTwoConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataSourceTwoConfig(String url, String password, String username) {
		super();
		this.url = url;
		this.password = password;
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
