function register() {
    var employeeCode = $("#txtEmployeeCode").val();
    var firstName = $("#txtFirstName").val();
    var password = $("#txtPassword").val();
    var lastName = $("#txtLastName").val();
    var address = $("#txtAddress").val();
    var nic = $("#txtNIC").val();
    var mobileNo = $("#txtMobileNo").val();
    var gender = $("input[name='gender']:checked").val();
    var designation = $("#designation").val();
    var dateOfBirth = $("#dateOfBirth").val();
    var status = $("#status").val();


    var employee={
        employeeCode:employeeCode,
        firstName:firstName,
        password:password,
        lastName:lastName,
        address:address,
        nic:nic,
        mobileNo:mobileNo,
        gender:gender,
        designation:designation,
        dateOfBirth:dateOfBirth,
        status:status
    }
    console.log(employeeCode,firstName,password,lastName,address,nic,mobileNo,gender,designation,dateOfBirth,status);

    $.ajax({

        url:"/Employee",
        method : "POST",
        contentType : "application/json",
        data : JSON.stringify(employee),

        success : function (res){
            if (res.status==200){
                alert(res.message);
                clearAll();
                loadAllCustomer();
            }else if (res.status==400){
                alert(res.data)
                clearAll();
            }else {
                alert(res.data);
                clearAll();
            }
        }


    });
}
