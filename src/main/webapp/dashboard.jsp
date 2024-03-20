<%--
    Document   : dashboard
    Created on : Mar 19, 2024, 2:19:08 PM
    Author     : upeksha_k
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Dashboard</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #7D82E833">
    <a class="navbar-brand" href="dashboard.jsp">Employee</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="dashboard.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="employee.jsp">Employee</a>
            </li>
        </ul>
    </div>
</nav>

<section class="mx-1 mx-md-4" style="background-color: #eeeeee; justify-content: center">
    <br><br>
    <table class="table table-dark" id="tblUser">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Employee Code</th>
            <th scope="col">Full Name</th>
            <th scope="col">Phone Number</th>
            <th scope="col">NIC</th>
            <th scope="col">Designation</th>
            <th scope="col">Status</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody id="userTable">
        <tr>
            <th scope="row">1</th>
            <td>E0001</td>
            <td>Mark</td>
            <td>0711111111</td>
            <td>111111111111</td>
            <td>.........</td>
            <td>.........</td>
            <td>
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Action
                </button>
            </td>
        </tr>
        <!-- Add more rows dynamically if needed -->
        </tbody>
    </table>


    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">

                    <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                            <input type="text" id="txtEmployeeNo" name="employeeNo" class="form-control" />
                            <label class="form-label" for="txtEmployeeNo">Employee No </label>
                        </div>
                    </div>

                    <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                            <input type="text" id="txtGender" name="gender" class="form-control" />
                            <label class="form-label" for="txtGender">Gender </label>
                        </div>
                    </div>

                    <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                            <input type="text" id="txtDateOfBirth" name="dateOfBirth" class="form-control" />
                            <label class="form-label" for="txtDateOfBirth">Date of Birth </label>
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Bootstrap JavaScript file -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
