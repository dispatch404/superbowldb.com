package com.superbowldb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration{
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails admin = User
				.withUsername("user")
				.password("{noop}admin")
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(admin);
	}
	
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authz) -> authz
                .antMatchers("/admin/**").hasAnyRole("ADMIN").anyRequest()
            )
            .csrf().disable()
            .httpBasic(withDefaults());
        return http.build();
    }
 

}
