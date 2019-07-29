<%@ page import="com.cake.bean.User" %>
<%@ page import="com.cake.bean.Product" %><%--
  Created by IntelliJ IDEA.
  User: root
  Date: 19-7-27
  Time: 下午8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String pathUrl = "http://120.79.249.199/";
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Single</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //Custom Theme files -->
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
    <!-- js -->
    <script src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
    <script src="js/imagezoom.js"></script>
    <!-- //js -->
    <!-- cart -->
    <script src="js/simpleCart.min.js"> </script>
    <!-- cart -->
    <!-- FlexSlider -->
    <script defer src="js/jquery.flexslider.js"></script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <script>
        // Can also be used with $(document).ready()
        $(window).load(function() {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
        });
    </script>
    <!--//FlexSlider -->
</head>
<body>
<%
    if (session.getAttribute("product") == null){
        out.print("<script> window.location.href = \"" + basePath + "index.jsp\";</script>");
    }
%>

<!--header-->

<%
    Product product = (Product) session.getAttribute("product");
%>
<div class="header">
    <div class="container">
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <h1 class="navbar-brand"><a  href="index.jsp">Yummy</a></h1>
            </div>
            <!--navbar-header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp" class="active">Home</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Birthday<b class="caret"></b></a>
                        <ul class="dropdown-menu multi-column columns-4">
                            <div class="row">
                                <div class="col-sm-3">
                                    <h4>By Relation</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Friend</a></li>
                                        <li><a class="list" href="products.jsp">Lover</a></li>
                                        <li><a class="list" href="products.jsp">Sister</a></li>
                                        <li><a class="list" href="products.jsp">Brother</a></li>
                                        <li><a class="list" href="products.jsp">Kids</a></li>
                                        <li><a class="list" href="products.jsp">Parents</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Flavour</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Chocolate</a></li>
                                        <li><a class="list" href="products.jsp">Mixed Fruit</a></li>
                                        <li><a class="list" href="products.jsp">Butterscotch</a></li>
                                        <li><a class="list" href="products.jsp">Strawberry</a></li>
                                        <li><a class="list" href="products.jsp">Vanilla</a></li>
                                        <li><a class="list" href="products.jsp">Eggless Cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Theme</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Heart shaped</a></li>
                                        <li><a class="list" href="products.jsp">Cartoon Cakes</a></li>
                                        <li><a class="list" href="products.jsp">2-3 Tier Cakes</a></li>
                                        <li><a class="list" href="products.jsp">Square shape</a></li>
                                        <li><a class="list" href="products.jsp">Round shape</a></li>
                                        <li><a class="list" href="products.jsp">Photo cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>Weight</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">1 kG</a></li>
                                        <li><a class="list" href="products.jsp">1.5 kG</a></li>
                                        <li><a class="list" href="products.jsp">2 kG</a></li>
                                        <li><a class="list" href="products.jsp">3 kG</a></li>
                                        <li><a class="list" href="products.jsp">4 kG</a></li>
                                        <li><a class="list" href="products.jsp">Large</a></li>
                                    </ul>
                                </div>
                            </div>
                        </ul>
                    </li>
                    <li class="dropdown grid">
                        <a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Wedding<b class="caret"></b></a>
                        <ul class="dropdown-menu multi-column columns-4">
                            <div class="row">
                                <div class="col-sm-3">
                                    <h4>By Relation</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Friend</a></li>
                                        <li><a class="list" href="products.jsp">Lover</a></li>
                                        <li><a class="list" href="products.jsp">Sister</a></li>
                                        <li><a class="list" href="products.jsp">Brother</a></li>
                                        <li><a class="list" href="products.jsp">Kids</a></li>
                                        <li><a class="list" href="products.jsp">Parents</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Flavour</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Chocolate</a></li>
                                        <li><a class="list" href="products.jsp">Mixed Fruit</a></li>
                                        <li><a class="list" href="products.jsp">Butterscotch</a></li>
                                        <li><a class="list" href="products.jsp">Strawberry</a></li>
                                        <li><a class="list" href="products.jsp">Vanilla</a></li>
                                        <li><a class="list" href="products.jsp">Eggless Cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Theme</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Heart shaped</a></li>
                                        <li><a class="list" href="products.jsp">Cartoon Cakes</a></li>
                                        <li><a class="list" href="products.jsp">2-3 Tier Cakes</a></li>
                                        <li><a class="list" href="products.jsp">Square shape</a></li>
                                        <li><a class="list" href="products.jsp">Round shape</a></li>
                                        <li><a class="list" href="products.jsp">Photo cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>Weight</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">1 kG</a></li>
                                        <li><a class="list" href="products.jsp">1.5 kG</a></li>
                                        <li><a class="list" href="products.jsp">2 kG</a></li>
                                        <li><a class="list" href="products.jsp">3 kG</a></li>
                                        <li><a class="list" href="products.jsp">4 kG</a></li>
                                        <li><a class="list" href="products.jsp">Large</a></li>
                                    </ul>
                                </div>
                            </div>
                        </ul>
                    </li>
                    <li class="dropdown grid">
                        <a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Special Offers <b class="caret"></b></a>
                        <ul class="dropdown-menu multi-column columns-4">
                            <div class="row">
                                <div class="col-sm-3">
                                    <h4>By Relation</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Friend</a></li>
                                        <li><a class="list" href="products.jsp">Lover</a></li>
                                        <li><a class="list" href="products.jsp">Sister</a></li>
                                        <li><a class="list" href="products.jsp">Brother</a></li>
                                        <li><a class="list" href="products.jsp">Kids</a></li>
                                        <li><a class="list" href="products.jsp">Parents</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Flavour</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Chocolate</a></li>
                                        <li><a class="list" href="products.jsp">Mixed Fruit</a></li>
                                        <li><a class="list" href="products.jsp">Butterscotch</a></li>
                                        <li><a class="list" href="products.jsp">Strawberry</a></li>
                                        <li><a class="list" href="products.jsp">Vanilla</a></li>
                                        <li><a class="list" href="products.jsp">Eggless Cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Theme</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">Heart shaped</a></li>
                                        <li><a class="list" href="products.jsp">Cartoon Cakes</a></li>
                                        <li><a class="list" href="products.jsp">2-3 Tier Cakes</a></li>
                                        <li><a class="list" href="products.jsp">Square shape</a></li>
                                        <li><a class="list" href="products.jsp">Round shape</a></li>
                                        <li><a class="list" href="products.jsp">Photo cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>Weight</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.jsp">1 kG</a></li>
                                        <li><a class="list" href="products.jsp">1.5 kG</a></li>
                                        <li><a class="list" href="products.jsp">2 kG</a></li>
                                        <li><a class="list" href="products.jsp">3 kG</a></li>
                                        <li><a class="list" href="products.jsp">4 kG</a></li>
                                        <li><a class="list" href="products.jsp">Large</a></li>
                                    </ul>
                                </div>
                            </div>
                        </ul>
                    </li>

                </ul>
                <!--/.navbar-collapse-->
            </div>
            <!--//navbar-header-->
        </nav>
        <div class="header-info">
            <div class="header-right search-box">
                <a href="#"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
                <div class="search">
                    <form class="navbar-form">
                        <input type="text" class="form-control">
                        <button type="submit" class="btn btn-default" aria-label="Left Align">
                            Search
                        </button>
                    </form>
                </div>
            </div>
            <div class="header-right login">
                <a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
                <div id="loginBox">
                    <%

                        if (session.getAttribute("user") == null){
                            out.print("<form action=\"/user/login\" method=\"post\" id=\"loginForm\">\n" +
                                    "        <fieldset id=\"body\">\n" +
                                    "            <fieldset>\n" +
                                    "                <label for=\"email\">Email Address</label>\n" +
                                    "                <input type=\"text\" name=\"email\" id=\"email\">\n" +
                                    "            </fieldset>\n" +
                                    "            <fieldset>\n" +
                                    "                <label for=\"password\">Password</label>\n" +
                                    "                <input type=\"password\" name=\"password\" id=\"password\">\n" +
                                    "            </fieldset>\n" +
                                    "            <fieldset>\n" +
                                    "                <label for=\"password\">CAPTCHA</label>\n" +
                                    "                <input type=\"text\" name=\"vcode\" id=\"CAPTCHA\"  style=\"width: 67%; margin-left: 0px\" >\n" +
                                    "                <span style=\"width: 50%;\"><img id=\"loginCode\" src=\"\" width=\"80\" height=\"30\"></span>\n" +
                                    "                <script>\n" +
                                    "                   $(document).ready(function () {\n" +
                                    "                        $(\"#loginCode\").prop(\"src\", \"/image/loginVcode?time=\" + (new Date()).getTime());\n" +
                                    "                        $(\"#loginCode\").click(function () {\n" +
                                    "                            $(\"#loginCode\").prop(\"src\", \"/image/loginVcode?time=\" + (new Date()).getTime());\n" +
                                    "                        });\n" +
                                    "                   })\n" +
                                    "               </script>" +
                                    "            </fieldset>\n" +
                                    "            <input type=\"submit\" id=\"login\" value=\"Sign in\">\n" +
                                    "            <label for=\"checkbox\"><input type=\"checkbox\" id=\"checkbox\"> <i>Remember me</i></label>\n" +
                                    "        </fieldset>\n" +
                                    "        <p>New User ? <a class=\"sign\" href=\"account.jsp\">Sign Up</a> <span><a href=\"\" data-toggle=\"modal\" data-target=\"#exampleModal\" data-whatever=\"@mdo\">Forgot your password?</a></span></p>\n" +
                                    "    </form>\n");
                        } else {
                            User user = (User) session.getAttribute("user");
                            out.print("<form action=\"/user/loginOut\" method=\"post\" id=\"loginForm\">\n" +
                                    "        <fieldset id=\"body\">\n" +
                                    "            <fieldset>\n" +
                                    "                <label for=\"email\">Email Adress</label>"+
                                    "                <label for=\"email\"> " + user.getEmail() + " \n" +
                                    "            </fieldset>\n" +
                                    "            <input type=\"submit\" id=\"login\" value=\"Sign out\">\n" +
                                    "        </fieldset>\n" +
                                    "    </form>\n");
                        }
                    %>
                </div>
            </div>
            <div class="header-right cart">
                <a href="#"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
                <div class="cart-box">
                    <h4><a href="checkout.html">
                        <span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span>)
                    </a></h4>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
                    <div class="clearfix"> </div>
                </div>

                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="exampleModalLabel" style="color: #F07818">find your password</h4>
                            </div>
                            <div class="modal-body">
                                <form id="findpassword">
                                    <div class="form-group">
                                        <label for="recipient-name" class="control-label" style="color: #F07818">email:</label>
                                        <input type="text" class="form-control" id="recipient-name">
                                    </div>
                                    <div class="form-group">
                                        <label for="message-text" class="control-label" style="color: #F07818">CAPTCHA:</label>
                                        <input type="text" class="form-control" id="message-text" ></textarea>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" >Checkout</button>
                                <button type="button" class="btn btn-primary">Send message</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--//header-->
