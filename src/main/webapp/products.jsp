<%@ page import="com.cake.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: root
  Date: 19-7-27
  Time: 下午2:49
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
    <title>Products</title>
    <!-- Custom Theme files -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //Custom Theme files -->
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
    <!-- js -->
    <script src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
    <!-- //js -->
    <!-- cart -->
    <script src="js/simpleCart.min.js"> </script>
    <!-- cart -->
    <!-- the jScrollPane script -->
    <script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
    <script type="text/javascript" id="sourcecode">
        $(function()
        {
            $('.scroll-pane').jScrollPane();
        });
    </script>
    <!-- //the jScrollPane script -->
    <script type="text/javascript" src="js/jquery.mousewheel.js"></script>
    <script>
        function thing(productId, imgurl,name,pricenow,pricepre,discount) {
            var $divzong=$("#classparent");

            var $div = $("<div class='product-grid'></div>");
            var $a = $("<a href=\"toSingle?productId=" + productId + "\">");
            var $div1 = $("<div class=\"more-product\"><span> </span></div>");
            var $div2 = $("<div class=\"product-img b-link-stripe b-animate-go  thickbox\">");
            var $img1=$("<img src=" + imgurl + " class=\"img-responsive\" alt=\"\">");
            var $div3 = $("<div class='b-wrapper'></div>");
            var $h=$("<h4 class=\"b-animate b-from-left  b-delay03\">");
            var $button=$("<button>View</button>");
            var $div4 = $("<div class='product-info simpleCart_shelfItem'></div>");
            var $div5 = $("<div class='product-info-cust prt_name'></div>");
            var $h1 =$("<h4>"+name +"</h4>");
            var $span=$("<span class=\"item_price\">$"+pricenow+"</span>");
            var $div6 = $("<div class='ofr'></div>");
            var $p = $("<p class=\"pric1\"><del>$"+pricepre+"</del></p>");
            var $p1 = $("<p class=\"disc\">["+discount+"% off]</p>");
            var input =$("<input type=\"text\" class=\"item_quantity\" value=\"1\" />");
            var input1 =$("<input type=\"button\" class=\"item_add items\" value=\"Add\">");
            var $div7 = $("<div class=\"clearfix\"> </div>");

            $p.appendTo($div6);
            $p1.appendTo($div6);
            $h1.appendTo($div5);
            $span.appendTo($div5);
            $div6.appendTo($div5);
            input.appendTo($div5);
            input1.appendTo($div5);
            $div7.appendTo($div5);
            $div5.appendTo($div4);
            $button.appendTo($h);
            $h.appendTo($div3);
            $div3.appendTo($div2);
            $img1.appendTo($div2);
            $div2.appendTo($a);
            $div1.appendTo($a);
            $a.appendTo($div);
            $div4.appendTo($div);
            $div.appendTo($divzong);
        }
    </script>
    <script>
        function addElement(result){
            $("#classparent").empty();
            console.log(result.extend.products);
            for (var i = 0; i < result.extend.products.length; i++) {
                var price =  result.extend.products[i].price;
                var discount = result.extend.products[i].discount;
                var realPrice = (parseInt(price))* (parseInt(discount)) / 100;
                realPrice = parseInt(realPrice);
                thing( result.extend.products[i].id ,"http://120.79.249.199/"+result.extend.products[i].photopath, result.extend.products[i].name, realPrice, price, discount);
            }
        }
        $(document).ready(function(){
            $.ajax({
                url : "<%=basePath %>product/allProduct",
                type : "post",
                dataType : "json",
                success : function(result){
                    addElement(result);
                },
                error : function (e) {
                    console.log(e);
                    alert("连接失败");
                }

            });
        });
    </script>
    <!-- the mousewheel plugin -->
