package pl.ja.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.usersByUsernameQuery("select login, pass, active from osoby where login=?")
			.authoritiesByUsernameQuery("select login, rola from osoby u "
				+ "inner join osoba_rola ur on ur.id_osoby=u.id_osoby "
				+ "inner join role r on r.id_roli=ur.id_roli "
				+ "where u.login=?")
			.dataSource(dataSource);
	}

	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/admin/*").hasAuthority("admin")
		.anyRequest().permitAll()
		.and()
		.formLogin()
		.loginPage("/login")
		.failureUrl("/login?error=true")
		.defaultSuccessUrl("/")
		.usernameParameter("login")
		.passwordParameter("pass")
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/");
	}
	
	
}
