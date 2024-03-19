<%-- 
    Document   : register
    Created on : Mar 19, 2024, 2:14:04 PM
    Author     : upeksha_k
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Register</title>
</head>
<body>
<section class="h-100%">
    <div class="container vh-75">
        <div class="row d-flex justify-content-center align-items-center vh-100">
            <div class="col-lg-12 col-xl-11">
                <div class="card text-black" style="border-radius: 25px;">
                    <div class="card-body p-md-2">
                        <div class="row justify-content-center">
                            <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>

                                <form class="mx-1 mx-md-4">

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="text" id="employeeCode" name="employeeCode" class="form-control" />
                                            <label class="form-label" for="employeeCode">Employee Code</label>
                                        </div>
                                    </div>
                                    
                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="name" id="firstName" class="form-control" />
                                            <label class="form-label" for="firstName">First Name</label>
                                        </div>
                                    </div>
                                    
                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="password" id="userPassword" class="form-control" />
                                            <label class="form-label" for="userPassword">Password</label>
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="name" id="lastName" class="form-control" />
                                            <label class="form-label" for="lastName">Last Name</label>
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="text" id="address" class="form-control" />
                                            <label class="form-label" for="address">Address</label>
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="text" id="NIC" class="form-control" />
                                            <label class="form-label" for="NIC">NIC </label>
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="number" id="mobileNo" class="form-control" />
                                            <label class="form-label" for="mobileNo">Mobile No </label>
                                        </div>
                                    </div>

                                    <label class="form-label" for="mobileNo">Gender </label>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-check form-check-inline">
                                            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                                            <label class="form-check-label" for="inlineRadio1">Male</label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                                            <label class="form-check-label" for="inlineRadio2">Female</label>
                                        </div>
                                    </div>

                                    <div class="form-group ">
                                        <label for="designation">Designation:</label>
                                        <select class="form-control" id="designation">
                                            <option value="">Select Designation</option>
                                            <option value="developer">Developer</option>
                                            <option value="designer">Designer</option>
                                            <option value="manager">Manager</option>
                                        </select>
                                    </div>

                                    <br>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="mb-3">
                                            <input class="form-control" type="file" id="formFileMultiple" multiple>
                                            <label for="formFileMultiple" class="form-label">Profile Image</label>
                                        </div>
                                    </div>


                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="date" id="dateOfBirth" class="form-control" />
                                            <label class="form-label" for="dateOfBirth">Date of birth </label>
                                        </div>
                                    </div>


                                    <div class="form-group ">
                                        <label for="designation">Status:</label>
                                        <select class="form-control" id="status">
                                            <option value="">default</option>
                                            <option value="developer">Active</option>
                                            <option value="designer">Inactive</option>
                                        </select>
                                    </div>

                                    <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                        <button type="button" class="btn btn-primary btn-lg" id="btnRegister">Register</button>
                                    </div>

                                </form>

                            </div>
                            <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
                                     class="img-fluid" alt="Sample image">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>