</head>
<body>
<!--header-->
<div class="header">
    <div class="cont0ainer">
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
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--//header-->
<!--products-->
<div class="products">
    <div class="container">
        <h2>Our Products</h2>
        <div class="col-md-9 product-model-sec" id="classparent">

        </div>
        <div class="col-md-3 rsidebar span_1_of_left">

            <section  class="sky-form">
                <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>DISCOUNTS</h4>
                <div class="row row1 scroll-pane">
                    <div class="col col-4">
                        <label class="checkbox"><input type="radio" ><i dis="dis" minDis="10" maxDis="100" onclick="addName(this)"></i>Upto - 10%</label>
                    </div>
                    <div class="col col-4main">
                        <label class="checkbox"><input type="radio" ><i dis="dis" minDis="60" maxDis="70" onclick="addName(this)"></i>70% - 60%</label>
                        <label class="checkbox"><input type="radio" ><i dis="dis" minDis="40" maxDis="50" onclick="addName(this)"></i>50% - 40%</label>
                        <label class="checkbox"><input type="radio" ><i dis="dis" minDis="20" maxDis="30" onclick="addName(this)"></i>30% - 20%</label>
                        <label class="checkbox"><input type="radio" ><i dis="dis" minDis="5" maxDis="10" onclick="addName(this)"></i>10% - 5% </label>
                        <label class="checkbox"><input type="radio" ><i dis="dis" name="check"  minDis="0" maxDis="100" onclick="addName(this)"></i>Other</label>
                    </div>
                    <script>
                        sendSearCh = {
                            minDis : "0",
                            maxDis : "100",
                            minPrice : 0,
                            maxPrice : 300
                        };
                        function addName(ths) {
                            $("i[dis='dis']").attr("name", "null");
                            $(ths).attr("name", "check");
                            searchProduct();
                        }
                        function searchProduct() {
                            var minDis = $("i[name='check']").attr("minDis");
                            var maxDis = $("i[name='check']").attr("maxDis");
                            var data = {
                                minDis : minDis,
                                maxDis : maxDis,
                                minPrice : minPrice,
                                maxPrice : maxPrice
                            };
                            if (sendSearCh.maxDis == data.maxDis && sendSearCh.minDis == data.minDis && sendSearCh.maxPrice == data.maxPrice && sendSearCh.minPrice == data.minPrice)
                                return ;
                            sendSearCh = data;
                            $.ajax({
                                url : "<%= basePath%>product/searchProduct",
                                type : "post",
                                data : sendSearCh,
                                datatype:"JSON",
                                success : function (result) {
                                    addElement(result);
                                },
                                error : function (e) {
                                    console.log(e);
                                    alert("连接失败");
                                }
                            })
                        }
                    </script>
                </div>
            </section>
            <section  class="sky-form">
                <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Price</h4>
                <ul class="dropdown-menu1">
                    <li>
                        <a href="">
                            <div id="slider-range"></div>
                            <input type="text" id="amount" style="border: 0; font-weight: NORMAL;   font-family: 'Dosis-Regular';" />
                        </a>
                    </li>
                </ul>
            </section>
            <!---->
            <script type="text/javascript" src="js/jquery-ui.min.js"></script>
            <link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
            <script type='text/javascript'>//<![CDATA[
            minPrice = 0;
            maxPrice = 300;
            $(window).load(function(){
                $("#slider-range").hover(function () {

                }, function () {
                    searchProduct();
                })
                $( "#slider-range" ).slider({
                    range: true,
                    min: 0,
                    max: 300,
                    values: [ 0, 100000 ],
                    slide: function( event, ui ) {
                        $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
                        minPrice = ui.values[0];
                        maxPrice = ui.values[1];
                    }
                });
                $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) + " - $" + $( "#slider-range" ).slider( "values", 1 ) );

            });//]]>
            </script>
            <!---->
            <section  class="sky-form">
                <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>By Flavour</h4>
                <div class="row row1 scroll-pane">
                    <div class="col col-4">
                        <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Vanilla</label>
                    </div>
                    <div class="col col-4">
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Chocolate</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Butterscotch</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Strawberry</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Black Forest</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Mixed Fruit</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Honey</label>
                    </div>
                </div>
            </section>
            <section  class="sky-form">
                <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Weight</h4>
                <div class="row row1 scroll-pane">
                    <div class="col col-4">
                        <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Half KG</label>
                    </div>
                    <div class="col col-4">
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>One KG</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>TwO KG</label>
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>More</label>
                    </div>
                </div>
            </section>

        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--//products-->
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
                    <li><a href="contact.jsp">Contact Us</a></li>
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
<!--//footer-->
<div class="footer-bottom">
    <div class="container">
        <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
</div>
</body>
</html>