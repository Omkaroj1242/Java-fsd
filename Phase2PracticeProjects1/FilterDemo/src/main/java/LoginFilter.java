import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginFilter
 */
public class LoginFilter implements Filter {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFilter() {
        
        // TODO Auto-generated constructor stub
    }

	public void destroy()
	{
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{

			

			String userid= request.getParameter("userid");

			if( userid != null){

			chain.doFilter(request, response);
			}
}
			public void init(FilterConfig fConfig) throws ServletException
			{

			// TODO Auto-generated method stub
			}


}