<!--//single-page-->
<div class="single">
    <div class="container">
        <div class="single-grids">
            <div class="col-md-4 single-grid">
                <div class="flexslider">
                    <ul class="slides">
                        <li data-thumb="http://120.79.249.199/<%=product.getPhotopath()%>">
                            <div class="thumb-image"> <img src="http://120.79.249.199/<%=product.getPhotopath()%>" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="http://120.79.249.199/<%=product.getPhotopath()%>">
                            <div class="thumb-image"> <img src="http://120.79.249.199/<%=product.getPhotopath()%>" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="http://120.79.249.199/<%=product.getPhotopath()%>">
                            <div class="thumb-image"> <img src="http://120.79.249.199/<%=product.getPhotopath()%>" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-4 single-grid simpleCart_shelfItem">
                <h3>Yummy freshly baked Blackforest Cake 1 Kg! with blends of chocochips</h3>
                <p>Cake cutting is one of the most wonderful ways of celebrating a special moment. What better way to celebrate than with a rich and mouth watering chocochips cake</p>
                <ul class="size">
                    <h3>Size</h3>
                    <li><a href="#">1 KG</a></li>
                    <li><a href="#">2 KG</a></li>
                    <li><a href="#">3 KG</a></li>
                    <li><a href="#">4 KG</a></li>
                </ul>
                <ul class="size">
                    <h3>2-3 Tier Cakes</h3>
                    <li><a href="#">1 Step</a></li>
                    <li><a href="#">2 Step</a></li>
                    <li><a href="#">3 Step</a></li>
                </ul>
                <div class="galry">
                    <div class="prices">
                        <h5 class="item_price" id="sumPrice" >$<%= product.getPrice() %></h5>
                    </div>

                    <div class="clearfix"></div>
                </div>
                <p class="qty"> Qty :  </p><input onchange="changeProductNumber()" min="1" type="number" id="quantity" name="quantity" value="1" class="form-control input-small">
                <script>
                    function changeProductNumber(){
                        var num = $("#quantity").val();
                        num = (parseInt(num)) * (parseInt("<%= product.getPrice() %>"));
                        $("#sumPrice").empty();
                        $("#sumPrice").text("$"+ num);
                    }
                </script>
                <div class="btn_form">
                    <a href="javascript:addCar()" class="add-cart item_add" >ADD TO CART</a>
                </div>
                <div class="tag">
                    <p>Category : <a href="#"> Cakes</a></p>
                    <p>Tag : <a href="#"> Lorem ipsum </a></p>
                </div>
            </div>
            <div class="col-md-4 single-grid1">
                <h2>Account</h2>
                <ul>
                    <li><a href="#">Offers</a></li>
                    <li><a href="products.jsp">New products</a></li>
                    <li><a href="account.jsp">Register</a></li>
                    <li><a href="account.jsp">Forgot Your Password</a></li>
                    <li><a href="account.jsp">My account</a></li>
                    <li><a href="contact.jsp">Address</a></li>
                    <li><a href="checkout.html">wishlist</a></li>
                    <li><a href="checkout.html">Order history</a></li>
                    <li><a href="#">Downloads</a></li>
                    <li><a href="#">Reward points</a></li>
                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!-- collapse -->
