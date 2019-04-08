package br.unipe.papw.config.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Classe que é responsável pela configuração e customização das formas de
 * autenticação e o modelo utilizado.
 * 
 * @author: Rodrigo Fujioka
 * @date: 7 de Abril de 2019
 * @Time: 21:18:05
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
					// Para qualquer requisição (anyRequest) é preciso estar
					// autenticado (authenticated).
					.anyRequest().authenticated()
					.and().httpBasic();
		}
		
		
	  @Override
	  public void configure(AuthenticationManagerBuilder builder) throws Exception {
	    builder
	        .inMemoryAuthentication()
	        .passwordEncoder(new BCryptPasswordEncoder())
	        .withUser("fujioka").password("123")
	            .roles("USER")
	        .and()
	        .withUser("bolsonaro").password("17")
	            .roles("USER")
		    .and()
	        .withUser("lula").password("13")
	            .roles("USER");
	  }
	
}
