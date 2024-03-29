<%-- 
    Document   : index
    Created on : Mar 19, 2024, 2:11:51 PM
    Author     : upeksha_k
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Login</title>
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-1 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">

                        <div class="mb-md-5 mt-md-4 pb-2">

                            <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
                            <p class="text-white-50 mb-5">Please enter your login and password!</p>

                            <div class="form-outline form-white mb-2">
                                <input type="email" id="typeEmailX" class="form-control form-control-lg" />
                                <label class="form-label" for="typeEmailX">User Name</label>
                            </div>

                            <div class="form-outline form-white mb-2">
                                <input type="password" id="typePasswordX" class="form-control form-control-lg" />
                                <label class="form-label" for="typePasswordX">Password</label>
                            </div>
                            <!--
                                                        <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="#!">Forgot password?</a></p>
                            -->
                            <button class="btn btn-outline-light btn-lg px-5" type="submit">Login</button>

                        </div>

                        <div>
                            <p class="mb-1">Don't have an account? <a href="./register.jsp" class="text-white-50 fw-bold">Sign Up</a>
                            </p>
                        </div>

                        <div>
                            <p class="mb-1">Don't have an account? <a href="dashboard.jsp" class="text-white-50 fw-bold">AAAA</a>
                            </p>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>

