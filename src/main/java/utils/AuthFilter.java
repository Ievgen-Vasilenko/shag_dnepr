package utils;

import models.User;
import service.UserService;
import service.implService.ImplUserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter({"/add", "/cabinet", "/change"})
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ImplUserService userService = new UserService();
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession sess = request.getSession();
        Cookie[] cookies = request.getCookies();
        String id = (String) sess.getAttribute("id");
        if (id != null) {
            User user = new User();
            user = userService.findUser(Integer.parseInt(id));
            if (user != null) {
                if (cookies != null) {
                    for (Cookie ck : cookies) {
                        if ("SSID".equals(ck.getName()) && ck.getValue().equals(sess.getId())) {
                            chain.doFilter(req, resp);
                            return;
                        }
                    }
                }
            }
        }
        response.sendRedirect("http://localhost:8080/diplom_war_exploded/autorisation");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
