package cofig;

import java.io.IOException;

@javax.servlet.annotation.WebFilter(filterName = "UserFilter", value = "/*")
public class UserFilter implements javax.servlet.Filter {
    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, resp);
    }

}
