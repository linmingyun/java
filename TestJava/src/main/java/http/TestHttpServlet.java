package http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestHttpServlet extends HttpServlet
{
    public TestHttpServlet()
    {
        super();
    }
    /**
     * Destruction of the servlet. <br>
     */
    public void destroy()
    {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }
    /**
     * The doGet method of the servlet. <br>
     * 
     * This method is called when a form has its tag value method equals to get.
     * 
     * @param request
     *            the request send by the client to the server
     * @param response
     *            the response send by the server to the client
     * @throws Exception
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        String test = request.getParameter("test");
        java.io.ObjectInputStream oi = null;
        java.io.ObjectOutputStream ot = null;
        try
        {
            oi = new java.io.ObjectInputStream(request.getInputStream());
            Object o = oi.readObject();
            oi.close();
            oi = null;

            String outObj = test + o.toString();
            ot = new java.io.ObjectOutputStream(response.getOutputStream());
            ot.writeObject(outObj);
            ot.flush();
            ot.close();
            ot = null;
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (oi != null)
                {
                    oi.close();
                    oi = null;
                }
                if (ot != null)
                {
                    ot.close();
                    ot = null;
                }
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        }
    /**
     * The doPost method of the servlet. <br>
     * 
     * This method is called when a form has its tag value method equals to
     * post.
     * 
     * @param request
     *            the request send by the client to the server
     * @param response
     *            the response send by the server to the client
     * @throws ServletException
     *             if an error occurred
     * @throws IOException
     *             if an error occurred
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }
    /**
     * Initialization of the servlet. <br>
     * 
     * @throws ServletException
     *             if an error occure
     */
    public void init() throws ServletException
    {
        // Put your code here
    }
}