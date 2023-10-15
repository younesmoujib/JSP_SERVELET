<%-- 
    Document   : Home
    Created on : 10 oct. 2023, 23:38:15
    Author     : hp
--%>

<%@page import="ma.projet.entites.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <script src="https://cdn.tailwindcss.com"></script>
        <script>
            tailwind.config = {
                theme: {
                    screens: {
                        sm: '480px',
                        md: '768px',
                        lg: '976px',
                        xl: '1440px',
                    },
                    extend: {
                        colors: {
                            clifford: '#da373d',
                        }
                    }
                }
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <%! Client c; %>
        <% if( session==null ){
             response.sendRedirect("Login.jsp");
             
        }else{
          c=(Client)  session.getAttribute("Client");
        }
        %>
        <form class=" flex justify-end bg-sky-500 p-2" action="deconnexion">
            <input class="border-2 px-3 border-indigo-700 bg-indigo-600 text-white py-1  rounded-md hover:bg-transparent hover:text-indigo-700 font-semibold" type="submit" value="Deconnexion" />
        </form>
        <div class="px-7 py-10">
            <p class="text-8xl"> Bonjour ,<span class="text-sky-700 uppercase"><%=c.getNom() %></span></p>
        </div>
      
       
        
        
        
        
    </body>
</html>
