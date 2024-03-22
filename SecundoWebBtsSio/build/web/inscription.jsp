<%-- 
    Document   : inscription
    Created on : 20 nov. 2023, 10:47:58
    Author     : filia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
            <section class="vh-100 bg-image">
                <div class="mask d-flex align-items-center h-100 gradient-custom-3">
                  <div class="container h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                      <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                        <div class="card" style="border-radius: 15px; background-color: #9FB8F7;" >
                          <div class="card-body p-5">
                            <h2 class="text-uppercase text-center mb-5">Inscription</h2>

                            <form method="POST" action="inscription">

                              <div class="form-outline mb-4">
                                  <input value="${param['nom']}" type="text" name="nom" id="form3Example1cg" class="form-control form-control-lg" placeholder ="Nom" />
                              </div>

                              <div class="form-outline mb-4">
                                <input type="text" name="email" id="form3Example3cg" class="form-control form-control-lg" placeholder ="Nom d'utilisateur" />
                              </div>

                              <div class="form-outline mb-4">
                                <input type="password" name="password" id="form3Example4cg" class="form-control form-control-lg" placeholder ="Mot de passe" />
                              </div>
                                
                              <div class="form-outline mb-4">
                                <input type="password" name="verifpass" id="form3Example4cdg" class="form-control form-control-lg" placeholder ="Vérifier mot de passe" />
                              </div>
                                
                                <p class="text-center text-danger" style="letter-spacing: 3px"> ${msg} </p>
                              
                                <br><br>
                                
                              <div class="d-flex justify-content-center">
                                    <button type="submit" class="btn btn-dark btn-lg me-4"  title="S'inscrire">S'inscrire</button>
                                    <a href="connexion.jsp" class="btn btn-dark btn-lg me-4" role="button" title="Se Connecter">Se Connecter</a>
                              </div>

                            

                            </form>
                            
                            

                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
            </section>*
            
            
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
