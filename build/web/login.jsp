<%-- 
    Document   : login
    Created on : 16 Nov, 2021, 9:41:20 AM
    Author     : harish shaikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="groshery.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="login-page">
            <div class="login-page2">
                <h1>Login</h1>
            <form method="post" action="log">
                <div class="login-con">
                    <span>Enter Email/Mobile number</span><br>
                    <input type="text" placeholder="Enter Mobile.no/Email" name="email" required><br><br><br>
                    
                    <span>Enter Password</span><br>
                    <input type="password" placeholder="Enter your password" name="password" required><br>
                </div>
                <div class="Forget">
                    <a href="#">Forget?</a>
                </div>
                <div class="login-team">
                    <p>By continuing, you agree to Groshery<a href="#"> Terms of Use</a> and <a href="#">Privacy Policy</a>.</p>
                </div>
                <div class="login-button">
                    <button type="submit">Login</button>
                </div>
                <div class="registration">
                    <a href="regist.jsp">New Registration</a>
                </div>
            </form>
            </div>
        </div>
    </body>
</html>
