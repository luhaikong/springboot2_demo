package com.example.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AreaServiceInterceptor implements HandlerInterceptor {

    /**
     * preHandle()方法 - 用于在将请求发送到控制器之前执行操作。此方法应返回true，以将响应返回给客户端
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器->Pre Handle method is Calling");
        return true;
    }

    /**
     * postHandle()方法 - 用于在将响应发送到客户端之前执行操作
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器->Post Handle method is Calling");

    }

    /**
     * afterCompletion()方法 - 用于在完成请求和响应后执行操作
     * @param request
     * @param response
     * @param handler
     * @param exception
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {
        System.out.println("拦截器->Request and Response is completed");

    }

}
