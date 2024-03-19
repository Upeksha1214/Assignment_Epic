<%-- 
    Document   : employee
    Created on : Mar 19, 2024, 2:17:02 PM
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
                <button>Print</button>
            </td>
        </tr>
        <!-- Add more rows dynamically if needed -->
        </tbody>
    </table>
</section>
</body>
</html>

