package com.zg.ryaz.l.m.demo.Configuration;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("user").password("{noop}user").roles("USER")
                .and()
                .withUser("root").password("{noop}root").roles("USER","ADMIN");
    }
    @Override
    protected void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.httpBasic();
        httpSecurity.formLogin();
        httpSecurity
                .authorizeRequests()
                .antMatchers(
                            "/",
                            "/login",
                            "/save",
                            "/edit")
                            .permitAll()
                    .antMatchers("/delete/**").hasRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                    .formLogin();

    }

}
