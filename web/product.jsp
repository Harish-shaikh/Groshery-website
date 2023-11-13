<%-- 
    Document   : product
    Created on : 14 Nov, 2021, 8:57:54 PM
    Author     : harish shaikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="groshery.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <div class="product">
            <div class="product-form">
                <form id="form"  method="post" action="products" enctype="multipart/form-data" onsubmit="ab()">
                <div class="product-con">
                    <div class="product-detail">
                        <span>Product.Name</span><br><br>
                        <span>Product.Category</span><br><br>
                      <span>Product.detail </span><br><br>
                      <span>Product.price</span><br><br>
                      <span>Product.Image</span><br><br>
                    </div>
                    <div class="product-input">
                    <input type="text" id="na" name="name" placeholder="Enter product name" required><br><br>
                   
                    <input type="text" name="category" placeholder="Enter product Category" required><br><br>
                   
                    <input type="text" name="detail" placeholder="Enter product detail" required><br><br>
                    
                    <input type="text" name="price" placeholder="Enter product price" required><br><br>
                    
                    <input type="file" name="image"  required><br><br>
                    </div>
                   
                </div>
                <div class="product-button">
                    <button type="submit">Submit</button>
                </div>
            </form>
            </div>
        </div>
         <script>
            function ab()
            {
               
              
              let a=document.getElementById("na").value;
              if(n.length==0){
              alert("please enter data");
          }
            }
            document.getElementById("form").addEventListener("on");
            </script>
    </body>
</html>
