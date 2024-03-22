<%-- 
    Document   : connexion
    Created on : 20 nov. 2023, 10:47:44
    Author     : filia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        
        
        <section class="vh-100";">
            <div class="container py-5 h-100">
              <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                  <div class="card shadow-2-strong" style="border-radius: 0.5rem; background-color: #9FB8F7;">
                    <div class="card-body p-5 text-center">

                        <form method="POST" action="connexion">
                            <h3 class="mb-5" style = "color: black;">Connexion</h3>

                            <div class="form-outline mb-4">
                                <input type="text" name = "email" class="form-control form-control-lg" placeholder ="Nom d'utilisateur" required/>
                            </div>

                            <div class="form-outline mb-4">
                                <input type="password" name="password" class="form-control form-control-lg" placeholder = "Mot de passe" required/>
                            </div>
                            
                            <p class="text-center text-danger"> ${msg} </p>


                            <div class="d-grid gap-2">
                                <button class="btn btn-dark btn-lg" type="submit">Se Connecter</button>
                            </div>
                        </form>
                      
                    </div>
                  </div>
                </div>
              </div>
            </div>
        </section>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
