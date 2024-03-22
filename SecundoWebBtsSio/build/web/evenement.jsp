<%-- 
    Document   : connecte
    Created on : 20 nov. 2023, 10:49:00
    Author     : filia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connecte</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body class ="mt-4">
        
         <div class="d-flex justify-content-end">
            <a href="deconnexion" class="btn btn-dark btn-lg me-4" role="button" title="Deconnexion">Déconnexion</a>
         </div>
        
            <h1 class="mx-4">Bonjour ${user.nom}, </h1>
            
         <br>
        
        
         <button type="button" class="btn btn-primary btn-lg btn-block mx-4" data-bs-toggle = "modal" data-bs-target ="#creerevenement">Créer un Evenement</button>
         

            <div class="modal fade" id="creerevenement" tabindex="-1" >
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h1 class="modal-title fs-5">Creer un évenement</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <div class="modal-body">
                      <form method="POST" action="evenement">
                            <div class="form-outline mb-4">
                                <input type="text" name = "nomevenement" class="form-control form-control-lg" placeholder ="Nom de l'évènement" required/>
                            </div>
                            <div class="form-outline mb-4">
                                <input type="text" name = "descriptionevenement" class="form-control form-control-lg" placeholder ="Description de l'évènement" required/>
                            </div>
                        

                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Annuler</button>
                                <button type="submit" class="btn btn-primary">Créer l'évenement</button>
                            </div>
                      </form>
                  </div>
                  
                </div>
              </div>
            </div>
         
         <br><br>
         <hr>
         <br>
         <h2 class="mx-4 text-center"> Les Evenements de ce Groupe </h2>
         
         <div class="mx-5">
             <c:forEach items="${evenements}" var="evenement">
            <div>
                <form method="GET" action="evenement">
                   
                        <h1>
                            ${evenement.idEvenement}  ${evenement.nomEvenement}
                        </h1>
                        <h2>
                            ${evenement.descriptionEvenement}
                        </h2>

                </form>
                
            </div>
            </c:forEach>
            
         </div>
         
         
     
         
         
        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
