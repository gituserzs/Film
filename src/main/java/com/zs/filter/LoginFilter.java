package com.zs.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        String currPath = request.getRequestURI();    //当前请求的URL
//        if(currPath.contains("index")||currPath.contains("login")){
//            filterChain.doFilter(request, response);
//            return ;
//        }

        if (session.getAttribute("user") != null||currPath.equals("/") || currPath.contains("login")||currPath.contains("index")) {
            filterChain.doFilter(request, response);
        } else {
            response.sendRedirect("/login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
