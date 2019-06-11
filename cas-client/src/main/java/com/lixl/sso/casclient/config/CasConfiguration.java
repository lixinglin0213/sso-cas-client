package com.lixl.sso.casclient.config;

import net.unicon.cas.client.configuration.CasClientConfigurerAdapter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CasConfiguration extends CasClientConfigurerAdapter {

    @Override
    public void configureValidationFilter(FilterRegistrationBean validationFilter) {
        validationFilter.getInitParameters().put("useSession", "false");
    }
}
