package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newCode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <script>\n");
      out.write("            tailwind.config = {\n");
      out.write("                theme: {\n");
      out.write("                    screens: {\n");
      out.write("                        sm: '480px',\n");
      out.write("                        md: '768px',\n");
      out.write("                        lg: '976px',\n");
      out.write("                        xl: '1440px',\n");
      out.write("                    },\n");
      out.write("                    extend: {\n");
      out.write("                        colors: {\n");
      out.write("                            clifford: '#da373d',\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <form method=\"POST\" action=\"ForgotPassword\" class=\"flex justify-center items-center h-screen bg-indigo-600\">\n");
      out.write("        <div class=\"w-96 p-6 shadow-lg bg-white rounded-md\">\n");
      out.write("            <h1 class=\"text-3xl block text-center font-semibold\"><i class=\"fa-solid fa-user\"></i> Login</h1>\n");
      out.write("            <hr class=\"mt-3\">\n");
      out.write("            <div class=\"mt-3\">\n");
      out.write("                <label class=\"block text-base mb-2\">Code </label>\n");
      out.write("                <input type=\"text\" name=\"code\" class=\"border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600\" placeholder=\"Entrer le code ...\" />\n");
      out.write("            </div>\n");
      out.write("            ");

                String errorMsg = (String) request.getAttribute("errorMsg");
                if (errorMsg != null) {
            
      out.write("\n");
      out.write("            <div class=\"mt-3 text-red-500\">");
      out.print( errorMsg);
      out.write("</div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"mt-5\">\n");
      out.write("               <button type=\"submit\" name=\"submit\" class=\"border-2 border-indigo-700 bg-indigo-700 text-white py-1 w-full rounded-md hover:bg-transparent hover:text-indigo-700 font-semibold\"><i class=\"fa-solid fa-right-to-bracket\"></i>&nbsp;&nbsp;valider</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
