<%-- 
    Document   : Inscription
    Created on : 10 oct. 2023, 12:06:21
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
      <form method="POST" action="Inscription" class="flex justify-center items-center h-screen bg-indigo-600">
        <div class="w-96 p-6 shadow-lg bg-white rounded-md">
            <h1 class="text-3xl block text-center font-semibold"><i class="fa-solid fa-user"></i>Inscription </h1>
            <hr class="mt-3">
            <div class="mt-3">
                <label  class="block text-base mb-2">Nom </label>
                <input type="text"  name="nom" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" placeholder="Entrer le nom..." />
            </div>
            <div class="mt-3">
                <label  class="block text-base mb-2">Prenom</label>
                <input type="text"  name="prenom" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" placeholder="Entrer le prenom..." />
            </div>
             <div class="mt-3">
                <label for="password" class="block text-base mb-2">Email</label>
                <input type="email" name="email" id="password" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" placeholder="Entrer l'email..." />
            </div>
             <div class="mt-3">
                <label class="block text-base mb-2">Date de naissance</label>
                <input type="date" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" />
            </div>
             <div class="mt-3">
                <label  class="block text-base mb-2">Mot de passe </label>
                <input name="password" class="border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600" placeholder="Entrer le mot de passe " />
            </div>
            <div class="mt-3 flex justify-between items-center">
               
                
            </div>
            <div class="mt-5">
                <button type="submit" class="border-2 border-indigo-700 bg-indigo-700 text-white py-1 w-full rounded-md hover:bg-transparent hover:text-indigo-700 font-semibold"><i class="fa-solid fa-right-to-bracket"></i>&nbsp;&nbsp;Enregistrer</button>
            </div>
        </div>
    </form>
    
</body>
    </body>
</html>
