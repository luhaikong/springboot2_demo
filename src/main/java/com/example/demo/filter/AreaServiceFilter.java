package com.example.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class AreaServiceFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器->Remote Host:"+request.getRemoteHost());
        System.out.println("过滤器->Remote Address:"+request.getRemoteAddr());

        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
