<%@page import="utilities.Utilities"%>
<%@include file="header.jsp" %>
<title>Bootstrap demo</title>
</head>
<body>
    <%@include file="menu.jsp" %>
    <!--Content-->
<body>
    <%
        String otp = "";
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;
        }
        if (ispostback) {
            otp = Utilities.otp(5);
        }
    %>
    <center>
    <h1>Booking App</h1>


    <form method="post"><input name="check" type="hidden"/>
        mobile no. <input type="number" value="<%=otp%>">   
        <br>
        <input name="option" type="submit" value="otp">
        <br>
        mobile otp <input type="number">
        <br>
        <input type="submit">
        <br>
    </form>
</body>
</html>
</center>
<%@include  file="footer.jsp" %>