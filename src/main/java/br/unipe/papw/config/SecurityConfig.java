package br.unipe.papw.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{ 

		
	 @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http
	        .authorizeRequests()	           
	            .anyRequest().authenticated()
	        .and()
	        .httpBasic();
	  }
	 
  @Override
  public void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
        .inMemoryAuthentication()
        .withUser("user").password("123")
            .roles("USER")
        .and()
        .withUser("fujioka").password("123")
            .roles("USER");
  }
}