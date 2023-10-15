<%-- 
    Document   : Login
    Created on : 10 oct. 2023, 11:35:46
    Author     : hp
--%>

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
        <form method="POST" action="auth" class="flex justify-center items-center h-screen bg-indigo-600">
        <div class="w-96 p-6 shadow-lg bg-white rounded-md">
            <h1 class="text-3xl block text-center font-semibold"><i class="fa-solid fa-user"></i> Login</h1>
            <hr class="mt-3">
            <div class="mt-3">
                <label class="block text-base mb-2">Nom </label>
                <input type="text" name="email" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" placeholder="Entrer le password..." />
            </div>
            <div class="mt-3">
                <label  class="block text-base mb-2">Password</label>
                <input type="password" name="password" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" placeholder="Entrer le password..." />
            </div>
            <div class="mt-3 flex justify-between items-center">
                <div>
                   
                   <a href="Inscription.jsp" class="text-indigo-800 font-semibold">Inscrit?</a>
                </div>
                <div>
                    <a href="Forgetpassword.jsp" class="text-indigo-800 font-semibold">Forgot Password?</a>
                </div>
            </div>
            <div class="mt-5">
                <button type="submit" class="border-2 border-indigo-700 bg-indigo-700 text-white py-1 w-full rounded-md hover:bg-transparent hover:text-indigo-700 font-semibold"><i class="fa-solid fa-right-to-bracket"></i>&nbsp;&nbsp;Login</button>
            </div>
        </div>
    </form>
    
</body>
</html>