<div class="collpse tabs">
    <div class="container">
        <div class="panel-group collpse" id="accordion" role="tablist" aria-multiselectable="true">

        </div>
    </div>
</div>
<!--//collapse -->
<!--related-products-->
<div class="related-products">
    <div class="container">
        <h3>Related Products</h3>
        <div id="product-model-sec" class="product-model-sec single-product-grids">
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!--related-products-->
<!--footer-->
<div class="footer">
    <div class="container">
        <div class="footer-grids">
            <div class="col-md-2 footer-grid">
                <h4>company</h4>
                <ul>
                    <li><a href="products.jsp">products</a></li>
                    <li><a href="#">Work Here</a></li>
                    <li><a href="#">Team</a></li>
                    <li><a href="#">Happenings</a></li>
                    <li><a href="#">Dealer Locator</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-grid">
                <h4>service</h4>
                <ul>
                    <li><a href="#">Support</a></li>
                    <li><a href="#">FAQ</a></li>
                    <li><a href="#">Warranty</a></li>
                    <li><a href="contact.html">Contact Us</a></li>
                </ul>
            </div>
            <div class="col-md-3 footer-grid">
                <h4>order & returns</h4>
                <ul>
                    <li><a href="#">Order Status</a></li>
                    <li><a href="#">Shipping Policy</a></li>
                    <li><a href="#">Return Policy</a></li>
                    <li><a href="#">Digital Gift Card</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-grid">
                <h4>legal</h4>
                <ul>
                    <li><a href="#">Privacy</a></li>
                    <li><a href="#">Terms and Conditions</a></li>
                    <li><a href="#">Social Responsibility</a></li>
                </ul>
            </div>
            < class="col-md-3 footer-grid icons">
            <h4>Connect with Us</h4>
            <ul>
                <li><a href="#"><img src="images/i1.png" alt=""/>Follow us on Facebook</a></li>
                <li><a href="#"><img src="images/i2.png" alt=""/>Follow us on Twitter</a></li>
                <li><a href="#"><img src="images/i3.png" alt=""/>Follow us on Google-plus</a></li>
                <li><a href="#"><img src="images/i4.png" alt=""/>Follow us on Pinterest</a></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
