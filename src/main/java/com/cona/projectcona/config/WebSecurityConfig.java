package com.cona.projectcona.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    .antMatchers("/**").permitAll()
                    .anyRequest().authenticated()

                //TODO 인증 절차 재정의 필요
                    .and()
                .formLogin()
                    .and()
                .httpBasic();
    }
}
