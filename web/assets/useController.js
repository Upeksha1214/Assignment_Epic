function addUsers() {
    var id=$("#txtUserId").val();
    var name=$("#txtUserName").val();
    var email=$("#txtUserEmail").val();
    var phoneNumber=$("#txtPhoneNumber").val();
    var password=$("#txtUserPassword").val();

    var user ={
        id:id,
        name:name,
        email:email,
        phoneNUmber:phoneNumber,
        password:password,
    }

    console.log(id,name,email,phoneNumber,password);

    $.ajax({

        url:"user",
        method : "POST",
        contentType : "application/json",
        data : JSON.stringify(user),

        success : function (res){
            if (res.status==200){
                alert(res.message);

            }else if (res.status==400){
                alert(res.data)

            }else {
                alert(res.data);

            }
        }


    });

    $("#btnRegister").click(function (){
        clearAll();
    });
}


function clearAll(){
    $("#txtUserId").val('');
    $("#txtUserName").val('');
    $("#txtUserEmail").val('');
    $("#txtPhoneNumber\n").val('');
    $("#txtUserPassword\n").val('');
}

