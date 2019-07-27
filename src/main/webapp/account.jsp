<%@ page import="com.cake.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: root
  Date: 19-7-26
  Time: 下午3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <!-- Custom Theme files -->
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

    <script>
        $.fn.serializeObject = function(){
            var o={};
            var a=this.serializeArray();
            $.each(a,function() {
                if (o[this.name]) {
                    if(!o[this.name].push){
                        o[this.name] = [o[this.name]];
                    }
                    o[this.name].push(this.value || '');
                } else{
                    o[this.name]
                    this.value || '';
                }
            });
            return o;
        };
        var formObject = $("#personinform").serializeObject(),
            formArray=$("#personinform").serializeArray();

    </script>
    <!-- //js -->
    <!-- cart -->
    <script src="js/simpleCart.min.js"> </script>


    <script>
        function validate(){
            var pwd1= document.getElementById("pwd").value;
            var pwd2= document.getElementById("pwd1").value;
            if(pwd1 == pwd2){
                document.getElementById("tishi").innerHTML="<label style=\"color: green ; font-size: 2em; font-family: Marvel-Regular \">The two passwords match</label>";
                document.getElementById("button").disabled = false;
            }else{
                document.getElementById("tishi").innerHTML="<label style=\"color: red ; font-size: 2em;font-family: Marvel-Regular\">The two passwords do not match</label>";
                document.getElementById("button").disabled = true;
            }
        }
        function check(){
            var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
            var obj = document.getElementById("mail"); //要验证的对象
            if(!reg.test(obj.value)){ //正则验证不通过，格式不对
                $("#mailJd").text("邮箱格式验证不通过!");
                $(obj).parent().addClass("has-error");
                return false;
            }else{
                $("#mailJd").text("");
                $(obj).parent().removeClass("has-error");
                $(obj).parent().addClass("has-success");
                return true;
            }
        }
        function addInputClass(name){
            var $inp = $("input[name=\"" + name + "\"]");
            if ($inp.val() == ""){
                $inp.parent().addClass("has-error");
            } else {
                $inp.parent().removeClass("has-error");
                $inp.parent().addClass("has-success");
            }
        }
    </script>
    <!-- cart -->
