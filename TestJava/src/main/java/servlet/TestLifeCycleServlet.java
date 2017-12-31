package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestLifeCycleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet!");
	}

	@Override
	public void destroy() {
		System.out.println("destroy!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init!");//只执行一次
	}

	public TestLifeCycleServlet() {
		System.out.println("constructor!");//只执行一次
	}

}
