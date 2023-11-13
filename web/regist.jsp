<%-- 
    Document   : regist
    Created on : 22 Nov, 2021, 7:06:11 PM
    Author     : harish shaikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="groshery.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <div class="main">
            <div class="main-con">
                <form method="post" action="registar"  onsubmit=" return ab()" enctype="multipart/form-data">
                    <div class="registar">
                    <div class="regis-con">
                        <span>Name</span><br>
                        <input type="text" placeholder="Enter your name" name="name" id="names"><br>
                       <span id="cn" style="color:red ;font-size: 0.8rem;"></span> <br>
                        <span>D.O.B</span><br>
                         <input type="date" placeholder="Enter your dob " name="dob" id="dob"><br><br>
                         <span>Mobile</span><br>
                        <input type="text" placeholder="Enter your mobile"  id="mo" name="mobile"><br>
                        <span id="cm" style="color:red ;font-size: 0.8rem;"></span> <br>
                        <span>Password</span><br>
                        <input type="password" placeholder="Enter your password"  required name="password" id="pass1"><br>
                        <span id="cpp" style="color:red ;font-size: 0.8rem;"></span> <br>
                    </div>
                    <div class="regis-con">
                        <span>Email</span><br>
                        <input type="email" placeholder="Enter your email"   id="em" name="email"><br>
                         <span id="ce" style="color:red ;font-size: 0.8rem;"></span> <br>
                       
                        <span>Image</span><br>
                        <input type="file"   required name="image"><br><br>
                       
                        <span>Address</span><br>
                        <input type="text" placeholder="Enter your address" id="add" name="address" required><br><br>
                        <span>Confirm.Password</span><br>
                        <input type="text" placeholder="confirm password " name="confirm" id="pass2"><br>
                        <span id="cp" style="color:red ;font-size: 0.8rem;"></span> <br>
                    </div>
                        
                    </div>
                    <div class="sub-button">
                        <button type="submit">Submit</button>
                        </div>
                </form>
            </div>
        </div>
    <script>
        function ab(){
            //password
       let a=document.getElementById("pass1").value;
       let cp=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!])(?=.*[0-9])[a-zA-Z0-9!@#$%]{8,12}$/;
       if(cp.test(a)){
           
       }else{
           let cpps=document.getElementById("cpp").innerHTML="8 character";
           return false;
       }
       
       let b=document.getElementById("pass2").value;
       
       if(a.match(b)){
           
       }
       else{
           document.getElementById("cp").innerHTML="password not found";
           return false;
       }
//name
      var n=document.getElementById("names").value;
      
          var namepattern=/^[a-zA-Z ]{3,30}$/;
  if(namepattern.test(n)){
     
  }
  else{
      let cna=document.getElementById("cn").innerHTML="please enter valid name";
      return false;
  }
  //mobile number
        let m=document.getElementById("mo").value;
        let mobilepattern=/^[789]{1}[0-9]{9}$/;
        if(mobilepattern.test(m)){
            
        }
        else{
            let cm=document.getElementById("cm").innerHTML="please enter valid number";
            return false;
        }
        //Email
     let e=document.getElementById("em").value;
        let emailpattern=/^[a-z0-9]{1,}[@]{1}[a-z]{2,10}[.]{1}[a-z]{2,10}$/;
        if(emailpattern.test(e)){
            
        }
        else{
            let cem=document.getElementById("ce").innerHTML="Wrong email id";
            return false;
        }
       let f=document.getElementByID("add").value;
       
        let g=document.getElementById("dob").value;
 
        }
    </script>
    </body>
</html>