</head>
<body>
<!--header-->
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
                <h1 class="navbar-brand"><a  href="index.html">Yummy</a></h1>
            </div>
            <!--navbar-header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="index.html" class="active">Home</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Birthday<b class="caret"></b></a>
                        <ul class="dropdown-menu multi-column columns-4">
                            <div class="row">
                                <div class="col-sm-3">
                                    <h4>By Relation</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Friend</a></li>
                                        <li><a class="list" href="products.html">Lover</a></li>
                                        <li><a class="list" href="products.html">Sister</a></li>
                                        <li><a class="list" href="products.html">Brother</a></li>
                                        <li><a class="list" href="products.html">Kids</a></li>
                                        <li><a class="list" href="products.html">Parents</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Flavour</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Chocolate</a></li>
                                        <li><a class="list" href="products.html">Mixed Fruit</a></li>
                                        <li><a class="list" href="products.html">Butterscotch</a></li>
                                        <li><a class="list" href="products.html">Strawberry</a></li>
                                        <li><a class="list" href="products.html">Vanilla</a></li>
                                        <li><a class="list" href="products.html">Eggless Cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Theme</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Heart shaped</a></li>
                                        <li><a class="list" href="products.html">Cartoon Cakes</a></li>
                                        <li><a class="list" href="products.html">2-3 Tier Cakes</a></li>
                                        <li><a class="list" href="products.html">Square shape</a></li>
                                        <li><a class="list" href="products.html">Round shape</a></li>
                                        <li><a class="list" href="products.html">Photo cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>Weight</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">1 kG</a></li>
                                        <li><a class="list" href="products.html">1.5 kG</a></li>
                                        <li><a class="list" href="products.html">2 kG</a></li>
                                        <li><a class="list" href="products.html">3 kG</a></li>
                                        <li><a class="list" href="products.html">4 kG</a></li>
                                        <li><a class="list" href="products.html">Large</a></li>
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
                                        <li><a class="list" href="products.html">Friend</a></li>
                                        <li><a class="list" href="products.html">Lover</a></li>
                                        <li><a class="list" href="products.html">Sister</a></li>
                                        <li><a class="list" href="products.html">Brother</a></li>
                                        <li><a class="list" href="products.html">Kids</a></li>
                                        <li><a class="list" href="products.html">Parents</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Flavour</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Chocolate</a></li>
                                        <li><a class="list" href="products.html">Mixed Fruit</a></li>
                                        <li><a class="list" href="products.html">Butterscotch</a></li>
                                        <li><a class="list" href="products.html">Strawberry</a></li>
                                        <li><a class="list" href="products.html">Vanilla</a></li>
                                        <li><a class="list" href="products.html">Eggless Cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Theme</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Heart shaped</a></li>
                                        <li><a class="list" href="products.html">Cartoon Cakes</a></li>
                                        <li><a class="list" href="products.html">2-3 Tier Cakes</a></li>
                                        <li><a class="list" href="products.html">Square shape</a></li>
                                        <li><a class="list" href="products.html">Round shape</a></li>
                                        <li><a class="list" href="products.html">Photo cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>Weight</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">1 kG</a></li>
                                        <li><a class="list" href="products.html">1.5 kG</a></li>
                                        <li><a class="list" href="products.html">2 kG</a></li>
                                        <li><a class="list" href="products.html">3 kG</a></li>
                                        <li><a class="list" href="products.html">4 kG</a></li>
                                        <li><a class="list" href="products.html">Large</a></li>
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
                                        <li><a class="list" href="products.html">Friend</a></li>
                                        <li><a class="list" href="products.html">Lover</a></li>
                                        <li><a class="list" href="products.html">Sister</a></li>
                                        <li><a class="list" href="products.html">Brother</a></li>
                                        <li><a class="list" href="products.html">Kids</a></li>
                                        <li><a class="list" href="products.html">Parents</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Flavour</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Chocolate</a></li>
                                        <li><a class="list" href="products.html">Mixed Fruit</a></li>
                                        <li><a class="list" href="products.html">Butterscotch</a></li>
                                        <li><a class="list" href="products.html">Strawberry</a></li>
                                        <li><a class="list" href="products.html">Vanilla</a></li>
                                        <li><a class="list" href="products.html">Eggless Cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>By Theme</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">Heart shaped</a></li>
                                        <li><a class="list" href="products.html">Cartoon Cakes</a></li>
                                        <li><a class="list" href="products.html">2-3 Tier Cakes</a></li>
                                        <li><a class="list" href="products.html">Square shape</a></li>
                                        <li><a class="list" href="products.html">Round shape</a></li>
                                        <li><a class="list" href="products.html">Photo cakes</a></li>
                                    </ul>
                                </div>
                                <div class="col-sm-3">
                                    <h4>Weight</h4>
                                    <ul class="multi-column-dropdown">
                                        <li><a class="list" href="products.html">1 kG</a></li>
                                        <li><a class="list" href="products.html">1.5 kG</a></li>
                                        <li><a class="list" href="products.html">2 kG</a></li>
                                        <li><a class="list" href="products.html">3 kG</a></li>
                                        <li><a class="list" href="products.html">4 kG</a></li>
                                        <li><a class="list" href="products.html">Large</a></li>
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
                <%
                    if (session.getAttribute("user") == null){
                        out.print("<div id=\"loginBox\">\n" +
                                "    <form action=\"/user/login\" method=\"post\" id=\"loginForm\">\n" +
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
                                "        <p>New User ? <a class=\"sign\" href=\"account.html\">Sign Up</a> <span><a href=\"\" data-toggle=\"modal\" data-target=\"#exampleModal\" data-whatever=\"@mdo\">Forgot your password?</a></span></p>\n" +
                                "    </form>\n" +
                                "</div>");
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
            <div class="header-right cart">
                <a href="#"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
                <script>
                    $(function(){
                        num(1,2);
                        function num(num,pric){
                            var $div=$('<div class="cart-box">');
                            var $h4=$('<h4><a href="checkout.html"> <span class="simpleCart_total" id="price_tag"> pric</span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> num </span>) </a></h4>');
                            var $p=$('<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>');
                            var $div1=$('<div class="clearfix"> </div>');
                            $h4.appendTo($div);$p.appendTo($div);$div1.appendTo($div);
                            $div.appendTo($("#baba1"));
                        }
                    });

                </script>
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
<!--account-->
<form action="/user/register" class="form-group" method="post" id="personinform">
    <div class="account">
        <div class="container">
            <div class="register">

                <div class="register-top-grid">
                    <h3>Personal information</h3>
                    <div class="input">
                        <span>First Name<label>*</label></span>
                        <input type="text" class="form-control" onkeyup="addInputClass('firstname')" name="firstname">
                    </div>
                    <div class="input">
                        <span>Last Name<label>*</label></span>
                        <input type="text" class="form-control" onkeyup="addInputClass('lastname')" name="lastname">
                    </div>
                    <div class="input">
                        <span>Email Address<label>*</label><label id="mailJd" style="color: red;"></label></span>
                        <input type="text" class="form-control" id="mail" onkeyup="check()" name="email">
                    </div>
                    <div class="input">
                        <span>Phone Number<label>*</label></span>
                        <input type="text" class="form-control" onkeyup="addInputClass('phonenumber')" name="phonenumber">
                    </div>
                    <div class="input">
                        <span>Address<label>*</label></span>
                        <input type="text" class="form-control" onkeyup="addInputClass('address')" name="address" >
                    </div>
                    <a class="news-letter" href="#">
                        <label class="checkbox"><input type="checkbox" class="form-control" name="checkbox" checked=""><i> </i>Sign Up for Newsletter</label>
                    </a>
                    <div class="clearfix">  </div>
                </div>
                <div class="register-bottom-grid">
                    <h3>Login information</h3>

                    <div class="input">
                        <span>Password<label>*</label></span>
                        <input type="password" class="form-control" name="password" id="pwd"  maxlength="12"  placeholder="please set password 6~12" >
                    </div>
                    <div class="input">
                        <span>Confirm Password<label>*</label></span>
                        <input type="password" class="form-control" id="pwd1" name="pwd1" placeholder="please check your password" onkeyup="validate()"><span id="tishi"></span>
                    </div>
                    <div class="input">
                        <span>CAPTCHA<label>*</label></span>
                        <input type="text"  name="vcode" id="vcode" >
                        <img id="registerCode" src="" width="80" height="30">
                    </div>
                    <script>
                        $(document).ready(function () {
                            $("#registerCode").prop("src", "/image/registerVcode?time=" + (new Date()).getTime());
                            $("#registerCode").click(function () {
                                $("#registerCode").prop("src", "/image/registerVcode?time=" + (new Date()).getTime());
                            });
                        });
                    </script>
                </div>
                <div class="clearfix"> </div>
                <div class="register-but">
                    <input type="submit" value="submit" id="button">
                    <div class="clearfix"> </div>

                </div>
            </div>
        </div>
    </div>
</form>
<!--//account-->
<!--footer-->
<div class="footer">
    <div class="container">
        <div class="footer-grids">
            <div class="col-md-2 footer-grid">
                <h4>company</h4>
                <ul>
                    <li><a href="products.html">products</a></li>
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
            </ul>>
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
</body>
</html>