</div>
<!--footer-->
<div class="footer-bottom">
    <div class="container">
        <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
</div>
<script>
    function createProductModel(url, imgUrl, price, afterPrice, disc, productName){
        var $a = $("<a href='" + url + "'></a>");
        var $aDiv = $("<div class='more-product'><span> </span></span></div>");
        var $aDivDiv = $("<div class='product-img b-link-stripe b-animate-go  thickbox'></div>");
        var $aDivDivImg = $("<img src=\"" + imgUrl + "\" class=\"img-responsive\" alt=\"\">")
        var $aDivDivDiv = $("<div class='b-wrapper'><h4 class=\"b-animate b-from-left  b-delay03\"><button tag='but'>View</button></h4></div>");
        $aDivDivImg.appendTo($aDivDiv);
        $aDivDivDiv.appendTo($aDivDiv);
        $aDivDiv.appendTo($aDiv);
        $aDiv.appendTo($a);

        var $div = $("<div class=\"product-info simpleCart_shelfItem\"></div>");
        var $divDiv = $("<div class=\"product-info-cust prt_name\"></div>");
        var $divDivH4 = $("<h4>" + productName + "</h4>");
        var $divDivSpan = $("<span class=\"item_price\">$" + price + "</span>");
        var $divDivDiv = $("<div class=\"ofr\"><p class=\"pric1\"><del>$" + afterPrice + "</del></p>\n<p class=\"disc\">[" + disc + "% Off]</p></div>");
        var $divDivDiv2 = $("<div class=\"clearfix\"> </div>");
        $divDivH4.appendTo($divDiv);
        $divDivSpan.appendTo($divDiv);
        $divDivDiv.appendTo($divDiv);
        $divDivDiv2.appendTo($divDiv);
        $divDiv.appendTo($div);

        var $parent = $("<div class=\"product-grid single-product\">");
        $a.appendTo($parent);
        $div.appendTo($parent);
        $parent.appendTo($("#product-model-sec"));
    }
    $(document).ready(function () {
        // for (var i=0; i<4; i++){
        //     createProductModel("single.html", "images/m1.png", 2000, 2300, 15, "product #1");
        // }
        $.ajax({
            url : "<%= basePath%>/product/randomProduct?num=4",
            type : "post",
            dataType : "json",
            success : function (result) {
                console.log(result.extend.products);
                for(var i=0; i<result.extend.products.length; i++){
                    var price =  result.extend.products[i].price;
                    var discount = result.extend.products[i].discount;
                    var realPrice = (parseInt(price))* (parseInt(discount)) / 100;
                    createProductModel( "<%=basePath %>toSingle?productId=" + result.extend.products[i].id, "http://120.79.249.199/"+result.extend.products[i].photopath, realPrice, price, discount, result.extend.products[i].name);
                }
            },
            error : function (e) {
                alert("连接失败");
            }
        });
    });
    function addCar(){
        <%
            if (session.getAttribute("user") == null)
                out.print("window.location.href=\"account.jsp\"");
            User user = (User) session.getAttribute("user");
        %>
        console.log("<%= user.getId()%>");
        console.log("<%= product.getId()%>");
        console.log($("#quantity").val());

        $.ajax({
            url : "/addCar",
            data : {
                "userid" : "<%= user.getId()%>",
                "productid" : "<%= product.getId()%>",
                "number" : $("#quantity").val()
            },
            dataType: "JSON",
            success : function (result) {
                alert("添加成功");
            },
            error : function (e) {
                alert("连接失败");
            }
        })
    }
</script>
</body>
</html>