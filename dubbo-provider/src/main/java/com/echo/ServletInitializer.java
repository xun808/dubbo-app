package com.echo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @program: com.echo.com
 * @author: Echo
 * @create: 2020-04-04 18:47
 **/
public class ServletInitializer extends SpringBootServletInitializer  {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DubboProviderApplication.class);
    }
}
